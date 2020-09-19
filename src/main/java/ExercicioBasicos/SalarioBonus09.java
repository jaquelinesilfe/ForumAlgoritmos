
package ExercicioBasicos;

import java.util.Scanner;
import java.math.BigDecimal;
import ClassesExercicioBasicos.exercicio09SalarioBonus;

public class SalarioBonus09 {
    public static void main (String [] args){
        
        exercicio09SalarioBonus objeto = new exercicio09SalarioBonus();
        
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Digite nome do funcionario: ");
        objeto.setNomefuncionario(scan.next());
        System.out.println("Digite o salário fixo: ");
        objeto.setSalariofixo(scan.nextDouble());
        System.out.println("Digite o valor das vendas: ");
        objeto.setValorvendas(scan.nextDouble());
        
        objeto.setTotal((double) (objeto.getValorvendas() * (0.15)) + objeto.getSalariofixo());
        
        
        System.out.printf("TOTAL = R$ %,.2f\n ", objeto.getTotal());
        
        
        
        
    }
}
