import java.util.Scanner;

public class lista1_ex02_2bim_joao {
    public static void main(String[] args){

       double notas [] = new double[10];
       double mediaFinal;
       double soma = 0.0;
       double menor = Double.MAX_VALUE;
       double maior = Double.MIN_VALUE;
       
       
       
       Scanner s = new Scanner (System.in);
        
       for(int i= 0; i < notas.length; i++){
           System.out.println("Nota dos alunos: " +(i + 1));
           notas[i] = s.nextDouble();
           soma += notas[i];
       
       if (notas[i] < menor){
           menor = notas[i];
       }
       if (notas[i] > maior){
           maior = notas[i];
       }
       
       }
    
       mediaFinal = soma / notas.length;
       
        System.out.println("Media final: " + mediaFinal);
        System.out.println("Maior nota:  " + maior);
        System.out.println("Menor nota:  " + menor);
    }
}


