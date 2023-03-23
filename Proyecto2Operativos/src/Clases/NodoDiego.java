/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author danma
 */
public class NodoDiego<T> {
    private T data;
    private NodoDiego next;
    
    public NodoDiego (T datazo){
        this.data = datazo;
        this.next = null;
    }

    public  T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodoDiego getNext() {
        return next;
    }

    public void setNext(NodoDiego next) {
        this.next = next;
    }
    
    
    
}
