/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoegg;

import java.util.Scanner;

/**
 *
 * @author imolero
 */
public class S07Ejertra09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int dividendo, divisor, div = 0;
        System.out.println("ingrese el dividendo: ");
        dividendo = scan.nextInt();
        System.out.println("ingrese el divisor: ");
        divisor = scan.nextInt();
        do {
            dividendo -= divisor;
            div++;
        } while (dividendo > divisor);
        System.out.println("la división es: " + div);
        System.out.println("y el residuo es: " + dividendo);
    }
    
}
