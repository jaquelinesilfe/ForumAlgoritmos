package ExercicioBasicos;

import java.util.Scanner;
import ClassesExercicioBasicos.exercicio05Media1;

public class Media1_05 {
    public static void main (String[] args) {
    
    exercicio05Media1 objeto = new exercicio05Media1();
    
    Scanner s = new Scanner (System.in);
    System.out.println("Insira as 2 notas do aluno entre 0 e 10: ");
    
    objeto.setA(s.nextDouble());
    objeto.setB(s.nextDouble());
    
    if (objeto.getA() > 10 || objeto.getA() < 0 && objeto.getB() < 0 || objeto.getB() > 10) {
        System.out.println("Notas inválidas, nota deve ser entre 0 e 10");
    } 
    else {
            objeto.setMedia((double) ((objeto.getA() * 3.5) + (objeto.getB() * 7.5))/(3.5 + 7.5));
            System.out.printf ("MEDIA: %,.5f\n ", objeto.getMedia());
        }
    
    }
}
