package tp2;
import java.util.Scanner;
public class paroimpar {
    Scanner sc = new Scanner(System.in);
    int numero;
    public paroimpar(){
    System.out.println("Ingrese un numero");
    numero = sc.nextInt();
    if(numero%2==0){
        System.out.println(numero+" al se par este seria el doble "+numero*2);
    }else System.out.println(numero+" al ser impar este es su triple "+numero*3);
    }
}
