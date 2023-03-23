/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * Descripcion: Clase Cola 
 * @author Kevin Hernandez
 * Fecha: 13/03/2023
 */
public class QueueKevin {
     int tamanio;
    Nodo cabeza;
    Nodo cola;

    //Constructor
    public QueueKevin() {
        this.cabeza = null;
        this.cola = null;
        this.tamanio = 0;
    }
    
    //Es vacio
    public boolean isVacio() {
        return this.tamanio == 0;
    }
    
    //Obtener tamaño
    public int getTamanio() {
        return tamanio;
    }
    
    //Insertar en la cola
    public void insertar(SerieKevin c) {
        Nodo n = new Nodo(c);
        if (isVacio()) {
            this.cabeza = n;
            this.cola = n;
            tamanio++;
        } else {
            cola.pSiguiente = n;
            cola = n;
            tamanio++;
        }
    }
    
    //Extraer de la cola
    public SerieKevin extraer() {
        if(!isVacio()){
            SerieKevin first = cabeza.data;
            if(cabeza==cola){
                cabeza=null;
                cola=null;
                tamanio--;
            }else{
                cabeza = cabeza.pSiguiente;
                tamanio--;
            }
            return first;
        }else{
            return null;
        }
    }
    
    //Transforma la cola a String
    public String getData(){
        Nodo h = this.cabeza;
        String text="";
         while (h != null) {
            SerieKevin temp = h.data;
            text = text + "ID: " + temp.id + " - PRIORIDAD: " + temp.prioridad + " - CONTADOR:" + temp.contador + "\n";
            h = h.pSiguiente;
        }
        return text;
    }
    
    public class Nodo {    
    //Variables de Nodo
        SerieKevin data;
        Nodo pSiguiente;
    //Constructor
    public Nodo(SerieKevin c) {        
        this.data = c;
        this.pSiguiente = null;
    

    }}
}

    
    
   
