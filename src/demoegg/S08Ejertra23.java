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
public class S08Ejertra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] letras = new String[20][20];
        String palabras = "";
        matrizAleatoria(letras, 10);
        palabras = cargaPalabras(palabras);
        palabrasMatriz(letras, palabras);
        mostrarMatriz(letras);
    }
    
    private static void matrizAleatoria(String[][] matriz, int limite) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = ((Integer)((int)(Math.random() * limite))).toString();
            }
        }
    }    

    private static String cargaPalabras(String palabras) {
        int conteo = 0;
        String palabra;
        Scanner scan = new Scanner(System.in);
        do {            
            do {                
                System.out.println("ingrese una palabra de 3 a 5 caracteres: ");
                palabra = scan.nextLine();
            } while (palabra.length() > 5);
            palabras += palabra;
            conteo++;
        } while (conteo < 5);
        return palabras;
    }

    private static void palabrasMatriz(String[][] letras, String palabras) {
        int limite = letras.length;
        int posicion = (int)(Math.random() * limite);
        for (int i = 0; i < palabras.length(); i++) {
            letras[posicion][i] = palabras.substring(i, i + 1);
        }
    }

    private static void mostrarMatriz(String[][] letras) {
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[0].length; j++) {
                System.out.print(letras[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
