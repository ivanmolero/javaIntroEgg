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
public class S06Ejerprop19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n; 
        System.out.println("ingrese el lado de la matriz: ");
        n = scan.nextInt();
        
        int[][] matriz = new int[n][n];
        
        llenarMatriz(matriz);
        
        mostrarMatriz(matriz);
        if (validaAntisimetrica(matriz)) {
            System.out.println("es una matriz antisimetrica");
        } else {
            System.out.println("no es una matriz antisimetrica");
        }
    }

    private static void matrizAleatoria(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int)(Math.random() * 5);
            }
        }
    }

    private static void llenarMatriz(int[][] matriz) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("ingrese el valor en la posición (" + i + "," + j + "): ");
                matriz[i][j] = scan.nextInt();
            }
        }
    }

    private static boolean validaAntisimetrica(int[][] matriz) {
        int[][] transpuesta = transponeMatriz(matriz);
        mostrarMatriz(transpuesta);
        boolean salida = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                salida = salida && transpuesta[i][j] == -matriz[i][j];
            }
        }
        return salida;
    }
    
    private static int[][] transponeMatriz(int[][] matriz) {
        int[][] salida = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                salida[j][i] = matriz[i][j];
            }
        }
        return salida;
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
