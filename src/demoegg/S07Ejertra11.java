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
public class S07Ejertra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        long numero; 
        int digitos;
        System.out.println("ingrese un número entero: ");
        numero = scan.nextLong();
        
        digitos = calculaDigitos(numero);
        
        System.out.println("el número " + numero + " tiene " + digitos + " digitos.");
    }

    private static int calculaDigitos(long numero) {
        int d = 0;
        do {            
            d++;
        } while (Math.pow(10, d) < numero);
        return d; 
    }
    
}
