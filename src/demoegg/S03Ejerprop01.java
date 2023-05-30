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
public class S03Ejerprop01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int nro1, nro2;
        System.out.print("Ingrese el primer número: ");
        nro1 = scan.nextInt();
        System.out.print("Ingrese el segundo número: ");
        nro2 = scan.nextInt();
        System.out.println("La suma de " + nro1 + " y de " + nro2 + " es: " + (nro1 + nro2));
    }
    
}
