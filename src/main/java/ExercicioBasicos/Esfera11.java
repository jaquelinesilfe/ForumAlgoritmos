
package ExercicioBasicos;

import java.util.Scanner;
import java.math.*;
import ClassesExercicioBasicos.exercicio11Esfera;
        

public class Esfera11 {
    public static void main(String[] args){

    exercicio11Esfera objeto = new exercicio11Esfera();
    
    Scanner scan = new Scanner (System.in);
    
        System.out.println("Digite o valor do Raio: ");
        objeto.setRaio(scan.nextDouble());
        
        objeto.setVolume((double) (4/3.0) * Math.PI * Math.pow(objeto.getRaio(),3.0));
        
        System.out.printf("VOLUME = %,.3f\n", objeto.getVolume());
        
       
    }
}
