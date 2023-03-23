/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kevin
 */
public class Administrador {
    
    QueueKevin prioridad1;
    QueueKevin prioridad2;
    QueueKevin prioridad3;
    QueueKevin refuerzo;
    private int Idaux;
    
     public Administrador() {
        this.prioridad1 = new QueueKevin();
        this.prioridad2 = new QueueKevin();
        this.prioridad3 = new QueueKevin();
        this.refuerzo = new QueueKevin();
        this.Idaux = 1;
    }
    
     public String crearSerieKevin(){
        int prioridad = (int)(Math.random()*3 + 1);
        SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux, prioridad, 0);
        this.Idaux++;
        switch(SerieEstudio1.getPrioridad()){
            case 1:
                this.prioridad1.enqueue(SerieEstudio1);
                return "Agregado Serie Estudio 1 " + SerieEstudio1.getId() + " - Prioridad: " + prioridad;
            case 2:
                this.prioridad2.enqueue(SerieEstudio1);
                return "Agregado Serie Estudio 1 " + SerieEstudio1.getId() + " - Prioridad: " + prioridad;
            case 3:
                this.prioridad3.enqueue(SerieEstudio1);
                return "Agregado Serie Estudio 1" + SerieEstudio1.getId() + " - Prioridad: " + prioridad;
        }
        return "";     
    }
     
    public String retornarInfoKevin(QueueKevin cola){
        String texto = cola.printQueue();
        return texto;
    }
    
    public void aumentarContadorKevin(QueueKevin QueueKevin1, QueueKevin QueueKevin2){
        
       
            if(QueueKevin1.getpFirst() != null){
            for(int i=1; i < QueueKevin1.getSize(); i++){
                SerieKevin temp = QueueKevin1.peek();
                temp.setContador(temp.getContador()+1);
                if(temp.getContador() >= 7){
                    temp.setContador(0);
                    temp.setPrioridad(temp.getPrioridad()-1);
                    QueueKevin1.dequeue();
                    QueueKevin2.enqueue(temp);
                }else{
                    QueueKevin1.dequeue();
                    QueueKevin1.enqueue(temp);
                   
                }
            }
            QueueKevin1.getpFirst().getData().setContador(QueueKevin1.getpFirst().getData().getContador()+1);   
        }
            
   
    }
    
}
