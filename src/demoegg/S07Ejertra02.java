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
public class S07Ejertra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int a, b, c, d, aux;
        System.out.print("ingrese el valor de A: ");
        a = scan.nextInt();
        System.out.print("ingrese el valor de B: ");
        b = scan.nextInt();
        System.out.print("ingrese el valor de C: ");
        c = scan.nextInt();
        System.out.print("ingrese el valor de D: ");
        d = scan.nextInt();
        
        aux = b;
        b = c; 
        c = a; 
        a = d; 
        d = aux;
        
        System.out.println("el valor de A es: " + a);
        System.out.println("el valor de B es: " + b);
        System.out.println("el valor de C es: " + c);
        System.out.println("el valor de D es: " + d);
    }
    
}
