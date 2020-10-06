
package ExerciciosEstruturaCondicional;

import java.util.Scanner;


public class Media3_06 {
  
    public static void main (String[] args) {
        
        float n1, n2, n3, n4, n5;
        double media;
        double novamedia;
        String resultado = "";
        
        System.out.println("Digite as notas de um aluno: ");
   
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextFloat();
        n2 = scan.nextFloat();
        n3 = scan.nextFloat();
        n4 = scan.nextFloat();
        
        
        media = (n1 * 2 + n2 * 3 + n3 * 4 + n4*1)/10;
        
        System.out.printf("Media: %,.1f\n" , media);
        
        if (media >= 7){
            resultado = "Aluno Aprovado.";
            System.out.println(resultado);
        } else {
            if ( media <= 5){
                resultado = "Aluno reprovado.";
                System.out.println(resultado);
            } else {
                if ((media > 5) & (media < 6.9)){
                    resultado = "Aluno em exame.";
                    System.out.println(resultado);
                    
                }
            }
        }
        
       if(resultado == "Aluno em exame."){
           System.out.println("Digite Nota do exame");
           n5 = scan.nextFloat();
           System.out.println("Nota do exame: " + n5);
           
           novamedia = (media + n5)/2;
           if (novamedia > 5){
               System.out.println("Aluno aprovado.");
           } else {
               System.out.println("Aluno reprovado.");
           }
           System.out.printf("Media final: %,.1f\n" , novamedia);
           
       }
        
        //
        
        
    }
}
