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
public class S05Ejerprop10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int limite, suma = 0;
        System.out.println("Ingrese el valor límite: ");
        limite = scan.nextInt();
        
        do {
            System.out.println("ingrese un valor: ");
            suma += scan.nextInt();
        } while (suma < limite);
        
    }
    
}
