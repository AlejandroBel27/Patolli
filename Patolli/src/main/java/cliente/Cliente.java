package cliente;

import java.io.*;
import java.net.*;

/**
 *
 * @author cocob
 */
public class Cliente {
    
    private static final String SERVER_ADRESS = "localhost";
    private static final int SERVER_PORT = 5050;
    
    public static void main(String[] args) {
        try (Socket socket = new Socket (SERVER_ADRESS,SERVER_PORT);
                PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {
                
                System.out.println("Conectando al servidor de patolli....");
                
                Thread reciboHilo =  new Thread  (() -> {
                    String mensajeServidor;
                    try{
                        while((mensajeServidor = in.readLine()) != null ){
                        System.out.println("Mensaje del servidor:  "+ mensajeServidor);
                        
                    }
                    }catch (IOException e){
                        e.printStackTrace();
                        }
                });
                reciboHilo.start();
                String usuarioEntrada;
                while((usuarioEntrada = stdIn.readLine())!= null){
                    System.out.println(usuarioEntrada);
                }
        }catch(IOException e){
            e.printStackTrace();
        }
                
        
    }
    
    
}
