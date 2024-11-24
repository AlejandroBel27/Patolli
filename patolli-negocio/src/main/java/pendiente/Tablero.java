/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pendiente;

import java.util.List;

/**
 *
 * @author cocob
 */
public class Tablero {
    
    private int tamaño;
    private int dado;
    private List<Integer> PosicionesOcupadas;

    public Tablero() {
    }

    public Tablero(int tamaño, int dado, List<Integer> PosicionesOcupadas) {
        this.tamaño = tamaño;
        this.dado = dado;
        this.PosicionesOcupadas = PosicionesOcupadas;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public List<Integer> getPosicionesOcupadas() {
        return PosicionesOcupadas;
    }

    public void setPosicionesOcupadas(List<Integer> PosicionesOcupadas) {
        this.PosicionesOcupadas = PosicionesOcupadas;
    }

    
    
    
    
}
