/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import java.util.List;

public class Mensajero {

    /**
     * metodo que se dedica a difundir el mensaje.
     *
     * @param clientes lista de clientes
     * @param mensaje Mensaje arojado.
     */
    public static void difundirMensaje(List<ClienteManager> clientes, String mensaje) {
        for (ClienteManager cliente : clientes) {
            try {
                cliente.getOut().println(mensaje);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
