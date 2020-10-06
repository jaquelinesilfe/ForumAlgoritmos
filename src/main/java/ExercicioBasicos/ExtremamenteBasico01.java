
package ExercicioBasicos;

import java.util.Scanner;
import ClassesExercicioBasicos.exercicio01ExtremamenteBasico;

public class ExtremamenteBasico01 {
   public static void main (String[] args) {
    exercicio01ExtremamenteBasico objeto = new exercicio01ExtremamenteBasico();
    
    Scanner s = new Scanner (System.in);
    System.out.println("Insira dois números: ");
    
    objeto.setA(s.nextInt());
    objeto.setB(s.nextInt());
    
    objeto.setX(objeto.getA() + objeto.getB());
    
    System.out.println("X = " + objeto.getX());
    
    }
}
