/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacesDao;
import entidades.Jugador;
import exceptions.Exceptions;
/**
 *
 * @author Equipo 1
 */
public interface IJugadorDao {
    /**
     * Metodo que genera el registro de jugador
     * @param jugador
     * @throws Exceptions Comentario de exception regresado.
     */
    public void registrarJugador(Jugador jugador) throws Exceptions;
    /**
     * Metodo que actualiza jugador
     * @param jugador
     * @throws Exceptions Comentario de exception regresado.
     */
    public void actulizaJugador(Jugador jugador)throws Exceptions;
    /**
     * Metodo para eliminar a un jugador
     * @param jugador
     * @throws Exceptions Comentario de exception regresado.
     */
    public void eliminarJugador(Jugador jugador) throws Exceptions;
}
