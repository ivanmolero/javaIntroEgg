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
public class S02Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("ingrese el primer número: ");
        num1 = scan.nextInt();
        System.out.println("ingrese el segundo número: ");
        num2 = scan.nextInt();
        esMultiplo(num1, num2);
    }
    
    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("el primer número (" + num1 + ") es múltiplo del segundo (" + num2 + ")");
        } else {
            System.out.println("el primer número no es múltiño del segundo.");
        }
    }
    
}
