

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
    QueueKevin pelea;
    private int Idaux;
    Random rand = new Random();
    int contador = 0;
    int contadoradicinal = 0;
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
    
    List<String> valores = Arrays.asList("Rick Sanchez", "Rick Primer", "Morty Smith", "Beth Smith", "Meeseks", "SrPAntalones de popo",
            "Summer Smith", "Jessica", "Beta7", "Coleccionista de especies", "Pedo", "Nancy", "Mujer Pajaro", "Rick Simple", "Lady Katana", "Rick Malvado");

    
     public Administrador() {
        this.prioridad1 = new QueueKevin();
        this.prioridad2 = new QueueKevin();
        this.prioridad3 = new QueueKevin();
        this.refuerzo = new QueueKevin();
        this.pelea = new QueueKevin();
        this.Idaux = 1;
    }
    
     public  String crearSerieKevin(){
        
        contador = 0;
        int indice = rand.nextInt(episodios.size());
        String episodio = episodios.get(indice);
        
        int personajes = rand.nextInt(valores.size());
        
        String personaje = valores.get(personajes);
        
        int intinicio = new Random().nextInt(100);
                
        if (intinicio > 84){
            inicio = "Calidad";
            contador = contador + 1;
        }else{
            inicio = "No Calidad";
        }
        
        int intintro = new Random().nextInt(100);
        
        if (intintro > 75){
            intro = "Calidad";
            contador = contador + 1;
        }else{
            intro = "No Calidad";
        }
        
        int intcierre = new Random().nextInt(100);
        
        if (intcierre > 80){
            cierre = "Calidad";
            contador = contador + 1;
        }else{
            cierre = "No Calidad";
        }
        
        int intcreditos = new Random().nextInt(100);
        
        if (intcreditos > 85){
            creditos = "Calidad";
            contador = contador + 1;
        }else{
            creditos = "No Calidad";
        }
        
         
        
      //  SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux, prioridad, 0);
      
        
        if( contador  == 0){
           
           int numeroAleatorio = random.nextInt(60) + 1;
            
           SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux,3,0,intro, inicio,cierre,creditos,contador,personaje,episodio,numeroAleatorio);
           this.prioridad3.insertar(SerieEstudio1); 
            
            
            
        }else if(contador > 0 && contador < 3){
            
            int numeroAleatorio = random.nextInt(30) + 60;
           
            SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux,2,0,intro, inicio,cierre,creditos,contador,personaje,episodio,numeroAleatorio);
            this.prioridad2.insertar(SerieEstudio1); 
            
            
        }else{
            
            int numeroAleatorio = random.nextInt(31) + 90;
            SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux,1,0,intro, inicio,cierre,creditos,contador,personaje,episodio,numeroAleatorio);   
            this.prioridad1.insertar(SerieEstudio1); 
            
        }
        
        this.Idaux++;
        
        return "";     
    }
     
    public String retornarInfoKevin(QueueKevin cola){
        String texto = cola.getData();
        return texto;
    }
    
    
    
    public void cicloRevision(){
        if(contadoradicinal == 2){
            
            
            int intrevision = new Random().nextInt(100);
            if (intrevision < 70){

                                contador = 0;
                        int indice = rand.nextInt(episodios.size());
                        String episodio = episodios.get(indice);

                        int personajes = rand.nextInt(valores.size());

                        String personaje = valores.get(personajes);


                        int intinicio = new Random().nextInt(100);

                        if (intinicio > 84){
                            inicio = "Calidad";
                            contador = contador + 1;
                        }else{
                            inicio = "No Calidad";
                        }

                        int intintro = new Random().nextInt(100);

                        if (intintro > 75){
                            intro = "Calidad";
                            contador = contador + 1;
                        }else{
                            intro = "No Calidad";
                        }

                        int intcierre = new Random().nextInt(100);

                        if (intcierre > 80){
                            cierre = "Calidad";
                            contador = contador + 1;
                        }else{
                            cierre = "No Calidad";
                        }

                        int intcreditos = new Random().nextInt(100);

                        if (intcreditos > 85){
                            creditos = "Calidad";
                            contador = contador + 1;
                        }else{
                            creditos = "No Calidad";
                        }



                      //  SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux, prioridad, 0);


                        if( contador  == 0){

                           int numeroAleatorio = random.nextInt(60) + 1;

                           SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux,3,0,intro, inicio,cierre,creditos,contador,episodio,personaje,numeroAleatorio);
                           this.prioridad3.insertar(SerieEstudio1); 



                        }else if(contador > 0 && contador < 3){

                            int numeroAleatorio = random.nextInt(30) + 60;

                            SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux,2,0,intro, inicio,cierre,creditos,contador,episodio,personaje,numeroAleatorio);
                            this.prioridad2.insertar(SerieEstudio1); 


                        }else{

                            int numeroAleatorio = random.nextInt(31) + 90;
                            SerieKevin SerieEstudio1 = new SerieKevin(this.Idaux,1,0,intro, inicio,cierre,creditos,contador,episodio,personaje,numeroAleatorio);   
                            this.prioridad1.insertar(SerieEstudio1); 

                        }

                        this.Idaux++; 
                        contadoradicinal  = 0;

            }else{
                
                contadoradicinal = 2;
            }

        }
        else{
            contadoradicinal++;
        }
        
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
    
        public void SalirRefuerzoKevin(){
        
        int numeroAleatorio = random.nextInt(100);   
        
        if(numeroAleatorio<=40){
            
            if(!this.refuerzo.isVacio()){
            
                SerieKevin temp = this.refuerzo.extraer();
                temp.inicio = "Calidad";
                temp.intro = "Calidad";
                temp.cierre = "Calidad";
                temp.creditos = "Calidad";
                
          
                    prioridad1.insertar(temp);

  
        }
            
        }else{
            System.out.println("Se quedo");
        }
    }
        
        public void EntrarPeleaKevin(){
        
            if(!this.pelea.isVacio()){
            
                SerieKevin temp = this.prioridad1.extraer();
                pelea.insertar(temp);
            
        }else{
            System.out.println("Se quedo");
        }
    }
    
    
}

