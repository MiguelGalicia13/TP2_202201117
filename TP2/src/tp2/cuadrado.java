
package tp2;

import java.util.Scanner;
public class cuadrado {
    int areacuadrado;
    calculos resultados = new calculos();
    public cuadrado(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el tamaño del lado del cuadrado");
    resultados.c = sc.nextInt();
    this.areacuadrado= (int) Math.pow(resultados.c, 2);
    System.out.println("El area del cuadrado es de "+areacuadrado+"cm^2");
    
    }
}
