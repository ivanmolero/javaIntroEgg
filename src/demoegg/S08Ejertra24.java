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
public class S08Ejertra24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese la cantidad de términos de la serie: ");
        int n = scan.nextInt();
        int[] vector = new int[n];
        llenarFibonacci(vector);
        mostrarVector(vector);
    }

    private static void llenarFibonacci(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i < 2) {
                vector[i] = 1;
            } else {
                vector[i] = vector[i - 1] + vector[i - 2];
            }
        }
    }
    
    private static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }    
}
