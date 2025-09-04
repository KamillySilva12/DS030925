
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        String ast = "*";
        String astant = "";
        while (cont <=5){
            System.out.print(astant + "\n");
            astant = ast + astant;
            cont++;
        }
    }
    
}
