import java.util.Scanner;
import java.util.Random;


public class lista1_ex07_2bim_joao {
    public static void main(String[] args){
        
        int[] numeros = new int[50];
        Random r = new Random();
        int numeroUsuario;
        
        

        Scanner s = new Scanner (System.in);
        System.out.println("Informe um número entre 1 e 100: ");
        numeroUsuario = s.nextInt();
        
        for(int i = 0; i < numeros.length; ++i){
            numeros[i] = r.nextInt(100) + 1;
        }
        
        
        boolean encontrado = false;
        for (int numero : numeros){
            if (numero == numeroUsuario){
                encontrado = true;
            }
        }
        
        if (encontrado){
            System.out.println("Esta presente");
        }else{
            System.out.println("Não está presente");
        }
    
    
    }
}
