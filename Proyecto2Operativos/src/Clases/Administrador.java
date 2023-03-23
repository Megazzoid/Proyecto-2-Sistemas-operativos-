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
    
     public  String crearSerieKevin(){
        int prioridad = (int)(Math.random()*3 + 1);
        SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux, prioridad, 0);
        this.Idaux++;
        
        
        
        if( prioridad== 1){
           
            this.prioridad1.insertar(SerieEstudio1);    
            
            
            
        }else if(prioridad== 2){
           
            this.prioridad2.insertar(SerieEstudio1);
            
            
        }else{
            
            this.prioridad3.insertar(SerieEstudio1);    
            
            
        }
     
 
        return "";     
    }
     
    public String retornarInfoKevin(QueueKevin cola){
        String texto = cola.getData();
        return texto;
    }
    
    public void aumentarContadorKevin(QueueKevin QueueKevin1, QueueKevin QueueKevin2){
        
       
            if(!QueueKevin1.isVacio()){
            for(int i=0; i < QueueKevin1.getTamanio(); i++){
                SerieKevin temp = QueueKevin1.extraer();
                temp.contador++;
                if(temp.contador >= 7){
                    temp.contador = 0;

                    QueueKevin2.insertar(temp);
                }else{
  
                    QueueKevin1.insertar(temp);
                   
                }
            }
              
        }
            
   
    }
    
}
