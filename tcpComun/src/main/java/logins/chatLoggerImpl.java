/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logins;

import java.io.Serializable;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author  Equipo 1
 */
public class chatLoggerImpl implements IchatLogger, Serializable {

    private static IchatLogger instance;
    private Class clazz;
    private Logger logger;

    private chatLoggerImpl(Class clazz) {
        this.clazz = clazz;
        this.logger = Logger.getLogger(clazz.getName());
    }
    public static IchatLogger getInstance(Class clazz) {
        return instance != null ? instance : (instance = new chatLoggerImpl(clazz));
    }

    @Override
    public void log(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void error(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void inf(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void advertencia(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
