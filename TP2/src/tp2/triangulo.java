package tp2;

import java.util.Scanner;
public class triangulo {
    float areatriangulo;
    Scanner sc = new Scanner(System.in);
    calculos resultados = new calculos();  
    public triangulo(){
        System.out.println("Ingrese su base");
        resultados.b= sc.nextInt();
        System.out.println("Ingrese su altura");
        resultados.a= sc.nextInt();
        this.areatriangulo= (resultados.b*resultados.a)/2;
        System.out.println("El area del tirnagulo es de "+areatriangulo+"cm^2");
    }
}
