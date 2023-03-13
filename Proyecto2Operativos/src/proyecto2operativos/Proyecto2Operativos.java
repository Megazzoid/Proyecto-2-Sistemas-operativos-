/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2operativos;

/**
 *
 * @author kevin
 */
public class Proyecto2Operativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        QueueKevin queueVIP = new QueueKevin();
        queueVIP.enqueue("Hola");
        queueVIP.enqueue("Saludos");
        queueVIP.enqueue("Loco");
        QueueNodeKevin aux = queueVIP.poll();

        QueueNodeKevin pAux = queueVIP.getpFirst();
        while(pAux != null){
            System.out.println(pAux.getData());
            pAux = pAux.getpNext();
        }
        
        System.out.println(aux.getData());
        
    }
    
}
