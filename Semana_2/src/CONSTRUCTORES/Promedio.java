
package CONSTRUCTORES;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args){
        
        Scanner leer =new Scanner(System.in);
        Tripulante ObjetoTrip = new Tripulante(2);
        int sumEdad=0, con=0, continuar=1;
        
        while (continuar==1){
            System.out.println("/n/n Digite la edad del tripulante: " );
            ObjetoTrip.asignarEdad(leer.nextInt());
            con++;
            sumEdad = sumEdad + ObjetoTrip.obtenerEdad();
            
            System.out.println("Desea continuar? 1. si, 0. no: ");
            continuar = leer.nextInt();  
    }
    System.out.println("El promedio de edades de los tripulantes es: "+(sumEdad/con));
    
    }
}