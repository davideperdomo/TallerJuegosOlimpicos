
package tallerjuegosolimpicos;

import java.util.ArrayList;
import java.util.Scanner;

public class Delegacion {
    Scanner lectura = new Scanner (System.in);
    private String pais;
    private int[] medalla = new int [3];
    //private Grupo[] grupos = new Grupo[5];
    ArrayList<Grupo> grupos = new ArrayList<Grupo>();

    public Delegacion() {
    }
    
    public Delegacion(String pais, ArrayList<Grupo> grupos, int[] medalla) {
        this.pais = pais;
        this.grupos = grupos;
        this.medalla = medalla;
    }

    public String getPais() {
        return pais;
    }

    public int[] getMedalla() {
        return medalla;
    }

    public ArrayList<Grupo>  getGrupos() {
        return grupos;
    }

    
 
    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setMedalla(int[] medalla) {
        this.medalla = medalla;
    }
    
    public void cambiarMedalla(int[] medalla) {
        this.medalla = medalla;
        System.out.println("Tipo de medalla que desea agregar(1=oro,2=plata,3=bronce)");
        int m = lectura.nextInt(); 
        switch (m){
            case 1:
                System.out.println("Cuantas medallas de oro gano? ");
                medalla[0] = lectura.nextInt();
                break;
            
            case 2:
                System.out.println("Cuantas medallas de plata gano? ");
                medalla[1] = lectura.nextInt();
                break;
                
            case 3:
                System.out.println("Cuantas medallas de oro plata? ");
                medalla[2] = lectura.nextInt();
                break;
        }
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }
          
  
    public int sumaMedallas(){
        int sumM=0;
        for(int i=0; i<3; i++){
            sumM=sumM+medalla[i];
        }
        return sumM;
    }
   
                         
}