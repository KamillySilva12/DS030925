package ex1;

import java.util.Random;
import java.util.Scanner;


public class ex1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ale = new Random();
        int min = 1;
        int max = 20;
        int numero = ale.nextInt(max - min + 1) + min;
        int tentativa = 0;
                
        System.out.print("Número sorteado: " + numero);
       
        
        //Enquanto a tentativa do usuário for diferente do número certo, ou seja, enquanto ele estiver errando...faça
        while (tentativa != numero){
             System.out.print("\nTente acertar o número inteiro: ");
             tentativa = input.nextInt();
             
             if (tentativa > numero){
                 System.out.print("\nO número digitado é maior que o número correto, tente novamente ");
             }else if (tentativa < numero ){
                 System.out.print("\nO número digitado é menor que o número correto, tente novamente ");
             }
        }
        
        System.out.print("\nParabéns, você acertou! O número é: " + numero);
        
        
        
    }
    
}
