/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacesDao;

import entidades.Ficha;
import exceptions.Exceptions;

/**
 *
 * @author Equipo 1
 */
public interface IFichaDao {
    
    /**
     * Metodo que genera la ficha.
     * @param ficha 
     * @throws Exceptions Comentario de exception regresado.
     */
    public void crearFicha(Ficha ficha) throws Exceptions;
    /**
     * Metodo para actualizar ficha.
     * @param ficha
     * @throws Exceptions Comentario de exception regresado.
     */
    public void actualizarFicha(Ficha ficha) throws Exceptions;
    /**
     * Metodo para eliminar Ficha.
     * @param ficha
     * @throws Exceptions Comentario de exception regresado.
     */
    public void EliminarFicha(Ficha ficha)throws Exceptions;
    
    
}
