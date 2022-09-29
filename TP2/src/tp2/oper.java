// operacion para los factoriales
package tp2;
import java.util.Scanner;
public class oper {
    Scanner sc = new Scanner(System.in);
    int vp = sc.nextInt();
    int respuesta=1;
    public oper(){
         while ( vp!=0) {
 this.respuesta=respuesta*vp; 
 vp--;
 
}      
    }
}
