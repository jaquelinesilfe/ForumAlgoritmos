
package ExercicioBasicos;

import java.util.Scanner;
import ClassesExercicioBasicos.exercicio07Diferenca;

public class Diferenca07 {
    public static void main (String[] args) {
        
    exercicio07Diferenca objeto = new exercicio07Diferenca();

    Scanner s = new Scanner (System.in);
    System.out.println("Insira 4 numeros: ");
    objeto.setNumero1(s.nextInt());
    objeto.setNumero2(s.nextInt());
    objeto.setNumero3(s.nextInt());
    objeto.setNumero4(s.nextInt());
    
     objeto.setDiferenca((int) ((objeto.getNumero1() * objeto.getNumero2()) - (objeto.getNumero3() * objeto.getNumero4())));   
     System.out.print("DIFERENCA: " + objeto.getDiferenca());
    
        
    }
}
