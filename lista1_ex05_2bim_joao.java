import java.util.Scanner;

public class lista1_ex05_2bim_joao {
    public static void main(String[] args){
        
        Scanner s = new Scanner (System.in);
        System.out.println("Quantas frutas deseja informar: ");
        int quantidade = s.nextInt();
        s.nextLine();
        
        String[] frutas = new String[quantidade];
        
        for(int i = 0; i < quantidade; i++){
            System.out.println("Informe o nome da fruta " + (i + 1) + ": ");
            frutas[i] = s.nextLine();
        }
        System.out.println("\nFrutas informadas e suas respectivas quantidades de caracteres: ");
        for(String fruta : frutas){
            System.out.println(fruta + " - " + fruta.length() + " caracteres");
        }
        
        
    }
}
