// Ingreso del numero para calcular si es primo
package tp2;

import java.util.Scanner;
public class numero {
    Scanner sc = new Scanner(System.in);
        int valor; 
        int vp = 2;
        boolean primo = true; 
     
        public numero(){
            this.valor =  sc.nextInt();//Ingreso de numero
            this.vp = vp; //Vp valor prueba por si el numero es 2 no se genere conflicto
            this.primo = primo; // True = es primo False = No es primo
        }
}
