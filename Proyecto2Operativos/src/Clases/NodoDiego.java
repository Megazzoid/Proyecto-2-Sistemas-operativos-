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
public class NodoDiego {
    private SerieDiego data;
    private NodoDiego next;
    
    public NodoDiego (SerieDiego data){
        this.data = data;
        this.next = null;
    }

    public  SerieDiego getData() {
        return data;
    }

    public void setData(SerieDiego data) {
        this.data = data;
    }

    public NodoDiego getpNext() {
        return next;
    }

    public void setpNext(NodoDiego next) {
        this.next = next;
    }
    
    
    
}
