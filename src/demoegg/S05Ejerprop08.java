package demoegg;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imolero
 */
public class S05Ejerprop08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase: ");
        frase = scan.nextLine();
        if (frase.length() != 8) {
            System.out.println("INCORRECTO");
        } else {
            System.out.println("CORRECTO");
        }        
    }
    
}
