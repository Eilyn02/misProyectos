
package algoritmosbasicos;
import java.util.Scanner;
//Haga un algoritmo que calcule e imprima el área de un circulo =>Área = p*(r*r)
public class Ejercicio1 {

    public static void main(String[] args) {
       Scanner dato=new Scanner(System.in);
       // Usar la constante Math.PI
        double pi = Math.PI, radio, Area;
        System.out.println("Digite por favor el Radio del circulo");
        radio=dato.nextDouble();
        
        Area= pi*(radio*radio);
        
        System.out.println("El Area del circulo es: "+Area);
    }
    
}
