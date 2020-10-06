
package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class FormuladeBhaskara03 {

    public static void main (String[] args) {
        
        double a, b, c;
    
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Informe o valor de A, B, C: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
    
        
        double delta = Math.pow(b, 2) - 4 * (a * c );
        
        double raizdedelta = Math.sqrt(delta);
        double x1 = (b *(-1) + raizdedelta) / (2 * a);
        double x2 = (b *(-1) - raizdedelta) /(2 * a);

        if (Double.isNaN(x1) || Double.isInfinite(x1) || Double.isNaN(x2) || Double.isInfinite(x2)){
             System.out.println("Impossível calcular");    
        }
        else {
            System.out.printf("R1 = %,.5f\n", x1);
            System.out.printf("R2 = %,.5f\n", x2); 
        }
                        
    }
}
