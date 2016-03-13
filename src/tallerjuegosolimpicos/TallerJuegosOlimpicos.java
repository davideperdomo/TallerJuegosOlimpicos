package tallerjuegosolimpicos;

import java.util.Scanner;
public class Tallerjuegosolimpicos {


    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        int opcion;
        boolean op=true;
        JuegoOlimpico jjoo = new JuegoOlimpico();
        System.out.println("Que desea hacer? ");
        System.out.println("1. Crear delegacion nueva.");
        System.out.println("2. Buscar y mostrar grupos por deporte.");
        System.out.println("3. Cambiar el numero de medallas de una delegacion.");
        System.out.println("4. mostrar la delegacion con mas medallas.");
        System.out.println("5. Salir.");
        while (op=true){
        opcion = lectura.nextInt();
        switch (opcion){
            case 1:
                jjoo.ingresaDelegacion();
                System.out.println("Desea realizar mas cambios? (1=si 2=no");
                int op2=lectura.nextInt();
                if (op2==2){
                  op=false;
                }
                break;
            
            case 2:
                jjoo.buscarDeporte();
                 System.out.println("Desea realizar mas cambios? (1=si 2=no");
                op2=lectura.nextInt();
                if (op2==2){
                  op=false;
                }
                break;
                
            case 3:
                jjoo.cambiarMedallas();
                 System.out.println("Desea realizar mas cambios? (1=si 2=no");
                op2=lectura.nextInt();
                if (op2==2){
                  op=false;
                }
                break;
                
            case 4:
                jjoo.masMedallas();
                 System.out.println("Desea realizar mas cambios? (1=si 2=no");
                op2=lectura.nextInt();
                if (op2==2){
                  op=false;
                }
                break;
                
            case 5:
                System.out.println("Adios.");
                op=false;
                
            default:
                System.out.println("Ingresa un numero valido");
                
        }
    }
    }
    
}
