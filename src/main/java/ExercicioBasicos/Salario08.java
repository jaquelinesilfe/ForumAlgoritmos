
package ExercicioBasicos;

import java.util.Scanner;
import ClassesExercicioBasicos.exercicio08Salario;

public class Salario08 {
    
    public static void main (String [] args){
      
    exercicio08Salario objeto = new exercicio08Salario();
        
    Scanner s = new Scanner (System.in);
    System.out.println("Insira codigo do funcionario: ");
    objeto.setCodigofuncionario(s.nextInt());
    System.out.println("Insira quantidade de horas trabalhadas: ");
    objeto.setquantidadehoras(s.nextInt());
    System.out.println("Insira o valor da hora trabalhada: ");
    objeto.setValorhoratrabalhada(s.nextDouble());
    
    objeto.setSalario((double) objeto.getquantidadehoras() * objeto.getValorhoratrabalhada());
        System.out.println("NUMBER =  " + objeto.getCodigofuncionario());
        System.out.printf("SALARY = U$ %,.2f\n ", objeto.getSalario());
    

        
        
    }
}
