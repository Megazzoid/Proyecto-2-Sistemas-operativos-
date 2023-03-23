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
    static AdminDiego admin;
    public static int tiempo = 4;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        administrador = new Administrador();
        procesador = new Procesador();
        admin = new AdminDiego();
        Interfaz  interfaz = new Interfaz();
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
        String text = "";
        
        Thread.sleep(3000);
        
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
                       
            admin.SerieDiego();
            text = admin.prio1.printCola();
            interfaz.setTextColaDiego1(text);
            text = admin.prio2.printCola();
            interfaz.setTextColaDiego2(text);
            text = admin.prio3.printCola();
            interfaz.setTextColaDiego3(text);
            
            procesador.RevisarSeries(administrador.prioridad1, administrador.prioridad2, administrador.prioridad3, administrador.refuerzo, 
            admin.prio1, admin.prio2, admin.prio3, admin.prioRef);
            text = administrador.refuerzo.printQueue();
            interfaz.setTextColaKevin4(text);
          
        
        Thread.sleep(tiempo *1000);  
        }
        
    }
    
}
