
package ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class PositivosEMedia03 {
    public static void main (String[] args) {
        
        double [] v = new double[6];
        
        
      
        System.out.println("Digite Seis valores, negativos e/ou positivos.");
        Scanner input = new Scanner(System.in);
        v[0] = input.nextDouble();
        v[1] = input.nextDouble();
        v[2] = input.nextDouble();
        v[3] = input.nextDouble();
        v[4] = input.nextDouble();
        v[5] = input.nextDouble();
      
      
        int contador = contarPositivos(v);
        double media = mediaValoresPositivos(v);
      
        System.out.println(contador + " Valores Positivos");
        
        
        
        System.out.printf("Media: %,.1f\n", media);
      
    }
    

    private static int contarPositivos(double[] v) {
        int contador = 0;
        
        
        for (double x: v) {
            if (x >= 0) {
                contador++;
                
            }
        }
        
        return contador;
        
    }

    private static double mediaValoresPositivos(double[] v) {
        int contador = 0;
        double media = 0;
        double soma = 0;
        
        
        for (double x: v) {
            if (x >= 0) {
                contador++;
                soma += x;
            }
            
        }
        media = soma/contador;
        
        return media;
    }
    
    
}

