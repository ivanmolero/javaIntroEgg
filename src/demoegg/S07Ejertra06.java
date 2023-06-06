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
public class S07Ejertra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n, n1 = 0;
        double sumatotal = 0, sumamenor = 0, valor;
        System.out.println("ingrese la cantidad de personas a medir: ");
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("registre la medición " + (i + 1) + ": ");
            valor = scan.nextDouble();
            sumatotal += valor;
            if (valor < 1.6) {
                sumamenor += valor;
                n1++;
            }
        }
        
        System.out.println("el promedio de estaturas menores a 1.60 m es: " + sumamenor / n1);
        System.out.println("el promedio de estaturas en general es: " + sumatotal / n);
    }
    
}
