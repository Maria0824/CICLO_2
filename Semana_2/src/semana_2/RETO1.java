package semana_2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import java.util.Scanner;

public class RETO1 {

    public static Scanner materias = new Scanner(System.in);
    public static int opcion, i, j, fil = 5, col = 5, longitud = 5, respuesta=0; 
    public static float acumValores = 0;
    public static int[][] estudiante = new int[5][5];
    public static float[] promedios = new float[5];
    public static Map<Integer, String> Asignaturas = new TreeMap<Integer, String>();

    public static void main(String[] args) {
        int op;
        Asignaturas.put(0, "Matematicas");//posición (0,0) en vector estudiante
        Asignaturas.put(1, "Ciencias");//posición (1,0) en vector estudiante
        Asignaturas.put(2, "Ingles");//posición (2,0) en vector estudiante
        Asignaturas.put(3, "Informatica");//posición (3,0) en vector estudiante
        Asignaturas.put(4, "Deportes");//posición (4,0) en vector estudiante
        op = menu();
        //LLAMADO DE LAS FUENCIONES
        switch (opcion) {
            case 1: {
                cargCalificacion();
            }
            case 2: {
                Boletin();
            }
            case 3: {
                Estadoasignatura();
            } 
        }
    }
    //OPCIONES DEL PROGRAMA
    public static int menu() {
        System.out.println("************************************");
        System.out.println("     -_-COLEGIO HIGHSCHOOL-_-       ");
        System.out.println("************************************");
        System.out.println(" 1. Cargar calificaciones Estudiante.\n 2. Imprimir Boletin,\n 3. Imprimir Estado  Asignatura, \n 4. Finalizar");
        System.out.println("************************************");
        System.out.println("Seleccione una opción");
        opcion = materias.nextInt();
        
        if (opcion < 1){
            System.out.println("Opción invalida, digite nuevamente una opción!");
            return menu();
        }else if(opcion>4){
            System.out.println("Opción invalida, digite nuevamente una opción!");
            return menu();
        }
        return opcion; 
    }
    //RECIBIR POR TECLADO LAS NOTAS DE LAS ASIGNATURAS
    public static int cargCalificacion() {
        System.out.println("*******************************");
        System.out.println("DIGITE LAS NOTAS DEL ESTUDIANTE");
        System.out.println("*******************************");
        for (i = 0; i < fil; i++) {
            for (j = 1; j < col; j++) {
                System.out.println(Asignaturas.get(i) + " -per." + j);
                estudiante[i][j] = materias.nextInt();
            }
        }
        return menu();
    }
    //NOTAS POR ASIGNATURA Y PROMEDIO DE LAS MISMAS
    public static int Boletin() {
        System.out.println("****************************");
        System.out.println(" BOLETIN COLEGIO HIGHSCHOOL ");
        System.out.println("****************************");
        for (i = 0; i < fil; i++) {
            System.out.println("**********************");
            System.out.println(Asignaturas.get(i));
            System.out.println("**********************");
            for (j = 1; j < col; j++) {
                if (i == 0) {
                    System.out.println(" p." + j + ": " + estudiante[i][j]);
                } else if (i == 1) {
                    System.out.println(" p." + j + ": " + estudiante[i][j]);
                } else if (i == 2) {
                    System.out.println(" p." + j + ": " + estudiante[i][j]);

                } else if (i == 3) {
                    System.out.println(" p." + j + ": " + estudiante[i][j]);
                } else if (i == 4) {
                    System.out.println(" p." + j + ": " + estudiante[i][j]);
                }            
            }
        }
        //PROMEDIOS POR ASIGNATURA
        for (i = 0; i < fil; i++) {
            for (j = 1; j < col; j++) {
                acumValores = acumValores + estudiante[i][j];
            }
            promedios[i] = (acumValores / 4);
            acumValores = 0;
        }
        System.out.println("********************");
        System.out.println("      PROMEDIOS    ");
        System.out.println("********************");
        for (i = 0; i < 5; i++) {
            System.out.println(Asignaturas.get(i)+": " + promedios[i]);
        }
        return menu();
    }
    //IMPRIMIR ESTADO DE ASIGNATURA
    public static int Estadoasignatura() {
        System.out.println("************************************");
        System.out.println("         ESTADO MATERIA             ");
        System.out.println("************************************");
        System.out.println(" 0.   Matemáticas");
        System.out.println(" 1.   Ciencias");
        System.out.println(" 2.   Ingles");
        System.out.println(" 3.   Informática");
        System.out.println(" 4.   Deporte");
        System.out.println("************************************");
        System.out.println("Opcion que desea: ");
        respuesta = materias.nextInt();
        
        if (respuesta < 0){
            System.out.println("Opción invalida, seleccione una opción valida!");
            return Estadoasignatura();
        }else if(respuesta > 4){
            System.out.println("Opción invalida, seleccione una opción valida!");
            return Estadoasignatura();
        }else if (respuesta > -1) {
            for (i = 0; i < fil; i++) {
                for (j = 1; j < col; j++) { //j=1 para que empiece desde (0,1), (1,1)...(4,1).
                    if (i == respuesta) {
                        System.out.println(Asignaturas.get(i) + "- p." + j + ": " + estudiante[i][j]);

                    }
                }

            }
        }
        return menu();
    }
}

