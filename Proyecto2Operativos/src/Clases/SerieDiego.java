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
public class SerieDiego {
    int id;
    int prio;
    int contador;
    String intro; 
    String inicio; 
    String cierre;
    String creditos;
    int calidad;
    String personaje;
    String episodio;
    int tiempo;

    public SerieDiego(int id, int prio, int contador,String intro,String inicio, String cierre,String creditos, int calidad,String personaje,String episodio,int tiempo) {
        this.id = id;
        this.prio = prio;
        this.contador = contador;
        this.inicio = inicio;
        this.intro = intro;
        this.cierre = cierre;
        this.creditos = creditos;
        this.calidad = calidad;
        this.personaje = personaje;
        this.episodio = episodio;
        this.tiempo = tiempo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrio() {
        return prio;
    }

    public void setPrio(int prio) {
        this.prio = prio;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
}
