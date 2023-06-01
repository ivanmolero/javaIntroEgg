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
public class S05Ejerprop16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n, buscar, cont = 0;
        System.out.println("ingrese la longitud del vector: ");
        n = scan.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        
        mostrarVector(vector);
        
        System.out.println("ingrese el valor a buscar: ");
        buscar = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == buscar) {
                System.out.println("el valor " + buscar + " se encuentra en la posiciòn " + i);
                cont++;
            }
        }
        if (cont > 1) {
            System.out.println("el valor " + buscar + " se encuentra " + cont + " veces");
        }
    }

    private static void mostrarVector(int[] vector) {
        System.out.print(vector[0]);
        for (int i = 1; i < vector.length; i++) {
            System.out.print(", " + vector[i]);
        }
        System.out.println("");
    }
    
}
