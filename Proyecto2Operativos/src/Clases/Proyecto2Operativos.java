/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import Interfaz.Interfaz;

/**
 *
 * @author kevin
 */
public class Proyecto2Operativos {

    static Administrador administrador;
    static Procesador procesador;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        administrador = new Administrador();
        procesador = new Procesador();
        Interfaz  interfaz = new Interfaz();
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
        String text = "";
        
        
        while (true) {
            administrador.crearSerieKevin();
            text = administrador.prioridad1.printQueue();
            interfaz.setTextColaKevin1(text);
            text = administrador.prioridad2.printQueue();
            interfaz.setTextColaKevin2(text);
            text = administrador.prioridad3.printQueue();
            interfaz.setTextColaKevin3(text);
            administrador.aumentarContadorKevin(administrador.prioridad3, administrador.prioridad2);
            administrador.aumentarContadorKevin(administrador.prioridad2, administrador.prioridad1);
            
            
        Thread.sleep(2000);  
        }
        
    }
    
}
