// conversion decimal a binarios 
package tp2;

import java.util.Scanner;
public class operar {
    Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        public operar(){
            this.decimal=decimal;
            if (decimal <= 0) {
	System.out.println(0);
	}
            StringBuilder binario = new StringBuilder();
	while (decimal > 0) {
		short residuo = (short) (decimal % 2);
		decimal = decimal / 2;
		binario.insert(0, String.valueOf(residuo));
	}

        System.out.println("El numero binario es "+binario.toString());
        }
}
