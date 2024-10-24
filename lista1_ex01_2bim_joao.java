
import java.util.Scanner;

public class lista1_ex01_2bim_joao {

    public static void main(String[] args) {
        
        double notas [] = new double[4];
        double media;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Notas do aluno: ");
        System.out.println("Informe a primeira nota: ");
        notas[0] = s.nextDouble();
        System.out.println("Informe a segunda nota: ");
        notas[1] = s.nextDouble();
        System.out.println("Informe a terceira nota: ");
        notas[2] = s.nextDouble();
        System.out.println("Informe a quarta nota: ");
        notas[3] = s.nextDouble();
        
        media = (notas[0] + notas[1] + notas[2] + notas[3]) /4;
        
        System.out.println("Media: " + media);
    }
}
