//Parametro  que calcula si el numero es primo
package tp2;

public class parametro {
    public parametro(){
        numero x = new numero();
        while(x.primo && x.vp!=x.valor){ //mientras el valor de prueba (2) y el numero ingresado sea difierente se ejecutara el while
            if(x.valor%x.vp==0) //Si el residuio de el valor ingresado y el valor prueba es 0 se ejecuta el if
                x.primo = false; //El while al tener un valor inicial en primo = true si se ejecuta cambia el valo del mismo
            x.vp++; // aumenta un valo para finalizar while
        }
        System.out.println(x.primo);
    }
}
