package tp2;
import java.util.Scanner;
public class potencias {
    Scanner sc = new Scanner(System.in);
    int base;
    int exponente;
    public potencias(){
        System.out.println("Ingrese la base del numero entre el 1 - 10");
        base=sc.nextInt();
        while(base<1||base>10){
            System.out.println("Ingrese un numero entre 1 - 10");
            base=sc.nextInt();
        }
        System.out.println("Ingrese el exponenete que sea de 1 -4");
        exponente=sc.nextInt();
        while(exponente<1||exponente>4){
            System.out.println("Ingrese un numero entre 1 - 4");
            exponente=sc.nextInt();
        }
        int respuesta = (int) Math.pow(base,exponente);
        System.out.println(base+"^"+exponente+" = "+respuesta);
    }
}
