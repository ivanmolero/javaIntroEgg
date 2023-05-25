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
public class S02Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa un valor booleano: ");
        boolean val = scan.nextBoolean();
        
        System.out.println("Ingresa un valor double: ");
        double dobleVal = scan.nextDouble();
        
        System.out.println("Ingresa un caracter: ");
        char charVal = scan.next().charAt(0);
        
        System.out.println(val);
        System.out.println(dobleVal);
        System.out.println(charVal);
    }
    
}
