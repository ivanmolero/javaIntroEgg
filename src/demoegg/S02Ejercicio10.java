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
public class S02Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3, num4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = scan.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = scan.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = scan.nextInt();
        System.out.println("Ingrese el cuarto número: ");
        num4 = scan.nextInt();
        System.out.print(num1 + " ");
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num2 + " ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num3 + " ");
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num4 + " ");
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
