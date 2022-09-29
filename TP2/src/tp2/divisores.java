package tp2;
import java.util.Scanner;
public class divisores {
    Scanner sc = new Scanner(System.in);
    int numero;
    int i;
    public divisores(){
        System.out.println("Ingrese eun numero entre el 1 y 1000");   
    do{ // Hara que se repita el codigo hasta que se ingrese un valor dentro del rango
        numero=sc.nextInt();
        if(numero<1||numero>1000){// Si el valor no esta dentro del rango le dira que ingrese un numero valido
            System.out.println("Ingrese un numero valido dentro del rango");
        }      
    }while(numero<1||numero>1000);
    
     for(i=1;i<=numero;i++){// i llegara hasta el numero ingresado
    if(numero%i==0){//Dividira el numero ingresado entre i y si el resiudo es 0 imprimira que i es divisor escanto del numero
        System.out.println(i+" es divisor exacto de "+ numero);
    }
     }
    }
}