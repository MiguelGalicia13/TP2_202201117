// Compra de abarrotes
package tp2;
import java.util.Scanner;
public class abarrotes {
    Scanner sc = new Scanner(System.in);
    int preciopapel = 17;
    int preciojabon = 15;
    int preciogalletas = 8;
    int precioarroz = 3;
    int preciomargarina = 10;
    int preciojamon = 20;
    int precioqueso = 24;
    int papel, subpapel, jabon, subjabon, galletas, subgalletas, arroz, subarroz, margarina, submargarina, jamon, subjamon, queso, subqueso;
    String op1, op2, op3, op4, op5, op6, op7;
    double totalabarrotes;
    
    public abarrotes(){
        System.out.println("Usted compro papel de banyo?");
        op1=sc.next();
        if(op1.equals("si")){
            System.out.println("Cuantos paquetes de papel compro?");
            papel = sc.nextInt();
            subpapel=papel*preciopapel;
        }
        System.out.println("Usted compro jabon para trastes?");
        op2=sc.next();
        if(op2.equals("si")){
            System.out.println("Cuantos jabones para trastes compro?");
            jabon = sc.nextInt();
            subjabon=jabon*preciojabon;
        }
        System.out.println("Usted compro galletas?");
        op3=sc.next();
        if(op3.equals("si")){
            System.out.println("Cuantos paquetes de galleta compro?");
            galletas = sc.nextInt();
            subgalletas=galletas*preciogalletas;
        }
        System.out.println("Usted compro arroz?");
        op4=sc.next();
        if(op4.equals("si")){
            System.out.println("Cuantos paquetes arroz compro?");
            arroz = sc.nextInt();
            subarroz=arroz*precioarroz;
        }
        System.out.println("Usted compro margarina?");
        op5=sc.next();
        if(op5.equals("si")){
            System.out.println("Cuantos paquetes de margarina compro?");
            margarina = sc.nextInt();
            submargarina=margarina*preciomargarina;
        }
        System.out.println("Usted compro jamon?");
        op6=sc.next();
        if(op6.equals("si")){
            System.out.println("Cuantos paquetes de jamon compro?");
            jamon = sc.nextInt();
            subjamon=jamon*preciojamon;
        }
        System.out.println("Usted compro quesos?");
        op7=sc.next();
        if(op7.equals("si")){
            System.out.println("Cuantos paquetes de quesos compro?");
            queso = sc.nextInt();
            subqueso=queso*precioqueso;
        }
        totalabarrotes=subpapel+subjabon+subgalletas+subarroz+submargarina+subjamon+subqueso;
    }
}
