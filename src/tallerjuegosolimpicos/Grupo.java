/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjuegosolimpicos;

import java.util.ArrayList;

/**
 *
 * @author jeromero
 */
public class Grupo {
    
    
    private String deporte;
   
    //private Integrantes[] integrantes = new Integrantes [10];
    private ArrayList<Integrantes> integrante = new ArrayList<Integrantes>();
    
    public Grupo(){    
    }

    public Grupo(String deporte,  ArrayList<Integrantes> integrante) {
        this.deporte = deporte;
        this.integrante = integrante;
    }   
        
    public String getDeporte() {
        return deporte;
    }

    public ArrayList<Integrantes> getIntegrantes() {
        return integrante;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
 
    public void setIntegrantes(ArrayList<Integrantes> integrante) {
        this.integrante = integrante;
    }   
}