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
public class S06Ejerprop18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matriz = new int[4][4];
        int[][] transpuesta;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int)(Math.random() * 9);
            }
        }
        
        mostrarMatriz(matriz);
        transpuesta = transponeMatriz(matriz);
        mostrarMatriz(transpuesta);
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

    private static int[][] transponeMatriz(int[][] matriz) {
        int[][] salida = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                salida[j][i] = matriz[i][j];
            }
        }
        return salida;
    }
    
}
