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

    public void RevisarSeries(QueueKevin QueueKevin1, QueueKevin QueueKevin2, QueueKevin QueueKevin3, QueueKevin QueueKevinRefuerzo,
            ColaDiego ColaDiego1,ColaDiego ColaDiego2,ColaDiego ColaDiego3,ColaDiego ColaDiegoRefuerzo) {

        int prob = new Random().nextInt(100);
     
            if (prob < 40) {
      
            } else if (prob >= 40 && prob <= 67) {
                
            } else {
            

                    if(QueueKevin1.getpFirst() != null){
                        SerieKevin temp = QueueKevin1.peek();
                        QueueKevin1.dequeue();
                        QueueKevinRefuerzo.enqueue(temp);

                    }
                    else if(QueueKevin2.getpFirst() != null){
                        
                        SerieKevin temp = QueueKevin2.peek();
                        QueueKevin2.dequeue();
                        QueueKevinRefuerzo.enqueue(temp);

                    }else if(QueueKevin3.getpFirst() != null){
                        SerieKevin temp = QueueKevin3.peek();
                        QueueKevin3.dequeue();
                        QueueKevinRefuerzo.enqueue(temp);
                    }
                    else{
                        
                    }
            }  
            
        }
        
        
    }


