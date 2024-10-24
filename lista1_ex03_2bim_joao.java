import java.util.Scanner;

public class lista1_ex03_2bim_joao {
    public static void main(String[] args){
        
        Scanner s = new Scanner (System.in);
        
        String nomes [] = new String[5];
        String resultado;
        
        System.out.println("Informe os seguintes nomes: ");
        System.out.println("Informe o seu nome: ");
        nomes[0] = s.nextLine();
        System.out.println("Informe o nome do seu pai: ");
        nomes[1] = s.nextLine();
        System.out.println("Informe o nome da sua mae: ");
        nomes[2] = s.nextLine();
        System.out.println("Informe o nome do seu avô: ");
        nomes[3] = s.nextLine();
        System.out.println("Informe o nome da sua avó: ");
        nomes[4] = s.nextLine();
        
        resultado = String.join("\n", nomes);
        System.out.println("Resultado:\n " + resultado);
    }
}
