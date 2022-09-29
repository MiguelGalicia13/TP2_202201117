//Verduras compradas
package tp2;

import java.util.Scanner;
public class verduras {
    Scanner sc = new Scanner(System.in);
    double preciotomate = 3.5;
    int preciozanahorias = 2;
    int precioelotes = 3;
    double preciocebollas = 2.5;
    int preciopapas = 4;
    int zanahorias,elotes;
    double tomates,cebollas, papas, subtomates, subcebollas, subpapas;
    int subzanahorias, subelotes;
    String op1, op2, op3, op4, op5;
    double totalverduras;
    
    public verduras(){
        System.out.println("Usted compro tomates?");
        op1=sc.next();
        if(op1.equals("si")){
            System.out.println("Cuantas libras de tomate compro?");
            tomates=sc.nextFloat();
            subtomates=tomates*preciotomate;
        }
        System.out.println("Usted compro zanahorias?");
        op2=sc.next();
        if(op2.equals("si")){
            System.out.println("Cuantas zanahorias compro?");
            zanahorias=sc.nextInt();
            subzanahorias=zanahorias*preciozanahorias;
        }
        System.out.println("Usted compro elotes?");
        op3=sc.next();
        if(op3.equals("si")){
            System.out.println("Cuantas zanahorias compro?");
            elotes=sc.nextInt();
            subelotes=elotes*precioelotes;
        }
        System.out.println("Usted compro cebollas?");
        op4=sc.next();
        if(op4.equals("si")){
            System.out.println("Cuantas libras de cebolla compro?");
            cebollas=sc.nextFloat();
            subcebollas=cebollas*preciocebollas;
        }
        System.out.println("Usted compro papas?");
        op5=sc.next();
        if(op5.equals("si")){
            System.out.println("Cuantas libras de papa compro?");
            papas=sc.nextFloat();
            subpapas=papas*preciopapas;
        }
    totalverduras=subtomates+subzanahorias+subelotes+subcebollas+subpapas;
    }
}
