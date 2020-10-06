
package ExerciciosEstruturaRepeticao;

import java.util.Scanner;


public class NumerosImpares06 {
    public static void main (String[] args) {
        
        int x = 0;
        
        System.out.println("Digite um número: ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
     
        for(int i=1;  i<=x; i++){
            if(i%2!=0){
                System.out.println( i);
            }
        }
    }
}
