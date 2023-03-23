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
public class ColaDiego<T> {
    
    private NodoDiego<T> head;
    private NodoDiego<T> tail;
    int size;
    
    public ColaDiego(){
        this.head = this.tail =null;
        this.size = 0;
    }
    
    public ColaDiego(T datazo){
        NodoDiego<T> nodo = new NodoDiego(datazo);
        this.head = this.tail = nodo;
        this.size = 1;
    }
    
    private boolean isEmpty(){
        return this.head == null;
    }
    
    public void EncolarDiego(T datazo){
        NodoDiego<T> nodo = new NodoDiego(datazo);
        this.size++;
        if (isEmpty()){
            this.head = this.tail = nodo;
        } else {
            this.tail.setNext(nodo);
            this.tail = nodo;            
        }
    }
    
    public T DesencolarDiego(){
        if (isEmpty()){
            return null;
        }       
        NodoDiego<T> temp = this.head;
        this.head = temp.getNext();
        temp.setNext(null);
        this.size--;
        return temp.getData();
    }
    
    public T peek(){
        if (isEmpty()){
            return null;
        }       
        NodoDiego<T> temp = this.tail;
        return temp.getData();
    }

    public int getSize() {
        return size;
    }

    public NodoDiego<T> getHead() {
        return head;
    }

    public NodoDiego<T> getTail() {
        return tail;
    }
    
    
    
}
