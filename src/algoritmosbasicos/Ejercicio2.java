
package algoritmosbasicos;
import java.util.Scanner;
//Haga un algoritmo que calcule e imprima el área de un triángulo => Área =(b*h) / 2
public class Ejercicio2 {
    public static void main(String[]args){
    Scanner dato=new Scanner(System.in);
    
    double b,h,A;
    
        System.out.println("Digite el valor de la base del Triangulo");
        b=dato.nextDouble();
        System.out.println("Digite La altura del triangulo");
        h=dato.nextDouble();
        
        A=(b*h)/2;
        
        System.out.println("El Área del triangulo es: "+A);
    
    
    
    }
}
