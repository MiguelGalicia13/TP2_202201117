//Programa que ordena de mayor a menor
package tp2;
import java.util.Arrays;
public class mayoramenor {
    int[]rango={6, 10, 5, 4, 2, 0, 11, 7, 39, 3, 1, 8, 94, 22, 95};
    public mayoramenor(){
    Arrays.sort(rango);//orden numericamente el array
    System.out.println(Arrays.toString(rango));
    }
}
