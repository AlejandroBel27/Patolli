/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcp.comun;

/**
 *
 * @author  Equipo 1
 */
public enum MessageType {
    CONNECT(1),
    DISCONNECT(2),
    CREATE_ROOM(3),
    JOIN(4),
    PASAR_OPCIONES(5),
    PASAR_CAMBIOS(6),
    PASAR_JUGADORES(7);
    private final int type;
    private MessageType (int type){
        this.type=type;
    }
}
