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
public class S07Ejertra07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n, num, max = 0, min = 0, suma = 0, i = 0;
        System.out.println("ingrese la cantidad de números: ");
        n = scan.nextInt();
        /*
        while (i < n) {
            System.out.println("ingrese el número " + (i + 1) + ": ");
            num = scan.nextInt();
            suma += num;
            if (i == 0) {
                max = num;
                min = num;
            } else {
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            }
            i++;
        }
        */
        do {            
            System.out.println("ingrese el número " + (i + 1) + ": ");
            num = scan.nextInt();
            suma += num;
            if (i == 0) {
                max = num;
                min = num;
            } else {
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            }
            i++;
        } while (i < n);
        System.out.println("el valor máximo es: " + max);
        System.out.println("el valor mínimo es: " + min);
        System.out.println("el promedio es: " + (suma * 1.0 / n));
    }
    
}
