package socket;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que representa el servidor. Este servidor acepta múltiples
 * conexiones de clientes, maneja la comunicación entre ellos y retransmite
 * mensajes.
 *
 * @author equipo 1
 */
public class Servidor {

    // Puerto en el que el servidor escuchará las conexiones
    private static final int PORT = 5050;

    // Lista para almacenar los manejadores de los clientes conectados
    private static List<clienteManage> clientes = new ArrayList<>();

    public static void main(String[] args) {
        // Creación del servidor
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("El servidor ha iniciado en el puerto " + PORT);

            // Bucle infinito para aceptar conexiones entrantes
            while (true) {
                // Espera una conexión de cliente
                Socket clienteSocket = serverSocket.accept();
                System.out.println("Jugador conectado: " + clienteSocket.getInetAddress());

                // Crea un manejador para el cliente conectado y lo añade a la lista
                clienteManage clienteManage = new clienteManage(clienteSocket);
                clientes.add(clienteManage);

                // Inicia el hilo del cliente
                clienteManage.start();
            }
        } catch (Exception e) {
            // Manejo de excepciones generales del servidor
            e.printStackTrace();
        }
    }

    /**
     * Clase interna que maneja la comunicación con un cliente individual.
     * Extiende la clase Thread para manejar la conexión en un hilo separado.
     */
    private static class clienteManage extends Thread {

        private Socket clienteSocket; // Socket del cliente conectado
        private PrintWriter out;      // Para enviar datos al cliente
        private BufferedReader in;    // Para recibir datos del cliente

        /**
         * Constructor para inicializar el manejador del cliente con su socket.
         *
         * @param socket Socket del cliente conectado
         */
        public clienteManage(Socket socket) {
            this.clienteSocket = socket;
        }

        /**
         * Método principal del hilo que gestiona la interacción con el cliente.
         */
        public void run() {
            try {
                // Inicializa las herramientas de entrada y salida
                out = new PrintWriter(clienteSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));

                String mensaje;
                // Bucle para leer mensajes del cliente
                while ((mensaje = in.readLine()) != null) {
                    System.out.println("Mensaje recibido de cliente: " + mensaje);

                    // Difunde el mensaje a todos los clientes conectados
                    mensajeDifusion("Jugador dice: " + mensaje);
                }
            } catch (IOException e) {
                // Manejo de errores durante la comunicación con el cliente
                e.printStackTrace();
            } finally {
                // Asegura el cierre del socket del cliente
                try {
                    clienteSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /**
         * Método para difundir un mensaje a todos los clientes conectados.
         *
         * @param mensaje El mensaje que se quiere enviar
         */
        private void mensajeDifusion(String mensaje) {
            for (clienteManage cliente : clientes) {
                try {
                    // Envia el mensaje a cada cliente
                    cliente.out.println(mensaje);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
