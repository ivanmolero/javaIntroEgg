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
public class S08Ejertra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int[][] notas = new int[10][4];
        double[] ponderacion = new double[4];
        ponderacion[0] = 0.1;
        ponderacion[1] = 0.15;
        ponderacion[2] = 0.25;
        ponderacion[3] = 0.5;
        ingresaNotas(notas, scan);
        evaluaNotas(notas, ponderacion);
    }

    private static void ingresaNotas(int[][] notas, Scanner scan) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("NOTAS ALUMNO " + (i + 1));
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j] = scan.nextInt();
            }
        }
    }

    private static void evaluaNotas(int[][] notas, double[] ponderacion) {
        int aprobados = 0;
        double suma;
        for (int i = 0; i < notas.length; i++) {
            suma = 0;
            for (int j = 0; j < notas[0].length; j++) {
                suma += notas[i][j] * ponderacion[j];
            }
            if (suma >= 7.0) {
                aprobados++;
            }
        }
        System.out.println("resultados de evaluación: ");
        System.out.println("aprobados: " + aprobados);
        System.out.println("desaprobados: " + (notas.length - aprobados));
    }
    
}
