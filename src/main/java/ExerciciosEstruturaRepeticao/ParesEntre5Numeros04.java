
package ExerciciosEstruturaRepeticao;

import java.util.Scanner;


public class ParesEntre5Numeros04 {
    public static void main (String[] args) {
        
        int [] vetornum = new int[5];
        int qtdPares = 0;
        
        System.out.println("Digite 5 numeros inteiros quaisquer");
        Scanner input = new Scanner(System.in);
        vetornum[0] = input.nextInt();
        vetornum[1] = input.nextInt();
        vetornum[2] = input.nextInt();
        vetornum[3] = input.nextInt();
        vetornum[4] = input.nextInt();
        
        for ( int valor : vetornum ) {
            if (valor % 2 == 0){
                qtdPares ++;
            }
        }
        System.out.println(qtdPares + " Valores Pares");
    }
}
    

