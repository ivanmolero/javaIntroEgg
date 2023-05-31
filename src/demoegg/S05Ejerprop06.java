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
public class S05Ejerprop06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int valor;
        System.out.print("ingrese un número: ");
        valor = scan.nextInt();
        if (valor % 2 == 0) {
            System.out.println("el número " + valor + " es par.");
        } else {
            System.out.println("el número " + valor + " es impar.");
        }
    }
    
}
