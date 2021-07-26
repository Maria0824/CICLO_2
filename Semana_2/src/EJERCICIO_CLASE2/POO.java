/*
CLASE PRINCIPAL
 */
package EJERCICIO_CLASE2;

import java.util.Scanner;
public class POO {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Estudiante est = new Estudiante();
        
        String nom;
        float n1,n2;
        
        for (int i=0; i<3; i++){
        
        System.out.println("nombre del estudiante: ");
        nom = leer.nextLine();
        
        System.out.println("Nota 1: ");
        n1 = leer.nextFloat();
        
        System.out.println("Nota 2: ");
        n2 = leer.nextFloat();
        
        est.datosEstudiante(nom);
        est.notasParciales(n1,n2);
        
        System.out.println("La nota definitiva del estdiante "+ est.nombre +" es: "+est.calcuclardefinitiva());
        
        
        
        
        }
        
       
    }
    
}
