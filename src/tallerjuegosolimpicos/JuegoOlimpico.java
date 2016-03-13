/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjuegosolimpicos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class JuegoOlimpico {
    
    Scanner lectura = new Scanner (System.in);
           
    public void ingresaDelegacion (){
        System.out.println("Numero de delegaciones (max. 10): ");
        int nd = lectura.nextInt();
        
       
        ArrayList <Delegacion> Deg = new ArrayList<Delegacion>();
        
        for(int k=0; k< nd ; k++){
            System.out.println("Grupos delegacion "+ (k+1) + " (max 5): ");
            int ng = lectura.nextInt();
                        
            ArrayList<Grupo> grupos = new ArrayList<Grupo>();                    
            
            for(int j  =0;j< ng; j++ ){
                System.out.println("Numero integrantes grupo "+ (j+1) + " : (max 10)");
                int ni = lectura.nextInt();
                
                
                ArrayList<Integrantes> integrante = new ArrayList<Integrantes>();
                
                for(int i=0; i< ni; i++){
                    System.out.println("Nombre integrante "+ (i+1) + " : ");
                    String nom = lectura.next();
                    System.out.println("Apellido integrante "+ (i+1) + " : ");
                    String ape = lectura.next ();                    
                    
                    Integrantes Auxi = new Integrantes(nom,ape);
                    
                    integrante.add(Auxi);
                }
                
                System.out.println("Deporte grupo "+ (j+1) + " : ");
                String dep = lectura.next();
                
                Grupo Auxg = new Grupo(dep,integrante);
                
                grupos.add(Auxg);
                
            }
            
            System.out.println("Pais delegacion "+ (k+1) + " : ");
            String pais = lectura.next();
            
            int[] Medalla = new int[3];
            
            
                System.out.println("Ingresa el numero de medallas de oro "+ (k+1) + " : ");
                Medalla[0]= lectura.nextInt();
                System.out.println("Ingresa el mumero de medallas de plata "+ (k+1) + " : ");
                Medalla[1]= lectura.nextInt();
                System.out.println("Ingresa el mumero de medallas de bronce "+ (k+1) + " : ");
                Medalla[2]= lectura.nextInt();
            
            Delegacion Auxd = new Delegacion(pais,grupos,Medalla);

            Deg.add(Auxd);
        }
    }
    
    
    public void cambiarMedallas(){
        HashMap <String, Delegacion> buscaPais = new HashMap<>();
        for(int ii=0; ii<buscaPais.size();ii++){
            String paisobt = buscaPais.get(ii).getPais();
            buscaPais.put(paisobt, buscaPais.get(ii));
        }
        System.out.println("Pais a cambiar medallas: ");
        String id = lectura.next();
        Delegacion xd = buscaPais.get(id);
        
        xd.cambiarMedalla(xd.getMedalla());
    }
    
}