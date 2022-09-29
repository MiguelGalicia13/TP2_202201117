
package tp2;
public class Areas {
    public Areas(){
     System.out.println("Ingrese el numero de lados para calcular el area de las figuras ");
    System.out.println("El programa solo admite circulos (0 lados), triangulos (3 lados), cuadrados (4 lados)");
    lados figura = new lados();
  switch (figura.nlados) {
        case 0:
            System.out.println("Es un circulo");
            circulo respuestaci = new circulo();
            break;
        case 3:
            System.out.println("Es un triangulo");
            triangulo respuestat = new triangulo();
            break;
        case 4:
            System.out.println("Es un cuadrado");
            cuadrado respuestac = new cuadrado();
            break;
        default:
            System.out.println("la figura no esta dentro del problema");
            break;
    }
    
    
    
    
    }
    
}
