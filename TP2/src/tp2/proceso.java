// Proceso de elevador
package tp2;
import java.util.Scanner;
public class proceso {
    Scanner sc = new Scanner (System.in);
    int piso = sc.nextInt();
    int niveles = 1;
    
     public proceso(){
         this.piso = piso;
         if(piso>1&&piso<=101){
             while(niveles<=piso&&piso<=101){
             if(niveles==1){
                 System.out.println("Planta Baja");
             }else System.out.println("Nivel "+niveles);
             
             niveles++;
}
         }else if(piso==1){
         System.out.println("Usted actualmente se encuentra en la planta baja");
     }
         System.out.println("Feliz dia, cuiado al salir del elevador");   
     }
}
