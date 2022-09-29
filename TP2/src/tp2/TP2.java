//Menu
package tp2;
import java.util.Scanner;
public class TP2 {
static void Ejercicios(){
    Scanner sc = new Scanner(System.in);
    String continuar = "si";
    do{
    System.out.println("Programa compilatorio para TP2");
    System.out.println("1. Menu para calculos de area");
    System.out.println("2. Programa para los numeros primos");
    System.out.println("3. Programa para conocer el factorial");
    System.out.println("4. Programa de conversion de decimal a binarios");
    System.out.println("5. Programa de elevador");
    System.out.println("6. Prgrama de facturacion");
    System.out.println("7. Programa que ordena de mayor a menor");
    System.out.println("8. Programa de pares e impares");
    System.out.println("9. Programa de divisores");
    System.out.println("10. Potencias");
    System.out.println("A que numero de programa desea ingresar?");
    int opcion =sc.nextInt();
    switch(opcion){
        case 1:
            System.out.println("1. Menu para calculos de area");
            Areas a = new Areas();
            break;
    case 2:
            System.out.println("2. Programa para los numeros primos");
            primos b = new primos();
            break;
    case 3:
            System.out.println("3. Programa para conocer el factorial");
            Factoriales c = new Factoriales();
            break;
    case 4:
            System.out.println("4. Programa de conversion de decimal a binarios");
            Binarios d = new Binarios();
            break;
    case 5:
            System.out.println("5. Programa de elevador");
            Elevador e = new Elevador();
            break;
    case 6:
            System.out.println("6. Prgrama de facturacion");
            Descuentos f = new Descuentos();
            break;
    case 7:
            System.out.println("7. Programa que ordena de mayor a menor");
            mayoramenor g = new mayoramenor();
            break;
    case 8:
            System.out.println("8. Programa de pares e impares");
            paroimpar h = new paroimpar();
            break;
    case 9:
            System.out.println("9. Programa de divisores");
            divisores i = new divisores();
            break;
    case 10:
            System.out.println("10. Potencias");
            potencias j = new potencias();
            break;
    default:    
    System.out.println("Ingreso una opcion no valida");
            break;
}
    System.out.println("Desea volver al menu? si o no");
    continuar = sc.next();
    }while(continuar.equals("si"));
    System.out.println("El menu se ha cerrado satisfacoritamente");
}
    public static void main(String[] args) {
        Ejercicios();
    } 
}