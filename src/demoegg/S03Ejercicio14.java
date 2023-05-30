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
public class S03Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String[] equipo = new String[5];
        System.out.println("Ingresa el nombre de los miembros del equipo: ");
        for (int i = 0; i < equipo.length; i++) {
            equipo[i] = scan.nextLine();
        }
        mostrarArreglo(equipo);
    }

    private static void mostrarArreglo(String[] equipo) {
        for (int i = 0; i < equipo.length; i++){
            System.out.println(i + ". " + equipo[i]);
        }
    }
}
