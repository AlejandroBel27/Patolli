/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tcp.comun;

/**
 *
 * @author  Equipo 1
 */
public interface IConnection {
    void sendMessage(Message mensaje);
    void init();
    default void disconnect(){};
}
