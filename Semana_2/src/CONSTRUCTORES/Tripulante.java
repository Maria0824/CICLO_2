/*
Hacer un algoritmo en JAVA que permita calcular la edad promedio 
de los tripulantes de un curso de MISION TIC 2022 aplicar POO
(Constructores), para n ripulantes.

TRIPULANTE
-Edad

PROMEDIO
-promedio
-n

- Calcular

 */
package CONSTRUCTORES;


public class Tripulante {
    public int edad;
    
    public Tripulante(int edad){
        this.edad=edad;
    }    
    
    public void asignarEdad(int edad){
        this.edad=edad;
    }
    public int obtenerEdad (){
        return this.edad;

    
    }
}
