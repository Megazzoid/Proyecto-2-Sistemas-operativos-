/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaz.Combate;
import Interfaz.Interfaz;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kevin
 */
public class Procesador {
    
    SerieKevin temp;
    SerieDiego temp2;
  

    public Procesador() {
        
    }
    
    public void Pelear(SerieKevin temp,SerieDiego temp2,Combate combate){
        
        
        
        combate.setTextColaKevinPelea(temp.NombreEpisodio);
        combate.setTextColaDiegoPelea(temp2.episodio);
        
    }

    public void RevisarSeries(QueueKevin QueueKevin1, QueueKevin QueueKevin2, QueueKevin QueueKevin3, QueueKevin QueueKevinRefuerzo, QueueKevin QueueKevinPelea,
            ColaDiego ColaDiego1,ColaDiego ColaDiego2,ColaDiego ColaDiego3,ColaDiego ColaDiegoRefuerzo,ColaDiego ColaDiegoPelea ,Interfaz interfaz, Combate combate) {

        int prob = new Random().nextInt(100);
     
            if (prob < 80) {
                if(!QueueKevin1.isVacio()){
                      temp = QueueKevin1.extraer();      
                        

                    }
                    else if(!QueueKevin2.isVacio()){
                        temp = QueueKevin2.extraer();  
                        


                    }else if(!QueueKevin3.isVacio()){
                        temp = QueueKevin3.extraer();
                    }
                        
                else{
                        System.out.println("No paso"); 
                    }
                
            if(!ColaDiego1.isEmpty()){
                       temp2 = ColaDiego1.Desencolar();
                        
                    }
                        else if (!ColaDiego2.isEmpty()){
                       temp2 = ColaDiego2.Desencolar();
                        
                    }else if(!ColaDiego3.isEmpty()){
                       temp2 = ColaDiego3.Desencolar();
                        
                    }
                    else{
                        System.out.println("No paso"); 
                    }
                if(temp == null){
                  
                }else{
                    Pelear(temp,temp2,combate); 
                }
                  

      
            } else if (prob >= 81 && prob <= 95) {
                
                if(!QueueKevin1.isVacio()){
                        temp = QueueKevin1.extraer();      
                        QueueKevin1.insertar(temp);
                        interfaz.setidKevin(Integer.toString(temp.id));

                    }
                    else if(!QueueKevin2.isVacio()){
                        temp = QueueKevin2.extraer();  
                        QueueKevin2.insertar(temp);
                        interfaz.setidKevin(Integer.toString(temp.id));


                    }else if(!QueueKevin3.isVacio()){
                        temp = QueueKevin3.extraer();
                        QueueKevin3.insertar(temp); 
                        interfaz.setidKevin(Integer.toString(temp.id));
                    }
                else{
                        System.out.println("No paso"); 
                    }
                
            if(!ColaDiego1.isEmpty()){
                        temp2 = ColaDiego1.Desencolar();
                        ColaDiego1.Encolar(temp2);
                        interfaz.setidDiego(Integer.toString(temp2.id));

                    }
                        else if (!ColaDiego2.isEmpty()){
                        temp2 = ColaDiego2.Desencolar();
                        ColaDiego2.Encolar(temp2);
                        interfaz.setidDiego(Integer.toString(temp2.id));

                    }else if(!ColaDiego3.isEmpty()){
                        temp2 = ColaDiego3.Desencolar();
                        ColaDiego3.Encolar(temp2);    
                        interfaz.setidDiego(Integer.toString(temp2.id));
                    }
                    else{
                        System.out.println("No paso"); 
                    }
                
            } else {
                    
                if(!QueueKevin1.isVacio()){
                        temp = QueueKevin1.extraer();
                        temp.prioridad = 4;
                        
                        QueueKevinRefuerzo.insertar(temp);
                        interfaz.setidKevin(Integer.toString(temp.id));
                        

                    }
                    else if(!QueueKevin2.isVacio()){
                        temp = QueueKevin2.extraer();
                        temp.prioridad = 4;
                        
                        QueueKevinRefuerzo.insertar(temp);
                        interfaz.setidKevin(Integer.toString(temp.id));


                    }else if(!QueueKevin3.isVacio()){
                        temp = QueueKevin3.extraer();
                        temp.prioridad = 4;
                        
                        QueueKevinRefuerzo.insertar(temp);
                        interfaz.setidKevin(Integer.toString(temp.id));
                        
                        
                    }else{
                        System.out.println("No paso"); 
                    }    
 
                   if(!ColaDiego1.isEmpty()){
                        temp2 = ColaDiego1.Desencolar();
                        temp2.prio = 4;
                        ColaDiegoRefuerzo.Encolar(temp2);
                        interfaz.setidDiego(Integer.toString(temp2.id));
                    } else if (!ColaDiego2.isEmpty()){
                        temp2 = ColaDiego2.Desencolar();
                        temp2.prio = 4;
                        
                        ColaDiegoRefuerzo.Encolar(temp2);
                        interfaz.setidDiego(Integer.toString(temp2.id));

                    }else if(!ColaDiego3.isEmpty()){
                        temp2 = ColaDiego3.Desencolar();
                        temp2.prio = 4;
                        
                        ColaDiegoRefuerzo.Encolar(temp2);
                        interfaz.setidDiego(Integer.toString(temp2.id));
                    }
                   else{
                        System.out.println("No paso"); 
                    }  
                        
                    
            }  
            
        }
        
    }


