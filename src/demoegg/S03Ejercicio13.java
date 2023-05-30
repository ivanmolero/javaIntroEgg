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
public class S03Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String[] equipo = new String[5];
        equipo[0] = "Hector";
        equipo[1] = "Ivan";
        equipo[2] = "Ana";
        equipo[3] = "Johan";
        equipo[4] = "Alejo";
        mostrarArreglo(equipo);
    }

    private static void mostrarArreglo(String[] equipo) {
        for (int i = 0; i < equipo.length; i++){
            System.out.println(i + ". " + equipo[i]);
        }
    }
    
}
