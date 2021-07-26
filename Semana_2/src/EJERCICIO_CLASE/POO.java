/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///CLASE PRINCIPAL
package EJERCICIO_CLASE;

import java.util.Scanner;


public class POO {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        DatosCliente DatClient = new  DatosCliente();
        
        int cod, cant;
        String nom, numidentificacion;
        float precio;
        
        System.out.println("Digite nombre del cielnte: ");
        nom = leer.nextLine();
        
        System.out.println("Digite identificación del cielnte: ");
        numidentificacion = leer.nextLine();
        
        System.out.println("Digite Codigo del producto: ");
        cod = leer.nextInt();
        
        System.out.println("Digite cantida del producto: ");
        cant = leer.nextInt();
        
        System.out.println("Digite precio del producto: ");
        precio = leer.nextFloat();
        
        DatClient.CaractProducto(cod, cant, precio);
        DatClient.Cliente(nom, numidentificacion);
         
        System.out.println("******************************************************************");
        System.out.println("                        FACTURA: ");
        System.out.println("******************************************************************");
        System.out.println("Cliente: "+DatClient.nomCliente);
        System.out.println("Identificacion: "+DatClient.identificacion);
        System.out.println("******************************************************************");
        System.out.println("Cod producto: "+DatClient.codProducto);
        System.out.println("Cantidad producto: "+DatClient.cantidad);
        System.out.println("Precio por unidad: "+DatClient.precioUnidad);
        System.out.println("******************************************************************");
        System.out.println("El precio base del producto es: " + DatClient.subTotal());
        System.out.println("El precio Total a pagar por descuento de IVA es: " + DatClient.Total());
        System.out.println("******************************************************************");
    }
    
}
