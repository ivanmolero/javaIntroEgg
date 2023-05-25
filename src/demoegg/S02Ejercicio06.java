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
public class S02Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero: ");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int num2 = scan.nextInt();
        
        boolean n1 = num1 < 25;
        boolean n2 = num2 < 25;
        
        if (n1 && n2) {
            System.out.println("ambos son menores que 25");
        } else {
            if (n1 || n2) {
                if (n1) {
                    System.out.println("solo el primer numero es menor que 25");
                }
                if (n2) {
                    System.out.println("solo el segundo numero es menor que 25");
                }
            } else {
                System.out.println("ninguno es menor de 25");
            }
        }
        
    }
    
}
