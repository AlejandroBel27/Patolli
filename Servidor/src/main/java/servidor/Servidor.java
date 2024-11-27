package servidor;

/**
 * Clase principal que representa el servidor. Maneja múltiples conexiones de
 * clientes y retransmite mensajes entre ellos.
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Servidor {

    // Puerto en el que el servidor escuchará las conexiones de los clientes.
    private static final int PORT = 5050;
    // Lista que almacena los manejadores de los clientes conectados al servidor.
    private static List<ClienteManager> clientes = new ArrayList<>();

    /**
     * Inicializa el servidor.
     * @throws IOException 
     */
    public void iniciar() throws IOException {
        // Intenta crear un servidor en el puerto especificado.
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("El servidor ha iniciado en el puerto " + PORT);
            // Bucle infinito para aceptar conexiones entrantes de clientes.
            while (true) {
                // Espera a que un cliente se conecte y obtiene el socket correspondiente.
                Socket clienteSocket = serverSocket.accept();
                System.out.println("Jugador conectado: " + clienteSocket.getInetAddress());
                // Crea un nuevo manejador para el cliente conectado.
                ClienteManager cliente = new ClienteManager(clienteSocket, clientes);
                clientes.add(cliente);
                cliente.start();
            }
        } catch (Exception e) {
            System.err.println("Error en el servidor: " + e.getMessage());
            throw e;
        }
    }
}
