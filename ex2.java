
package ex2;

import java.util.Random;
import java.util.Scanner;


public class ex2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ale = new Random();
       
        int vidaJ1 = 3;
        int vidaJ2 = 3;
        int cont = 1;
        int pontoJ1 = 0;
        int pontoJ2 = 0;
        
        System.out.print("Digite o nome do jogador 1 :\n");
        String jogador1 = input.nextLine();
        
        System.out.print("Digite o nome do jogador 2 :\n");
        String jogador2 = input.nextLine();
        
        while (vidaJ1 > 0){
            System.out.print(jogador1 + ", Digite 0 para rodar o dado\n");
            int teclado = input.nextInt();
            if (teclado == 0){
               int dado = ale.nextInt(6 - 1 + 1) + 1; 
               System.out.print("O dado número " + cont + " é: " + dado + "\n");
               pontoJ1 = pontoJ1 + dado;
            }
            vidaJ1--;
            cont++;
        }
        
        System.out.print("Jogador 2\n");
        
        while (vidaJ2 > 0){
            System.out.print(jogador2 + ", Digite 0 para rodar o dado\n");
            int teclado = input.nextInt();
            if (teclado == 0){
               int dado = ale.nextInt(6 - 1 + 1) + 1; 
               System.out.print("O dado número " + cont + " é: " + dado+ "\n");
               pontoJ2 = pontoJ2 + dado;
            }
            vidaJ2--;
            cont++;
        }

        if (pontoJ1 > pontoJ2){
            System.out.print("\nO vencedor é o/a " + jogador1);
            System.out.print("\nPontos do jogador 1: " + pontoJ1);
            System.out.print("\nPontos do jogador 2: " + pontoJ2);
        }  
        
        else if (pontoJ2 > pontoJ1){
            System.out.print("\nO vencedor é o/a " + jogador2);
            System.out.print("\nPontos do jogador 1: " + pontoJ1);
            System.out.print("\nPontos do jogador 2: " + pontoJ2);
        } else {
             System.out.print("\nDeu empate ");
        }        
    }
    
}
