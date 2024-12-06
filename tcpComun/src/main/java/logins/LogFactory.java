/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logins;

/**
 *
 * @author  Equipo 1
 */
public class LogFactory {
    public static IchatLogger getLogger(Class c){
        return ChatLogProxy.getInstance(c);
    }
}
