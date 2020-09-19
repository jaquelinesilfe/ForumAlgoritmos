package ExercicioBasicos;

import java.util.Scanner;
import ClassesExercicioBasicos.exercicio02AreaCirculo;

public class AreaCirculo02 {
    public static void main (String[] args) {
    
    exercicio02AreaCirculo objeto = new exercicio02AreaCirculo();
    
    
    Scanner scan = new Scanner(System.in); 
    System.out.println ("Escreva o valor do raio: ");
    
    objeto.setRaio(scan.nextFloat());
    
    
    objeto.setArea(Math.PI * Math.pow(objeto.getRaio(), 2.0));
    
    System.out.printf ("O valor da area é %,.4f\n ", objeto.getArea());
    
    }
}
