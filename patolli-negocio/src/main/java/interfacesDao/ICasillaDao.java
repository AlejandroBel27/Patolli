/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacesDao;

import entidades.Casilla;
import exceptions.Exceptions;
/**
 *
 * @author Equipo 1
 */
public interface ICasillaDao {
    /**
     * Metodo que registra una casilla.
     * @param casilla 
     * @throws Exceptions Comentario de exception regresado.
     */
    public void registrarCasilla(Casilla casilla) throws Exceptions;
    /**
     * Metodo que actualiza una casilla.
     * @param casilla 
     * @throws Exceptions Comentario de exception regresado.
     */
    public void actualizarCasilla(Casilla casilla) throws Exceptions;
    
    /**
     * Metodo que elimina una casilla.
     * @param casilla 
     * @throws Exceptions Comentario de exception regresado.
     */
    public void EliminarCasilla(Casilla casilla) throws Exceptions;
}
