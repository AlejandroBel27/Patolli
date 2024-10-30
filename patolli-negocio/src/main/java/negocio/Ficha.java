/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author Equipo 1
 */
public class Ficha extends Jugador{
    
    private Jugador jugador;
    private String color;
    private int casilla;

    public Ficha() {
    }

    public Ficha(Jugador jugador, String color, int casilla) {
        this.jugador = jugador;
        this.color = color;
        this.casilla = casilla;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCasilla() {
        return casilla;
    }

    public void setCasilla(int casilla) {
        this.casilla = casilla;
    }
    
}
