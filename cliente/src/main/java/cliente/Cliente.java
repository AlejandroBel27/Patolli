/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;


import java.io.*;
import java.net.Socket;

public class Cliente {

    private final String servidorDireccion;
    private final int puerto;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private boolean conectado;

    public Cliente(String servidorDireccion, int puerto) {
        this.servidorDireccion = servidorDireccion;
        this.puerto = puerto;
    }

    public void conectar() {
        try {
            socket = new Socket(servidorDireccion, puerto);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            conectado = true;

            System.out.println("Conectado al servidor.");

            // Hilo para recibir mensajes del servidor
            Thread reciboHilo = new Thread(() -> {
                try {
                    String mensaje;
                    while (conectado && (mensaje = in.readLine()) != null) {
                        System.out.println("Mensaje del servidor: " + mensaje);
                        // Aquí puedes enviar el mensaje a la GUI, por ejemplo:
                        // TableroClienteGUI.actualizarMensaje(mensaje);
                    }
                } catch (IOException e) {
                    if (conectado) {
                        System.err.println("Conexión cerrada por el servidor.");
                    }
                } finally {
                    desconectar();
                }
            });
            reciboHilo.start();

        } catch (IOException e) {
            System.err.println("Error al conectar con el servidor: " + e.getMessage());
        }
    }

    public void enviarMensaje(String mensaje) {
        if (conectado && out != null) {
            out.println(mensaje);
        }
    }

    public void desconectar() {
        conectado = false;
        try {
            if (socket != null) socket.close();
            if (in != null) in.close();
            if (out != null) out.close();
            System.out.println("Desconectado del servidor.");
        } catch (IOException e) {
            System.err.println("Error al desconectar: " + e.getMessage());
        }
    }
}
