
package EJERCICIO_CLASE2;

public class Estudiante {

    public String nombre;
    public float nota1, nota2, definitiva = 0;

    // METODOS
    public void datosEstudiante(String nom) {
        nombre = nom;
    }
    public void notasParciales(float n1, float n2) {

        nota1 = n1;
        nota2 = n2;
    }
    public float calcuclardefinitiva() {
        definitiva = (nota1 + nota2) / 2;
        return definitiva;
    }
    public String imprimirMensaje() {
        if (definitiva >= 3) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }
}


