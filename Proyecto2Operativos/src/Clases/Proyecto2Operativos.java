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
    public static int tiempo = 10;
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
        String text1, text2, text3, text4, text1D, text2D, text3D, text4D, texto, texto1 = "";
        

        
        while (true) {
           texto = "Actualizando colas...";
           int contador = 0;
           contador = contador + 1;
           interfaz.setTextColaDiegoAI(Integer.toString(contador));
           interfaz.setTextColaDiegoAdmin(texto);
            Thread.sleep(3000);
            texto1 = "-------------------------------";

            
            administrador.SalirRefuerzoKevin();
            administrador.aumentarContadorKevin(administrador.prioridad3, administrador.prioridad2);
            administrador.aumentarContadorKevin(administrador.prioridad2, administrador.prioridad1);
            
            admin.SalirRefuerzoDiego();
            admin.aumentarContadorDiego(admin.prio3, admin.prio2);
            admin.aumentarContadorDiego(admin.prio2, admin.prio1);
            
            procesador.RevisarSeries(administrador.prioridad1, administrador.prioridad2, administrador.prioridad3, administrador.refuerzo);
            
            procesador.RevisarDiego(admin.prio1,admin.prio2,admin.prio3,admin.prioRef);
                       
            admin.SerieDiego();
            
            text1D = admin.prio1.getData();
            interfaz.setTextColaDiego1(text1D);
            text2D = admin.prio2.getData();
            interfaz.setTextColaDiego2(text2D);
            text3D = admin.prio3.getData();
            interfaz.setTextColaDiego3(text3D);
            text4D = admin.prioRef.getData();
            interfaz.setTextColaDiego4(text4D);
            
            
            administrador.crearSerieKevin();
            
            text2 = administrador.prioridad1.getData();
            interfaz.setTextColaKevin1(text2);
            System.out.println("Cola1"+text2);
            text3 = administrador.prioridad2.getData();
            interfaz.setTextColaKevin2(text3);
            System.out.println("Cola2"+text3);
            text4 = administrador.prioridad3.getData();
            interfaz.setTextColaKevin3(text4);
            System.out.println("Cola3"+text4);
            text1 = administrador.refuerzo.getData();
            interfaz.setTextColaKevin4(text1);
            System.out.println("Cola4"+text1);
            
            
            
            interfaz.setTextColaDiegoAdmin(texto1);
        
        Thread.sleep(tiempo*1000);  
        }
        
    }
    
}
