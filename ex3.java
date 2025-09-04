
package ex3;

import java.util.Scanner;

public class ex3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        int vogal = 0;
        String palavra = "";
        System.out.print("Forme uma palavra de 5 letras\n");
        while (cont <5 ){
            cont++;
            System.out.print("Digite a " + cont + " letra:\n");
            String letra = input.nextLine();
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") ){
                vogal++;
               
            }
            palavra = palavra + letra;
        }
       
        System.out.print("A palavra digitada foi: " + palavra.toUpperCase());
        System.out.print("\nO total de vogais nesta palavra é de: " + vogal);
    }
    
}
