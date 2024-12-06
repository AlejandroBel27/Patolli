/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcp.comun;

import entidades.Jugador;
import java.io.Serializable;
/**
 *
 * @author gilbert
 */
public class Message implements Serializable {
      private MessageType messageType; 
    private MessageBody content;          
    private Jugador sender;          
    private Jugador receiver;
    
    /**
     * Constructor de message
     * @param messageType
     * @param content
     * @param sender
     * @param receiver 
     */
    public Message(MessageType messageType, MessageBody content, Jugador sender, Jugador receiver) {
        this.messageType = messageType;
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public MessageBody getContent() {
        return content;
    }

    public void setContent(MessageBody content) {
        this.content = content;
    }

    public Jugador getSender() {
        return sender;
    }

    public void setSender(Jugador sender) {
        this.sender = sender;
    }

    public Jugador getReceiver() {
        return receiver;
    }

    public void setReceiver(Jugador receiver) {
        this.receiver = receiver;
    }
    /**
     * Builder para mensajes.
     */
    public static class Builder {
        
        private Jugador receiver;
        private MessageType messageType;
        private MessageBody content;
        private Jugador sender;

        public Builder() {}
        
        public Builder body(MessageBody content) {
            this.content = content;
            return this;
        }
        
        public Builder sender(Jugador sender) {
            this.sender = sender;
            return this;
        }
        
        public Builder receiver(Jugador receiver) {
            this.receiver = receiver;
            return this;
        }
        
        public Builder messageType(MessageType messageType) {
            this.messageType = messageType;
            return this;
        }
        
        public Message build() {
            return new Message(this.messageType, this.content, this.sender, this.receiver);
        }
    }
    
}
