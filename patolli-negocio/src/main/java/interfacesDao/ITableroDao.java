/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacesDao;

import exceptions.Exceptions;
import entidades.Tablero;
/**
 *
 * @author Equipo 1
 */
public interface ITableroDao {
    /**
     * Metodo que inicia el tablero.
     * @param tablero
     * @throws Exceptions Comentario de exception regresado.
     */
    public void iniciarTablero(Tablero tablero)throws Exceptions;
   /**
    * Metodo que actualiza el tablero.
    * @param tablero
    * @throws Exceptions Comentario de exception regresado.
    */
    public void actualizarTablero(Tablero tablero)throws Exceptions;
    /**
     * Metodo que elimina el tablero.
     * @param tablero
     * @throws Exceptions Comentario de exception regresado.
     */
    public void EliminarTablero(Tablero tablero)throws Exceptions;
}
