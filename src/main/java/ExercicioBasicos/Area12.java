
package ExercicioBasicos;
import java.util.Scanner;
import java.math.*;
import ClassesExercicioBasicos.exercicio12Area;

public class Area12 {
    public static void main(String[] args){
        
       exercicio12Area objeto = new exercicio12Area() ;
       
       Scanner scan = new Scanner(System.in);
       
        System.out.println("Digite 3 valores correspondentes a: A, B, C: ");
        objeto.setA(scan.nextDouble());
        objeto.setB(scan.nextDouble());
        objeto.setC(scan.nextDouble());
        
        objeto.setAreatriangulo((double) objeto.getA() * objeto.getC()/2);
        objeto.setAreacirculo((double) Math.PI * Math.pow(objeto.getC(), 2));
        objeto.setAreatrapezio((double) ((objeto.getA() + objeto.getB())/2) * objeto.getC());
        objeto.setAreaquadrado((double) Math.pow(objeto.getB(), 2));
        objeto.setArearetangulo((double) objeto.getA() * objeto.getB());
        
        System.out.printf("TRIANGULO = %,.3f\n", objeto.getAreatriangulo());
        System.out.printf("CIRCULO = %,.3f\n", objeto.getAreacirculo());
        System.out.printf("TRAPEZIO = %,.3f\n", objeto.getAreatrapezio());
        System.out.printf("QUADRADO = %,.3f\n", objeto.getAreaquadrado());
        System.out.printf("RETANGULO = %,.3f\n", objeto.getArearetangulo());
    }
}
