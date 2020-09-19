package ExercicioBasicos;

import java.util.Scanner;
import ClassesExercicioBasicos.exercicio03SomaSimples;

public class SomaSimples03 {
	public static void main (String[] args) {
  
    exercicio03SomaSimples objeto = new exercicio03SomaSimples();    
    
    Scanner s = new Scanner (System.in);
    System.out.println("Insira valor de A e B: ");
    objeto.setA(s.nextInt());
    objeto.setB(s.nextInt());
    
    objeto.setSoma(objeto.getA() + objeto.getB());
    System.out.println("SOMA = " + objeto.getSoma());
    
   
    }
}