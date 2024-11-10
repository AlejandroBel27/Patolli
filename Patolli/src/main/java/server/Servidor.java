package server;


import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author cocob
 */
public class Servidor {
    private static final int PORT = 5050;
    private static List<clienteManage> clientes = new ArrayList<>();
    
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)){
            
            System.out.println("El servidor a iicializado en el puerto "+ PORT);
            
            while (true) {                
                Socket clienteSocket = serverSocket.accept();
                System.out.println("jugador conectado: "+clienteSocket.getInetAddress());
                
                //manejador de cliente y se añade a la lista
                clienteManage  clienteManage = new clienteManage (clienteSocket);
                clientes.add(clienteManage);
                clienteManage.start();
     
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    private static class clienteManage extends Thread{
        private Socket clienteSocket;
        private PrintWriter out;
        private BufferedReader in;
        
        public clienteManage(Socket socket) {
            this.clienteSocket = socket;
        }
        
        public  void run(){
            
            try{
                out = new PrintWriter(clienteSocket.getOutputStream(),true);
                in = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
                
                String mensaje;
                while((mensaje = in.readLine()) !=null){
                    System.out.println("mensaje recibido de cliente: "+mensaje);
                    mensajeDifusion("jugador dice: "+mensaje);
                }
            }catch(IOException e){
                e.printStackTrace();
            }finally {
                try{
                    clienteSocket.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        private void mensajeDifusion (String mensaje){
            for (clienteManage cliente : clientes) {
                System.out.println(mensaje);
            }
        }
    }
    
}
