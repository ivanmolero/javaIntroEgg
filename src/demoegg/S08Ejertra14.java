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
public class S08Ejertra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n, m, suma = 0, conteo = 0;
        System.out.println("ingrese la cantidad de familias: ");
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("familia " + (i+1) + ", ingrese cuantos hijos tiene: ");
            m = scan.nextInt();
            for (int j = 0; j < m; j++) {
                System.out.println("ingrese la edad: ");
                suma += scan.nextInt();
                conteo++;
            }
        }
        System.out.println("la media de la edad de todos los hijos es: " + (suma * 1.0 / conteo));
    }
    
}
