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
    
    public void Pelear(SerieKevin temp,SerieDiego temp2,Interfaz interfaz){
        
       
 
        interfaz.setKevinPelea("\n"+"\n"+"ID:"+temp.id+"\n"+"\n"+"Nombre del episodio: "+temp.NombreEpisodio+"\n"+"\n"+" Nombre del personaje: "+temp.Nombrepersonaje);
        interfaz.setDiegoPelea("\n"+"\n"+"ID:"+temp2.id+"\n"+"\n"+"Nombre del episodio: "+temp2.episodio+"\n"+"\n"+ "Nombre del personaje: "+temp2.personaje);
        
        if(temp.totalcalidad>temp2.calidad){
            interfaz.setGanador(temp.NombreEpisodio);
        }else if(temp.totalcalidad< temp2.calidad){
            interfaz.setGanador(temp2.episodio);
        }else{
            if(temp.tiempo>temp2.tiempo){
            interfaz.setGanador(temp.NombreEpisodio);
        }else{
            interfaz.setGanador(temp2.episodio);
        }
        
    }
    }

    public void RevisarSeries(QueueKevin QueueKevin1, QueueKevin QueueKevin2, QueueKevin QueueKevin3, QueueKevin QueueKevinRefuerzo, QueueKevin QueueKevinPelea,
            ColaDiego ColaDiego1,ColaDiego ColaDiego2,ColaDiego ColaDiego3,ColaDiego ColaDiegoRefuerzo,ColaDiego ColaDiegoPelea ,Interfaz interfaz, Combate combate) {
        
        interfaz.setDiegoPelea("");
        interfaz.setKevinPelea("");
        interfaz.setGanador("");
        int prob = new Random().nextInt(100);
     
            if (prob < 40) {
                if(!QueueKevin1.isVacio()){
                      temp = QueueKevin1.extraer();      
                      interfaz.setidKevin(Integer.toString(temp.id));  

                    }
                    else if(!QueueKevin2.isVacio()){
                        temp = QueueKevin2.extraer(); 
                        interfaz.setidKevin(Integer.toString(temp.id));
                        


                    }else if(!QueueKevin3.isVacio()){
                        temp = QueueKevin3.extraer();
                        interfaz.setidKevin(Integer.toString(temp.id));
                    }
                        
                else{
                        System.out.println("No paso"); 
                    }
                
            if(!ColaDiego1.isEmpty()){
                       temp2 = ColaDiego1.Desencolar();
                       interfaz.setidDiego(Integer.toString(temp2.id));
                        
                    }
                        else if (!ColaDiego2.isEmpty()){
                       temp2 = ColaDiego2.Desencolar();
                       interfaz.setidDiego(Integer.toString(temp2.id));
                        
                    }else if(!ColaDiego3.isEmpty()){
                       temp2 = ColaDiego3.Desencolar();
                       interfaz.setidDiego(Integer.toString(temp2.id));
                        
                    }
                    else{
                        System.out.println("No paso"); 
                    }
                if(temp == null){
                  
                }else{
                    Pelear(temp,temp2,interfaz); 
                }
                  

      
            } else if (prob >= 40 && prob <= 77) {
                
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


