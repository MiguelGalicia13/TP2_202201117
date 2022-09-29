
package tp2;

import java.util.Scanner;

public class circulo {
    Scanner sc = new Scanner(System.in);
    float areacirculo;

calculos resultados = new calculos();   
    public circulo(){
        System.out.println("Ingrese su radio en centmetros");
        resultados.r= sc.nextInt();
        this.areacirculo= (float)Math.PI* (float)Math.pow(resultados.r, 2);
        System.out.println("El area del circulo es de "+areacirculo+"cm^2");
    }
}
