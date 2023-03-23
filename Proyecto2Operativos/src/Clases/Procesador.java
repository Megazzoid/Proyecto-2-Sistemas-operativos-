/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kevin
 */
public class Procesador {
  

    public Procesador() {
        
    }

    public String RevisarSeries() {

        int prob = new Random().nextInt(100);
        try {
            //Esperar los 10 segundos
            Thread.sleep(1000);
            
            
            if (prob < 40) {
            
            Thread.sleep(100);    
            //codigo de salir del mercado    
                
            } else if (prob >= 40 && prob <= 67) {
             
            Thread.sleep(100);    
                
            // Empatar 
               
            } else {
            
            //Enviar esfuerzo     
            Thread.sleep(100);
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Procesador.class.getName()).log(Level.SEVERE, null, ex);
            return ex.toString();
        }
        return null;
    }

}
