import java.util.Scanner;

public class lista1_ex04_2bim_joao {
    public static void main(String[] args){
        
        int valor [] = new int[8];
        int valor2 [] = new int[8];
        int calculo [] = new int[8];
        
        Scanner s = new Scanner (System.in);
        
        for(int i =0; i < valor.length; i++){
            System.out.println("Informe os 8 primeiros valores: " + (i + 1));
            valor[i] = s.nextInt();
        }
        
        for(int i =0; i < valor2.length; i++){
            System.out.println("Informe os 8 segundo valores: " + (i + 1));
            valor2[i] = s.nextInt();
        }
        for(int i=0; i < calculo.length; i++){
            calculo[i] = valor[i] * valor2[i];
        }
        
        System.out.println("\nResultado da multiplicacao: ");
        System.out.printf("%-15s %-15s %-15s\n", "Valor 1", "Valor 2", "Resultado");
            for (int i = 0; i < calculo.length; i++) {
        System.out.printf("%-15d %-15d %-15d\n", valor[i], valor2[i], calculo[i]);
    }   
    } 
}
