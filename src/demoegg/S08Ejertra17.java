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
public class S08Ejertra17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número por teclado: ");
        num = scan.nextInt();
        
        if (validaPrimo(num)) {
            System.out.println("el número " + num + " es primo");
        } else {
            System.out.println("el número " + num + " no es primo");
        }
        
    }

    private static boolean validaPrimo(int num) {
        boolean salida = true;
        for (int i = 2; i < num / 2; i++) {
            salida = salida && num % i != 0;
            if (!salida) return salida;
        }
        return salida;
    }
    
}
