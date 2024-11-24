/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exceptions;

/**
 *
 * @author alejandrobel
 */
public class Exceptions extends Exception {

    /**
     * Creates a new instance of <code>Exceptions</code> without detail message.
     */
    public Exceptions() {
    }

    /**
     * Constructs an instance of <code>Exceptions</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public Exceptions(String msg) {
        super(msg);
    }
    /**
     * Exception con causa.
     * @param msg
     * @param cause 
     */
    public Exceptions(String msg, Throwable cause) {
        super(msg, cause);
    }
}
