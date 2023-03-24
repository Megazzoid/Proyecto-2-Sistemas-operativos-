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
     
            if (prob < 1) {
      
            } else if (prob >= 40 && prob <= 67) {
                
                if(!QueueKevin1.isVacio()){
                        SerieKevin temp = QueueKevin1.extraer();      
                        QueueKevin1.insertar(temp);

                    }
                    else if(!QueueKevin2.isVacio()){
                        SerieKevin temp = QueueKevin2.extraer();  
                        QueueKevin2.insertar(temp);


                    }else if(!QueueKevin3.isVacio()){
                        SerieKevin temp = QueueKevin3.extraer();
                        QueueKevin3.insertar(temp);    
                    } 
                    else if(!ColaDiego1.isEmpty()){
                        SerieDiego temp = ColaDiego1.Desencolar();
                        ColaDiego1.Encolar(temp);

                    }
                        else if (!ColaDiego2.isEmpty()){
                        SerieDiego temp = ColaDiego2.Desencolar();
                        ColaDiego2.Encolar(temp);

                    }else if(!ColaDiego3.isEmpty()){
                        SerieDiego temp = ColaDiego3.Desencolar();
                        ColaDiego3.Encolar(temp);               
                    }
                    else{
                        System.out.println("No paso"); 
                    }
                
            } else {
                    
                if(!QueueKevin1.isVacio()){
                        SerieKevin temp = QueueKevin1.extraer();
                        temp.prioridad = 4;
                        
                        QueueKevinRefuerzo.insertar(temp);

                    }
                    else if(!QueueKevin2.isVacio()){
                        SerieKevin temp = QueueKevin2.extraer();
                        temp.prioridad = 4;
                        
                        QueueKevinRefuerzo.insertar(temp);


                    }else if(!QueueKevin3.isVacio()){
                        SerieKevin temp = QueueKevin3.extraer();
                        temp.prioridad = 4;
                        
                        QueueKevinRefuerzo.insertar(temp);
 
                    } else if(!ColaDiego1.isEmpty()){
                        SerieDiego temp = ColaDiego1.Desencolar();
                        temp.prio = 4;
                        ColaDiegoRefuerzo.Encolar(temp);
                    } else if (!ColaDiego2.isEmpty()){
                        SerieDiego temp = ColaDiego2.Desencolar();
                        temp.prio = 4;
                        
                        ColaDiegoRefuerzo.Encolar(temp);

                    }else if(!ColaDiego3.isEmpty()){
                        SerieDiego temp = ColaDiego3.Desencolar();
                        temp.prio = 4;
                        
                        ColaDiegoRefuerzo.Encolar(temp);
                    }
                        
                    else{
                        System.out.println("No paso"); 
                    }
            }  
            
        }
        
    }


