package ExercicioBasicos;

import java.util.Scanner;
import ClassesExercicioBasicos.exercicio04Produto;

public class ProdutoSimples04 {
 
    public static void main (String[] args) {
        
    exercicio04Produto objeto = new exercicio04Produto();
    
    Scanner s = new Scanner (System.in);
    System.out.println("Insira 2 numeros: ");
    objeto.setNumero1(s.nextInt());
    objeto.setNumero2(s.nextInt());
   
    
     objeto.setproduto((int) ((objeto.getNumero1() * objeto.getNumero2())));
     System.out.print("PROD = " + objeto.getproduto());
        
    }
}
       
            

