/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoegg;

/**
 *
 * @author imolero
 */
public class S08Ejertra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz1 = new int[3][3], matriz2 = new int[3][3];
        llenarMatriz(matriz1, 1);
        mostrarMatriz(matriz1);
        llenarMatriz(matriz2, 1);
        mostrarMatriz(matriz2);
        if (comparaMatriz(matriz1, matriz2)) {
            System.out.println("las matrices son iguales");
        } else {
            System.out.println("las matrices no son iguales");
        }
        llenarMatriz(matriz1, 2);
        mostrarMatriz(matriz1);
        llenarMatriz(matriz2, 1);
        mostrarMatriz(matriz2);
        if (comparaMatriz(matriz1, matriz2)) {
            System.out.println("las matrices son iguales");
        } else {
            System.out.println("las matrices no son iguales");
        }
    }

    private static void llenarMatriz(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = valor;
            }
        }
    }

    private static boolean comparaMatriz(int[][] matriz1, int[][] matriz2) {
        boolean salida = true;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                salida = salida && matriz1[i][j] == matriz2[i][j];
                if (!salida) return salida;
            }
        }
        return salida;
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
