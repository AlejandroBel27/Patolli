package socket;

import java.io.*;
import java.net.*;

/**
 * Clase que representa un cliente que se conecta a un servidor.
 * Permite enviar y recibir mensajes del servidor de forma interactiva.
 * 
 * @author equipo 1
 */
public class Cliente {
    
    // Dirección del servidor (puede ser localhost o una IP remota)
    private static final String SERVER_ADRESS = "localhost";
    // Puerto del servidor al que el cliente se conectará
    private static final int SERVER_PORT = 5050;
    
    public static void main(String[] args) {
        // Establece la conexión al servidor y configura los streams
        try (Socket socket = new Socket(SERVER_ADRESS, SERVER_PORT);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  // Stream para enviar datos al servidor
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Stream para recibir datos del servidor
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) { // Stream para leer entrada del usuario
            
            System.out.println("Conectado al servidor de Patolli.");
            
            // Hilo que maneja la recepción de mensajes del servidor
            Thread reciboHilo = new Thread(() -> {
                String mensajeServidor;
                try {
                    // Lee continuamente los mensajes enviados por el servidor
                    while ((mensajeServidor = in.readLine()) != null) {
                        System.out.println("Mensaje del servidor: " + mensajeServidor);
                    }
                } catch (IOException e) {
                    // Maneja errores en la recepción de datos
                    e.printStackTrace();
                }
            });
            reciboHilo.start(); // Inicia el hilo de recepción
            
            String usuarioEntrada;
            // Lee la entrada del usuario y la envía al servidor
            while ((usuarioEntrada = stdIn.readLine()) != null) {
                out.println(usuarioEntrada); // Envía el mensaje al servidor
            }
        } catch (IOException e) {
            // Maneja errores de conexión o de entrada/salida
            e.printStackTrace();
        }
    }
}

