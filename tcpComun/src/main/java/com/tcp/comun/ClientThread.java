/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcp.comun;
import logins.IchatLogger;
import logins.LogFactory;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import entidades.Jugador;
import java.io.IOException;

/**
 *
 * @author Equipo 
 */
public class ClientThread extends Observable implements Runnable,Serializable{

    private final Socket clientSocket;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private final IchatLogger logger = LogFactory.getLogger(getClass());
    private Jugador jugador;
    private boolean connected;

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    
    
    public ClientThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
        this.connected = true;
        this.jugador = new Jugador();
        initializeStreams();
    }
    
     private void initializeStreams() {
        try {
            out = new ObjectOutputStream(clientSocket.getOutputStream());
            in = new ObjectInputStream(clientSocket.getInputStream());
        } catch (IOException e) {
            logger.error("Error al inicializar flujos: " + e.getMessage());
            connected = false;
        }
    }
     
      private void processMessage() throws Exception{
        while (connected) {
            Message mensaje = (Message) in.readObject();
            if (mensaje.getMessageType() == MessageType.DISCONNECT) {
                connected = false;
                disconnect();
            }
            notifyObservers(mensaje);
        }
    }
      public void sendMessage(Message message) {
        if (message != null) {
            System.out.println("Mensaje enviado: " + message.getMessageType());
        }
        try {
            out.writeObject(message);
            out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
            logger.error(ex.getMessage());
        }
    }

    public void disconnect() {
        try {
            sendMessage(new Message.Builder().sender(jugador).messageType(MessageType.DISCONNECT).build());
            connected = false;
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
     
    @Override
    public void notifyObservers(Object obj) {
        observers.forEach(o -> o.onUpdate(obj));
    }

    @Override
    public void run() {
        try {
            processMessage();
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error(ex.getMessage());
        }
    }
    
}
