/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * Clase Nodo
 * @author Kevin Hernandez
 * Fecha: 13/03/2023
 */
public class QueueNodeKevin {
    private SerieKevin data;
    private QueueNodeKevin pNext;

    public QueueNodeKevin(SerieKevin data) {
        this.data = data;
        this.pNext = null;
    }

    /**
     * @return the data
     */
    public SerieKevin getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(SerieKevin data) {
        this.data = data;
    }

    /**
     * @return the pNext
     */
    public QueueNodeKevin getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(QueueNodeKevin pNext) {
        this.pNext = pNext;
    }
    
    
    
    
}
