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
public class ColaDiego {
    
    NodoDiego head;
    NodoDiego tail;
    int size;
    
    public ColaDiego(){
        this.head = null;
        this.tail =null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return this.size == 0;
    }
    
    public void Encolar(SerieDiego datazo){
        NodoDiego n = new NodoDiego(datazo);
        if (isEmpty()){
            this.head = n;
            this.tail = n;
            size++;
        } else {
            tail.next= n;
            tail = n;
            size++;
        }

    }
    
    public SerieDiego Desencolar(){
        if(!isEmpty()){
            SerieDiego first = head.data;
            if(head==tail){
                head=null;
                tail=null;
                size--;
            }else{
                head = head.next;
                size--;
            }
            return first;
        }else{
            return null;
        }
    }
    
    public String getData(){
        NodoDiego aux = this.head;
        String text="";
         while (aux != null) {
            SerieDiego temp = aux.data;
            text = text + "ID: " + temp.id + " - PRIORIDAD: " + temp.prio + " - CONTADOR:" + temp.contador + "\n";
            aux = aux.next;
        }
        return text;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
       public class NodoDiego {    
    //Variables de Nodo
        SerieDiego data;
        NodoDiego next;
    //Constructor
    public NodoDiego(SerieDiego datazo) {        
        this.data = datazo;
        this.next = null;
            }}
}
