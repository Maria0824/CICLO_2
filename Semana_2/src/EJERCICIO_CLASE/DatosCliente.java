/*
/*
 El programa debe calcular el subtotal a pagar el IVA y el total por la compra 
realizada (Se debe indicar los códigos del producto, la cantidad y el precio unitario),
adicional de los datos del cliente como identificación y Nombres

Se debe desarrollar aplicando POO

clases factproducto, cliente, clase principal
atributos: codigosproducto, cantidad, precio e IVA, identificacion, nombre
metodos: subtotal, subtotal+IVA, total compra, imprimir datos cliente

CLASE PRINCIPAL
-----------------
DATOS CLIENTE
-codigo producto
-Cantidad
-Precio/U
-Nombre Cliente
-Identificación
--------------
- Pedir datos
- facturacion
  IVA
______________


-subtotal IVA
Total compras
imprimir mensaje
 */

package EJERCICIO_CLASE;

public class DatosCliente {
    public int codProducto, cantidad;
    public String  nomCliente, identificacion;
    public float precioUnidad, Iva= 10, SubTotal, Totalpagar;
    
    public void Cliente(String nom, String numidentificacion){
        nomCliente=nom;
        identificacion=numidentificacion;
    }  
    public void CaractProducto(int cod, int cant, float precio){
        codProducto=cod;
        cantidad=cant;
        precioUnidad=precio;  
    }
    public float subTotal(){
        SubTotal = precioUnidad * cantidad;
        return SubTotal;
    }
    
    public float Total(){
        Totalpagar= (SubTotal * Iva)+SubTotal;
        return Totalpagar;
    }
    
}
