import java.util.Scanner;



public class lista1_ex06_2bim_joao {
    public static void main(String[] args){
        
        Scanner s = new Scanner (System.in);
        int quantidade;
        
        System.out.println("Quantos preços você deseja informar: ");
        quantidade = s.nextInt();
        
        double [] precos = new double[quantidade];
        
        for(int i = 0; i < quantidade; ++i){
            System.out.println("Informe o preço " + (i + 1) + ": ");
            precos[i] = s.nextDouble();
        }
        
        double menor = precos[0];
        double maior = precos[0];
        double soma = 0;
        
        for(double preco : precos){
            if (preco < menor) {
                menor = preco;
            }
            if (preco > maior) {
                maior = preco;
            }
                soma = preco;
            }
        double media = soma / quantidade;
        
        System.out.println("\nMenor preço: " + menor);
        System.out.println("Maior preço: " + maior);
        System.out.println("Média dos preços: " + media);
            
    }
}
