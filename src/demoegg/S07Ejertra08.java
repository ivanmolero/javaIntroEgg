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
public class S07Ejertra08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num, i = 0, par = 0;
        while (true) {            
            System.out.println("ingrese un número entero: ");
            num = scan.nextInt();
            i++;
            if (num % 2 == 0) par++;
            if (num % 5 == 0) break;
        }
        
        System.out.println("la cantidad de números leidos es: " + i);
        System.out.println("la cantidad de números pares es: " + par);
        System.out.println("la cantidad de números impares es: " + (i - par));
    }
    
}
