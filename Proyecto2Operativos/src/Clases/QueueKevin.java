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
public class QueueKevin <T> {
    private QueueNodeKevin pFirst; 
    private QueueNodeKevin pLast;
    private int size; 

    public QueueKevin() {
        this.pFirst = null;
        this.pLast = null;
        this.size =0;
    }

    public void enqueue (SerieKevin data){
        QueueNodeKevin pAux = new QueueNodeKevin(data);
        if (this.isEmpty()){
            this.pFirst = pAux;
            this.pLast = pAux;
        } else {
            this.pLast.setpNext(pAux);
            this.pLast = pAux;
        }
        this.size +=1; 
    }
    
    public void dequeue () {
        if (this.pFirst != null){
            this.pFirst = this.pFirst.getpNext();
            this.size --;
        } else {
            this.pLast = null;
            this.size = 0;
        }
    }
    
    public SerieKevin peek (){
        return this.pFirst.getData();
    }
    
     public String printQueue(){
        QueueNodeKevin aux = this.pFirst;
        String text="";
         while (aux != null) {
            SerieKevin temp = (SerieKevin) aux.getData();
            text = text + "ID: " + temp.getId() + " - PRIORIDAD: " + temp.getPrioridad() + " - CONTADOR:" + temp.getContador() + "\n";
            aux = aux.getpNext();
        }
        return text;
    }
    
    public SerieKevin poll(){
        QueueNodeKevin pAux = this.getpFirst();
         if (this.pFirst != null){
            this.pFirst = this.pFirst.getpNext();
            this.size --;
            return pAux.getData();
        } else {
            this.pLast = null;
            return null;
        }
    }
    
    public boolean isEmpty(){
        return this.pFirst == null & this.pLast == null;
    }
    /**
     * @return the pFirst
     */
    public QueueNodeKevin getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(QueueNodeKevin pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public QueueNodeKevin getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(QueueNodeKevin pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    
}