package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Lanche05 {
    public static void main (String[] args) {
        
        int item;
        int quantidade;
        double total;
         
        System.out.println("Digite um codigo do produto e a quantidade: ");
   
        Scanner scan = new Scanner(System.in);
        item = scan.nextInt();
        quantidade = scan.nextInt();
        
        if ( item == 1){
            total = 4*quantidade;
            System.out.printf("Total: R$ %,.2f\n", total);
        } else {
            if (item == 2){
                total = 4.50*quantidade;
                System.out.printf("Total: R$ %,.2f\n", total);
            } else {
                if (item == 3){
                    total = 5*quantidade;
                    System.out.printf("Total: R$ %,.2f\n", total);
                } else {
                    if (item == 4){
                        total = 2*quantidade;
                        System.out.printf("Total: R$ %,.2f\n", total);
                    } else {
                        if ( item == 5) {
                            total = 1.5*quantidade;
                            System.out.printf("Total: R$ %,.2f\n", total);
                            
                        }
                    }
                }
            }
        }

    }

}
