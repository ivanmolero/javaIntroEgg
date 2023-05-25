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
public class S02Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tipoMotor = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el tipo de motor (1-4):");
        tipoMotor = scan.nextInt();
        switch (tipoMotor) {
            case 1: 
                System.out.println("La bomba es una bomba de agua.");
                break; 
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón.");
                break;
            case 4: 
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("No existe un valor válido para ese tipo de bomba.");
        }
    }
    
}
