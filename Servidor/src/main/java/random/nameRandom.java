/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package random;

import java.util.Random;

/**
 *
 * @author  Equipo 1
 */
public class nameRandom {
    
    public static String generarNombreRandom(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder nombre = new StringBuilder();
        Random random = new Random();
 
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(caracteres.length());
            nombre.append(caracteres.charAt(index));
        }

        return nombre.toString();
    }
    
}
