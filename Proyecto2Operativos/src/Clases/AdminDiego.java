/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaz.Interfaz;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author danma
 */
public class AdminDiego {
    ColaDiego prio1;
    ColaDiego prio2;
    ColaDiego prio3;
    ColaDiego prioRef;
    private int ID;
     Random rand = new Random();
    int contador = 0;
    int contadoradicinal = 0;
    String inicio;
    String intro;
    String creditos;
    String cierre;
    String Texto = "";
    int tiempo;
    Random random = new Random();
    
        List<String> episodios = Arrays.asList("Buscando las Semillas", "Invasión Canina", "Parque Anatómico",
                "La Simulación Alienígena", "Meeseeks Destructores", "La Poción de Rick", "Criando un Gazorpazorp",
                "Televisión Interdimensional", "Cosas Necesarias", "Encuentros Cercanos a lo Rick", "Es Hora de la Fiesta",
                "Rupturas en el Tiempo", "Morty Escapa de Noche", "Asimilación Autoerótica", "Rick, Vengador del Futuro",
                "Ponte Ricoso", "Los Ricks Deben Estar Locos", "Problemas con Mini-Rick");
    
    List<String> valores = Arrays.asList("Rick Sanchez", "Rick Primer", "Morty Smith", "Beth Smith", "Meeseks", "SrPAntalones de popo",
            "Summer Smith", "Jessica", "Beta7", "Coleccionista de especies", "Pedo", "Nancy", "Mujer Pajaro", "Rick Simple", "Lady Katana", "Rick Malvado");
    
    public AdminDiego(){
        this.prio1 = new ColaDiego();
        this.prio2 = new ColaDiego();
        this.prio3 = new ColaDiego();
        this.prioRef = new ColaDiego();
        this.ID = 1;
    }
    
    public String SerieDiego(){
        
        contador = 0;
        int prob1 = new Random().nextInt(100);
        int prob2 = new Random().nextInt(100);
        int prob3 = new Random().nextInt(100);
        int prob4 = new Random().nextInt(100);
        
        if (prob1 < 75){
            inicio = "Calidad";
            contador = contador +1;
        } else {
            inicio = "No calidad";      
        }
        
         if (prob2 < 84){
            intro = "Calidad";
            contador = contador +1;
        } else {
            intro = "No calidad";      
        }

            if (prob3 < 80){
            cierre = "Calidad";
            contador = contador +1;
        } else {
            cierre = "No calidad";      
        }
            
            if (prob4 < 75){
            creditos = "Calidad";
            contador = contador +1;
        } else {
            creditos = "No calidad";      
        }
            
        int indice = rand.nextInt(episodios.size());
        
        String episodio = episodios.get(indice);
        
        int personajes = rand.nextInt(valores.size());
        
        String personaje = valores.get(personajes);
            
        
        if (contador == 0){
            int numeroAleatorio = random.nextInt(60)+1;
            SerieDiego SerieEstudio2 = new SerieDiego (this.ID, 3,0, intro, inicio,cierre,creditos,contador,episodio,personaje,numeroAleatorio);

            this.prio3.Encolar(SerieEstudio2);
        } else if (contador > 0 && contador < 3){
            int numeroAleatorio = random.nextInt(30)+60;
            SerieDiego SerieEstudio2 = new SerieDiego (this.ID, 2,0, intro, inicio,cierre,creditos,contador,episodio,personaje,numeroAleatorio);
             this.prio2.Encolar(SerieEstudio2);
        } else {
            int numeroAleatorio = random.nextInt(31)+90;
            SerieDiego SerieEstudio2 = new SerieDiego (this.ID, 1,0, intro, inicio,cierre,creditos,contador,episodio,personaje,numeroAleatorio);
             this.prio1.Encolar(SerieEstudio2);
        }
                
        this.ID++;
        return "";
        
       
    }
    
    public String MandarInfoDiego(ColaDiego cola){
        String text = cola.getData();
        return text;
    }
    
        public void aumentarContadorDiego(ColaDiego ColaDiego1, ColaDiego ColaDiego2){

            if(!ColaDiego1.isEmpty()){
            for(int i=0; i < ColaDiego1.getSize(); i++){
                SerieDiego temp =ColaDiego1.Desencolar();
                temp.contador++;
                System.out.println(contador);
                if(temp.contador >= 7){
                    temp.contador = 0;
                    ColaDiego2.Encolar(temp);
                }else{
                   ColaDiego1.Encolar(temp);
                   
                }
            }
              
        }

    }
        
        public void SalirRefuerzoDiego(){
        
        int numeroAleatorio = random.nextInt(100);   
        
        if(numeroAleatorio<=40){
            
            if(!this.prioRef.isEmpty()){
            
                SerieDiego temp = this.prioRef.Desencolar();
                temp.inicio = "Calidad";
                temp.intro = "Calidad";
                temp.cierre = "Calidad";
                temp.creditos = "Calidad";
                
                if(temp.prio == 1){
                    prio1.Encolar(temp);

                }else if(temp.prio == 2){
                    prio2.Encolar(temp);
                }else{
                    prio3.Encolar(temp);
                }
              
        }
            
        }else{
            System.out.println("Se quedo");
        }
    }

        

    
}
