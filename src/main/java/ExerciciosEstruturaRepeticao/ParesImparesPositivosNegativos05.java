
package ExerciciosEstruturaRepeticao;

import java.util.Scanner;


public class ParesImparesPositivosNegativos05 {
    public static void main (String[] args) {
        
        int [] vetornum = new int[5];
        int qtdPares = 0;
        int qtdImpares = 0;
        int qtdPositivos = 0;
        int qtdNegativos = 0;
        
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
            } else {
                qtdImpares ++;
            }
        
        }
        
        System.out.println(qtdPares + " Valor(es) Par(es)");
        System.out.println(qtdImpares + " Valor(es) Impar(es)");
        
        
        for ( int valor : vetornum ) {
            if (valor > 0){
                qtdPositivos ++;
            } else {
                if ( valor != 0){
                    qtdNegativos ++;
                }  
            }
        
        }
        
        System.out.println(qtdPositivos + " Valor(es) Positivo(s)");
        System.out.println(qtdNegativos + " Valor(es) Negativo(s)");
    
    }
}
