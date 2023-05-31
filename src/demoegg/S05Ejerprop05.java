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
public class S05Ejerprop05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int valor;
        System.out.print("ingrese un número: ");
        valor = scan.nextInt();
        System.out.println("el doble es: " + valor * 2);
        System.out.println("el triple es: " + valor * 3);
        System.out.println("la raiz es: " + Math.sqrt(valor));
    }
    
}
