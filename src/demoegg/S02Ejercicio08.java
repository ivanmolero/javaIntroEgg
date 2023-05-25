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
public class S02Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        short nota;
        boolean valida; 
        do {            
            System.out.println("ingrese una nota (0-10): ");
            nota = scan.nextShort();
            valida = nota < 0 || nota > 10;
            if (valida) {
                System.out.println("la nota ingresada esta fuera de rango.");
            }
        } while (valida);
        System.out.println("la nota ingresada esta en el rango.");
    }
    
}
