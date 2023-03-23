/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author kevin
 */
public class SerieKevin {
    int id;
    int prioridad;
    int contador;
    String intro; 
    String inicio; 
    String cierre;
    String creditos;
    int totalcalidad;
    String Nombrepersonaje;
    String NombreEpisodio;
    int tiempo;

    public SerieKevin(int id, int prioridad, int contador,String intro,String inicio, String cierre,String creditos, int totalcalidad,String Nombrepersonaje,String NombreEpisodio,int tiempo) {
        this.id = id;
        this.prioridad = prioridad;
        this.contador = contador;
        this.inicio = inicio;
        this.intro = intro;
        this.cierre = cierre;
        this.creditos = creditos;
        this.totalcalidad = totalcalidad;
        this.Nombrepersonaje = Nombrepersonaje;
        this.NombreEpisodio = NombreEpisodio;
        this.tiempo = tiempo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the prioridad
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
}
