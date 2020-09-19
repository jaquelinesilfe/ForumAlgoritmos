
package ExercicioBasicos;

import java.util.Scanner;
import ClassesExercicioBasicos.exercicio13GastoCombustivel;

public class GastoCombustivel13 {
    public static void main (String[] args) {
        
        exercicio13GastoCombustivel objeto= new exercicio13GastoCombustivel();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o tempo gasto na viagem e a velocidade média em km/h: ");
        objeto.setTempogasto(scan.nextInt());
        objeto.setVelocidademedia(scan.nextInt());
        objeto.setConsumomedio(12);
        
        //distancia = tempo x velocidade média
        //totalcombustivel = distancia/consumo medio
        
        objeto.setDistancia((double) objeto.getTempogasto() * objeto.getVelocidademedia());
        objeto.setTotalcombustivel((double) objeto.getDistancia()/objeto.getConsumomedio());
        
        
        System.out.printf("Quantidade combustivel em litros necessária = %,.3f\n", objeto.getTotalcombustivel());
        
    }
}
