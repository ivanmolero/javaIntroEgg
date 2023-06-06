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
public class S07Ejerprop21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int longmatbase, longmatbusca;
        int[][] matrizBase, matrizBusqueda;
        System.out.println("Ingrese el tamaño de la matriz grande: ");
        longmatbase = scan.nextInt();
        matrizBase = new int[longmatbase][longmatbase];
        System.out.println("Ingrese el tamaño de la matriz a buscar: ");
        longmatbusca = scan.nextInt();
        matrizBusqueda = new int[longmatbusca][longmatbusca];
        matrizAleatoria(matrizBase, 2);
        matrizAleatoria(matrizBusqueda, 2);
        mostrarMatriz(matrizBase);
        mostrarMatriz(matrizBusqueda);
        
        buscarSubmatriz(matrizBase, matrizBusqueda);
    }
    
    private static void matrizAleatoria(int[][] matriz, int limite) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int)(Math.random() * limite);
            }
        }
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

    private static void buscarSubmatriz(int[][] matrizBase, int[][] matrizBusqueda) {
        for (int i = 0; i <= matrizBase.length - matrizBusqueda.length; i++) {
            for (int j= 0; j <= matrizBase[0].length - matrizBusqueda[0].length; j++) {
                // [i][j] es la primera celda de busqueda
                if (validaSubmatriz(i, j, matrizBase, matrizBusqueda)) {
                    System.out.println("la matriz a buscar se encuentra en la matriz base: ");
                    System.out.println("se ubica en la posición [" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println("la matriz a buscar no se encuentra en la matriz base.");
    }

    private static boolean validaSubmatriz(int a, int b, int[][] matrizBase, int[][] matrizBusqueda) {
        boolean salida = true;
        for (int i = 0; i < matrizBusqueda.length; i++) {
            for (int j = 0; j < matrizBusqueda[0].length; j++) {
                salida = salida && matrizBusqueda[i][j] == matrizBase[a + i][b + j];
                if (!salida) return salida; 
            }
        }
        return salida;
    }
}
