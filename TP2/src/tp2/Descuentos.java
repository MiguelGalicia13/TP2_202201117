// Aplicacion de descuentos
package tp2;
import java.util.Scanner;
public class Descuentos {
    public Descuentos(){
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingrese su nombre");
    String nombre = sc.next();
    double total, descuento;
    compras buy = new compras();
    System.out.println(nombre+" Su subtotal es de Q"+buy.total);
    if(buy.total>=1000){
        System.out.println("Felicidades usted aplica al descento del 20% al comprar mas de Q1000.00");
        descuento=buy.total*0.20;
        total=buy.total-descuento;
        System.out.println("Su total a pagar es de Q"+total);
    }else System.out.println("Su total a pagar es de Q"+buy.total);
    System.out.println("Usted lleva un total de "+buy.cantproductos+" productos");
    }
}
