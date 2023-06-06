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
public class S08Ejertra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n;
        int[] vector;
        System.out.println("ingrese el tamaño del vector: ");
        n = scan.nextInt();
        vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese un valor para el vector: ");
            vector[i] = scan.nextInt();
        }
        System.out.println("la suma de los valores del vector es: " + suma(vector));
    }

    private static int suma(int[] vector) {
        int salida = 0;
        for (int i = 0; i < vector.length; i++) {
            salida += vector[i];
        }
        return salida;
    }
    
}
