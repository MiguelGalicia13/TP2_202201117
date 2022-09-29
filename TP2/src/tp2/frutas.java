// Frutas Compradas
package tp2;
import java.util.Scanner;
public class frutas {
    Scanner sc = new Scanner(System.in);
    int preciomanzanas = 4;
    int precioperas = 5;
    int preciouvas = 7;
    int preciobananos = 8;
    int preciosandia = 12;
    int manzanas,peras,sandias;
    float uvas,subuva, subban, bananos;
    int subman, subper,subsan;
    double totalfrutas;
    String op1, op2, op3, op4, op5;
    public frutas(){
        System.out.println("Usted compro manzanas?");
        op1=sc.next();
        if(op1.equals("si")){
            System.out.println("Cunatas manzanas compro?");
        manzanas=sc.nextInt();
        subman=manzanas*preciomanzanas;
    }
        System.out.println("Usted compro peras?");
        op2=sc.next();
        if(op2.equals("si")){
            System.out.println("Cuantas peras compro?");
            peras=sc.nextInt();
            subper=peras*precioperas;
        }
        System.out.println("Usted compro uvas?");
        op3=sc.next();
        if(op3.equals("si")){
            System.out.println("Cuantas libras de uva compro?");
            uvas=sc.nextFloat();
            subuva=uvas*preciouvas; 
        }
        System.out.println("Usted compro bananos?");
        op4=sc.next();
        if(op4.equals("si")){
            System.out.println("Cuantas docenas compro?");
            bananos=sc.nextFloat();
            subban=bananos*preciobananos;
        }
        System.out.println("Usted compro sandias?");
        op5=sc.next();
        if(op5.equals("si")){
            System.out.println("Cuantas sandias compro?");
            sandias=sc.nextInt();
            subsan=sandias*preciosandia;
        }
        totalfrutas=subman+subper+subuva+subban+subsan;
        
    }
}
