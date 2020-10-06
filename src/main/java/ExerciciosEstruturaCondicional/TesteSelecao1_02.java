
package ExerciciosEstruturaCondicional;

import java.util.Scanner;
import ClassesExerciciosEstruturaCondicional.exercicioTesteSelecao1_02;

public class TesteSelecao1_02 {
    public static void main (String[] args) {
    
    exercicioTesteSelecao1_02 objeto = new exercicioTesteSelecao1_02();

    Scanner scan = new Scanner(System.in);
       
    System.out.println("Informe o valor de A, B, C e D: ");
    objeto.setA(scan.nextInt());
    objeto.setB(scan.nextInt());
    objeto.setC(scan.nextInt());
    objeto.setD(scan.nextInt());
    
    if(objeto.getB() > objeto.getC() && objeto.getD() > objeto.getA() &&
      (objeto.getC() + objeto.getD()) > (objeto.getA() + objeto.getB()) &&
       objeto.getC() > 0 && objeto.getD() > 0 && (objeto.getA() % 2) == 0){
        System.out.println("Valores aceitos ");
    }else{
        System.out.println("Valores não aceitos");
    }
    
    }
}
