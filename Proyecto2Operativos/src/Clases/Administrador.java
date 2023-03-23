

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
    Random rand = new Random();
    int contador = 0;
    String inicio;
    String intro;
    String creditos;
    String cierre;
    int tiempo;
    Random random = new Random();
    
    List<String> episodios = Arrays.asList("Buscando las Semillas", "Invasión Canina", "Parque Anatómico",
                "La Simulación Alienígena", "Meeseeks Destructores", "La Poción de Rick", "Criando un Gazorpazorp",
                "Televisión Interdimensional", "Cosas Necesarias", "Encuentros Cercanos a lo Rick", "Es Hora de la Fiesta",
                "Rupturas en el Tiempo", "Morty Escapa de Noche", "Asimilación Autoerótica", "Rick, Vengador del Futuro",
                "Ponte Ricoso", "Los Ricks Deben Estar Locos", "Problemas con Mini-Rick");
    
     public Administrador() {
        this.prioridad1 = new QueueKevin();
        this.prioridad2 = new QueueKevin();
        this.prioridad3 = new QueueKevin();
        this.refuerzo = new QueueKevin();
        this.Idaux = 1;
    }
    
     public  String crearSerieKevin(){
        
        contador = 0;
        int indice = rand.nextInt(episodios.size());
        String episodio = episodios.get(indice);
        
        boolean boolinicio = rand.nextBoolean();
        
        if (boolinicio == true){
            inicio = "Calidad";
            contador = contador + 1;
        }else{
            inicio = "No Calidad";
        }
        
        boolean boolintro = rand.nextBoolean();
        
        if (boolintro == true){
            intro = "Calidad";
            contador = contador + 1;
        }else{
            intro = "No Calidad";
        }
        
        boolean boolcierre = rand.nextBoolean();
        
        if (boolcierre == true){
            cierre = "Calidad";
            contador = contador + 1;
        }else{
            cierre = "No Calidad";
        }
        
        boolean boolcreditos = rand.nextBoolean();
        
        if (boolcreditos == true){
            creditos = "Calidad";
            contador = contador + 1;
        }else{
            creditos = "No Calidad";
        }
        
         
        
      //  SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux, prioridad, 0);
        
        System.out.println(contador);
        System.out.println(boolcreditos);
        System.out.println(boolcierre);
        System.out.println(boolintro);
        System.out.println(boolinicio);
        
        if( contador  == 0){
           
           int numeroAleatorio = random.nextInt(60) + 1;
            
           SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux,3,0,intro, inicio,cierre,creditos,contador,episodio,episodio,numeroAleatorio);
           this.prioridad3.insertar(SerieEstudio1); 
            
            
            
        }else if(contador > 0 && contador < 3){
            
            int numeroAleatorio = random.nextInt(30) + 60;
           
            SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux,2,0,intro, inicio,cierre,creditos,contador,episodio,episodio,numeroAleatorio);
            this.prioridad2.insertar(SerieEstudio1); 
            
            
        }else{
            
            int numeroAleatorio = random.nextInt(31) + 90;
            SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux,1,0,intro, inicio,cierre,creditos,contador,episodio,episodio,numeroAleatorio);   
            this.prioridad1.insertar(SerieEstudio1); 
            
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

