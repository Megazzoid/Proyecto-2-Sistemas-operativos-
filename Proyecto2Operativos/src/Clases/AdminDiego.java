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
public class AdminDiego {
    ColaDiego prio1;
    ColaDiego prio2;
    ColaDiego prio3;
    ColaDiego prioRef;
    private int ID;
    
    public AdminDiego(){
        this.prio1 = new ColaDiego();
        this.prio2 = new ColaDiego();
        this.prio3 = new ColaDiego();
        this.prioRef = new ColaDiego();
        this.ID = 1;
    }
    
    public String SerieDiego(){
        int prio = (int)(Math.random()*3 +1);
        SerieDiego SerieEstudio2 = new SerieDiego (this.ID, prio,0);
        this.ID++;
        
        switch(SerieEstudio2.getPrio()){
            case 1:
                this.prio1.Encolar(SerieEstudio2);
                return "Se ha agregado una serie al estudio 2 " + SerieEstudio2.getId() + "- Prioridad: " + prio;
            case 2:
                this.prio2.Encolar(SerieEstudio2);
                return "Se ha agregado una serie al estudio 2 " + SerieEstudio2.getId() + "- Prioridad: " + prio;
            case 3:
                this.prio3.Encolar(SerieEstudio2);
                return "Se ha agregado una serie al estudio 2 " + SerieEstudio2.getId() + "- Prioridad: " + prio;
        }
        return "";
    }
    
    public String MandarInfoDiego(ColaDiego cola){
        String text = cola.getData();
        return text;
    }

        

    
}
