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
public class S03Ejerprop03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase = scan.nextLine();
        System.out.println("La frase en minúsculas es: ");
        System.out.println(frase.toLowerCase());
        System.out.println("");
        System.out.println("La frase en mayúsculas es: ");
        System.out.println(frase.toUpperCase());
    }
    
}
