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
public class S02Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase: ");
        frase = scan.nextLine();
        System.out.println("la frase ingresada es: ");
        System.out.println(frase);
        System.out.println("la frase modificada es: ");
        System.out.println(modifica(frase));
    }
    
    public static String modifica(String frase) {
        String salida = "";
        for (int i = 0; i < frase.length(); i++) {
            salida = salida + cambio(frase.substring(i,i+1));
        }
        return salida;
    }
    
    public static String cambio(String letra) {
        letra = letra.toLowerCase();
        switch (letra) {
            case "a":
                letra = "@";
                break;
            case "e":
                letra = "#";
                break;
            case "i":
                letra = "$";
                break;
            case "o":
                letra = "%";
                break;
            case "u":
                letra = "*";
                break;
            default:
                
        }
        return letra;
    }
}
