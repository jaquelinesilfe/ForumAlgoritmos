
package ExerciciosEstruturaRepeticao;

import java.util.Scanner;


public class MaiorEPosicao07 {
    
    public static void main (String[] args) {
        
        int[] arrayResultado = new int[2];
        arrayResultado[0] = 0;
        int[] array = new int[101];
        
        System.out.println("Digite um número: ");
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] > arrayResultado[0]){
                arrayResultado[0] = array[i];
                arrayResultado[1] = i;
            }
        }
        
        
        System.out.println("O maior número é: " + arrayResultado[0] + " e sua posição é: " + arrayResultado[1]);
    }
}
