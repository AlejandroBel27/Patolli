/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tcp.comun;

import com.tcp.comun.Message;

/**
 *
 * @author  Equipo 1
 */
public interface TemplateConnection {

    default void proccessMessage(Message message) {
        switch (message.getMessageType()) {
            case CONNECT ->onConectarse(message);
            case CREATE_ROOM ->onCrearSala(message);
            case JOIN ->onUnirseSala(message);
            case PASAR_OPCIONES ->onPasarOpciones(message);
            case PASAR_CAMBIOS ->onPasarCambios(message);
            case PASAR_JUGADORES ->onPasarJugadores(message);
            case DISCONNECT ->onDisconnect(message);
                
        }

    }

    void onConectarse(Message message);

    void onCrearSala(Message message);

    void onUnirseSala(Message message);

    void onPasarOpciones(Message message);

    void onPasarJugadores(Message message);

    void onPasarCambios(Message message);

    default void onDisconnect(Message message) {}
}
