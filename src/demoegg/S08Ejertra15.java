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
public class S08Ejertra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num1, num2, op;
        System.out.println("ingrese el valor del primer número: ");
        num1 = scan.nextInt();
        System.out.println("ingrese el valor del segundo número: ");
        num2 = scan.nextInt();
        do {
            menu();
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("la suma es: " + suma(num1, num2));
                    break;
                case 2: 
                    System.out.println("la resta es: " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println("la multiplicación es: " + multiplica(num1, num2));
                    break;
                case 4:
                    System.out.println("la división es: " + division(num1, num2));
                    break;
                case 5: 
                    break;
                default:
                    System.out.println("ingrese una opción válida.");
            }
        } while (op != 5);
        
        
    }

    private static void menu() {
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACIÓN");
        System.out.println("4. DIVISIÓN");
        System.out.println("5. SALIR");
        System.out.println("seleccione una opción: ");
    }

    private static int suma(int num1, int num2) {
        return num1 + num2;
    }

    private static int resta(int num1, int num2) {
        return num1 - num2;
    }

    private static int multiplica(int num1, int num2) {
        return num1 * num2;
    }

    private static double division(int num1, int num2) {
        return num1 * 1.0 / num2;
    }
    
}
