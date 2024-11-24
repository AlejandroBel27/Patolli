/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pendiente;

/**
 *
 * @author alejandrobel
 */
public class Partida {
    private int idPartida;
    private boolean estado;

    public Partida() {
    }

    public Partida(int idPartida, boolean estado) {
        this.idPartida = idPartida;
        this.estado = estado;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
