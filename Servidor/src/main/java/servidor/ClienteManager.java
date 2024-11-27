
package servidor;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class ClienteManager extends Thread {

    private Socket clienteSocket;
    private PrintWriter out;
    private BufferedReader in;
    private List<ClienteManager> clientes;
    
    /**
     * Constructor que genera en base a un socket y una lista de clientes
     * @param socket socket de servidor.
     * @param clientes Lista de clientes.
     */
    public ClienteManager(Socket socket, List<ClienteManager> clientes) {
        this.clienteSocket = socket;
        this.clientes = clientes;
    }
    
    /**
     * Metodo que corre el servidor.
     */
    @Override
    public void run() {
        try {
            out = new PrintWriter(clienteSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));

            String mensaje;
            while ((mensaje = in.readLine()) != null) {
                System.out.println("Mensaje recibido de cliente: " + mensaje);
                Mensajero.difundirMensaje(clientes, "Jugador dice: " + mensaje);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
    }
    /**
     * Metodo que cierra la conexino.
     */
    private void cerrarConexion() {
        try {
            clienteSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PrintWriter getOut() {
        return out;
    }
}

