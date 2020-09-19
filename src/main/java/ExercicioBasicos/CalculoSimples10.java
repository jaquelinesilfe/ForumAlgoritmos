
package ExercicioBasicos;
import java.util.Scanner;
import ClassesExercicioBasicos.exercicio10CalculoSimples;

public class CalculoSimples10 {
    public static void main (String [] args){
        
        exercicio10CalculoSimples objeto = new exercicio10CalculoSimples();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite os dados das 2 peças: o codigo da peça, o numero de peças, e o valor unitário de cada peça: ");
        objeto.setCodigopeca1(scan.nextInt());
        objeto.setNumeropecas1(scan.nextInt());
        objeto.setValorunitario1(scan.nextDouble());
        
        //System.out.println("Digite o codigo da peça 2, o numero de peças 2, e o valor unitário da peça 2: ");
        objeto.setCondigopeca2(scan.nextInt());
        objeto.setNumeropecas2(scan.nextInt());
        objeto.setValorunitario2(scan.nextDouble());
        
        objeto.setValortotal((double) objeto.getValorunitario1()* objeto.getNumeropecas1() + objeto.getValorunitario2() * objeto.getNumeropecas2());
        System.out.printf("VALOR TOTAL A PAGAR: R$ %,.2f\n", objeto.getValortotal());
    }
}
