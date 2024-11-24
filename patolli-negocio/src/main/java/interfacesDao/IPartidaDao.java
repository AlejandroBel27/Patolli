/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacesDao;

import exceptions.Exceptions;
import entidades.Partida;
/**
 *
 * @author Equipo 1
 */
public interface IPartidaDao {
    /**
     * Metodo que crea la partida.
     * @param partida
     * @throws Exceptions Comentario de exception regresado.
     */
    public void crearPartida(Partida partida)throws Exceptions;
    /**
     * Metodo que actualiza la partida.
     * @param partida
     * @throws Exceptions Comentario de exception regresado.
     */
    public void actualizarPartida(Partida partida)throws Exceptions;
    /**
     * Metodo que elimina la partida.
     * @param partida
     * @throws Exceptions Comentario de exception regresado.
     */
    public void EliminarPartida(Partida partida)throws Exceptions;
    
}
