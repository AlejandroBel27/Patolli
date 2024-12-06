/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcp.comun;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author gilbert
 */
public abstract class Observable {
    protected List<IObserver> observers = new ArrayList<>();

    public void subscribe(IObserver observer) {
        this.observers.add(observer);
    }

    public void unsubscribe(IObserver observer) {
        this.observers.remove(observer);
    }

    public abstract void notifyObservers(Object obj);   
}
