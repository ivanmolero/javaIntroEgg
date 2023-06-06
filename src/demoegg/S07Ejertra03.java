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
public class S07Ejertra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String letra, vocales = "aeiouAEIOU";
        System.out.println("ingrese una letra: ");
        letra = scan.nextLine();
        if (vocales.indexOf(letra) != -1) {
            System.out.println("la letra " + letra + " es una vocal");
        } else {
            System.out.println("la letra " + letra + " no es una vocal");
        }
    }
    
}
