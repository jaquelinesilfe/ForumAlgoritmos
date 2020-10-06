
package ExerciciosEstruturaCondicional;

import java.text.DecimalFormat;
import java.util.Scanner;
//import ClassesExerciciosEstruturaCondicional.exercicioNotaseMoedas01;


public class NotaseMoedas01 {
    public static void main (String[] args) {
        
    
        Scanner scan = new Scanner(System.in); 
        System.out.println("Informe o valor monetário: ");
        calcular3(scan.nextDouble());
    
    }
    
    public static void calcular3(double valor){
        DecimalFormat df = new DecimalFormat("#.##");
        double[] cedulas = {100,50,20,10,5,2};
        double[] moedas = {1,0.5,0.25,0.10,0.05, 0.01};
        int quantidadeMoeda = 0;
        
        System.out.println("NOTAS:");
        System.out.println((int)Double.parseDouble(df.format(valor/cedulas[0]).replace(",", ".")) + " notas de R$ " + cedulas[0] + "0");
        valor = valor % cedulas[0];
        System.out.println((int)Double.parseDouble(df.format(valor/cedulas[1]).replace(",", ".")) + " notas de R$ " + cedulas[1] + "0");
        valor = valor % cedulas[1];
        System.out.println((int)Double.parseDouble(df.format(valor/cedulas[2]).replace(",", ".")) + " notas de R$ " + cedulas[2] + "0");
        valor = valor % cedulas[2];
        System.out.println((int)Double.parseDouble(df.format(valor/cedulas[3]).replace(",", ".")) + " notas de R$ " + cedulas[3] + "0");
        valor = valor % cedulas[3];
        System.out.println((int)Double.parseDouble(df.format(valor/cedulas[4]).replace(",", ".")) + " notas de R$ " + cedulas[4] + "0");
        valor = valor % cedulas[4];
        System.out.println((int)Double.parseDouble(df.format(valor/cedulas[5]).replace(",", ".")) + " notas de R$ " + cedulas[5] + "0");
        valor = valor % cedulas[5];
        
        System.out.println("MOEDAS:");
        
        if(valor != 0){
            if(valor >= 1){
                quantidadeMoeda = (int)Double.parseDouble(df.format(valor / 1).replace(",", "."));
            }else{
                quantidadeMoeda = 0;
            }   
        }
        
        System.out.println(quantidadeMoeda + " moeda de R$ " + moedas[0] + "0");
        valor = Double.parseDouble(df.format(valor % moedas[0]).replace(",", "."));
        
        if(valor != 0){
            if(valor >= 0.50){
                quantidadeMoeda = (int)Double.parseDouble(df.format(valor / 0.50).replace(",", "."));
            }else{
                quantidadeMoeda = 0;
            }
                
        }
        
        System.out.println(quantidadeMoeda + " moeda de R$ " + moedas[1] + "0");
        valor = Double.parseDouble(df.format(valor % moedas[1]).replace(",", "."));
        
        if(valor != 0){
            if(valor >= 0.25){
                quantidadeMoeda = (int)Double.parseDouble(df.format(valor / 0.25).replace(",", "."));
            }else{
                quantidadeMoeda = 0;
            }
                
        }
        System.out.println(quantidadeMoeda + " moeda de R$ " + moedas[2]);
        valor = Double.parseDouble(df.format(valor % moedas[2]).replace(",", "."));
        
        quantidadeMoeda = valor >= 0.10 ? (int)Double.parseDouble(df.format(valor / 0.10).replace(",", ".")) : 0;
        System.out.println(quantidadeMoeda + " moeda de R$ " + moedas[3] + "0");
        valor = Double.parseDouble(df.format(valor % moedas[3]).replace(",", "."));
        
        quantidadeMoeda = valor >= 0.05 ? (int)Double.parseDouble(df.format(valor / 0.05).replace(",", ".")) : 0;  
        System.out.println(quantidadeMoeda + " moeda de R$ " + moedas[4]);
        valor = Double.parseDouble(df.format(valor % moedas[4]).replace(",", "."));
        
        if(valor >= 0.01){
            double divisao = valor / 0.01;
            String formatacao = df.format(divisao);
            String formatacaoComPonto = formatacao.replace(",", ".");
            int quantid = (int)Double.parseDouble(formatacaoComPonto);
        }
        
        quantidadeMoeda = valor >= moedas[5] ? (int)Double.parseDouble(df.format(valor / moedas[5]).replace(",", ".")) : 0;
        System.out.println(quantidadeMoeda + " moeda de R$ " + moedas[5]);
        valor = Double.parseDouble(df.format(valor % moedas[5]).replace(",", "."));
    }
    
    public static void calcular2(double valor){
    
        int[] cedulas = {100,50,25,10,5,2};
        double[] moedas = {1,0.5,0.25,0.10,0.05, 0.01};
        System.out.println("NOTAS:");
        if(valor >= cedulas[0]){
            System.out.println( (int)valor/cedulas[0] + " notas de R$ " + cedulas[0]);
            valor = valor % cedulas[0];
        }
        if(valor >= cedulas[1]){
            System.out.println( (int)valor/cedulas[1] + " notas de R$ " + cedulas[1]);
            valor = valor % cedulas[1];
        }
        if(valor >= cedulas[2]){
            System.out.println( (int)valor/cedulas[2] + " notas de R$ " + cedulas[2]);
            valor = valor % cedulas[2];
        }
        if(valor >= cedulas[3]){
            System.out.println( (int)valor/cedulas[3] + " notas de R$ " + cedulas[3]);
            valor = valor % cedulas[3];
        }
        if(valor >= cedulas[4]){
            System.out.println( (int)valor/cedulas[4] + " notas de R$ " + cedulas[4]);
            valor = valor % cedulas[4];
        }
        if(valor >= cedulas[5]){
            System.out.println( (int)valor/cedulas[5] + " notas de R$ " + cedulas[5]);
            valor = valor % cedulas[5];
        }
        
        System.out.println("MOEDAS:");
        
        
        
    }
    
    
    public static void calcular(double valor){
        DecimalFormat df = new DecimalFormat("#.##");
        int[] cedulas = {100,50,25,10,5,2};
        double[] moedas = {1,0.5,0.25,0.10,0.05, 0.01};

        for(int i = 0; i < cedulas.length; i++){
            if( valor >= cedulas[i] ){
                System.out.println( (int)valor/cedulas[i] + " notas de R$ " + cedulas[i]);
                valor = valor % cedulas[i];
            }
        }
        
        for(int j = 0; j < moedas.length; j++){
            if(valor >= moedas[j])
            {
                double quantidade = (int)valor/moedas[j];
                int quantidadeMoeda = (int)quantidade;
                if(valor != 0){
                    String s = String.valueOf(valor).substring(2,4);
                    int it = Integer.parseInt(s);
                    if(it < 5){
                        quantidadeMoeda = it;
                    }else{
                        quantidadeMoeda = 1;
                    }
                }
                
                System.out.println(quantidadeMoeda + " moeda de R$ " + moedas[j]);
                valor = valor % moedas[j];
                valor = Double.parseDouble(df.format(valor).replace(",", "."));
            }
        }
        System.out.println("Sobram: " +valor);
    }
}
