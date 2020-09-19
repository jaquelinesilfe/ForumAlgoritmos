
package ExercicioBasicos;

import java.util.Scanner;
import ClassesExercicioBasicos.exercicio06Media2;


public class Media2_06 {
    public static void main (String[] args) {
        
    exercicio06Media2 objeto = new exercicio06Media2();
    
    Scanner s = new Scanner (System.in);
    System.out.println("Insira as 3 notas do aluno entre 0 e 10: ");
    
    objeto.setA(s.nextDouble());
    objeto.setB(s.nextDouble());
    objeto.setC(s.nextDouble());
    
     if (objeto.getA() > 10 || objeto.getA() < 0 && objeto.getB() < 0 || objeto.getB() > 10 && objeto.getC() < 0 || objeto.getC() > 10) {
        System.out.println("Nota inválida, nota deve ser entre 0 e 10");
    } 
    else {
            objeto.setMedia((double) ((objeto.getA() * 2) + (objeto.getB() * 3)+ (objeto.getC() * 5))/(5 + 2 + 3));
            System.out.printf ("MEDIA: %,.1f\n ", objeto.getMedia());
        }
    }
}
