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
public class S05Ejerprop14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int valor;
        System.out.println("ingrese el valor a cambiar: ");
        valor = scan.nextInt();
        
        cambioLibra(valor);
        cambioDolar(valor);
        cambioYen(valor);
    }

    private static void cambioLibra(int valor) {
        System.out.println("el valor en libras es: " + valor * 0.86);
    }

    private static void cambioDolar(int valor) {
        System.out.println("el valor en dolares es: " + valor * 1.28611);
    }

    private static void cambioYen(int valor) {
        System.out.println("el valor en yenes es: " + valor * 129.852);
    }
    
}
