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
public class S05Ejerprop12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String lectura;
        int correctas = 0, total = 0;
        
        do {
            System.out.println("ingrese una cadena: ");
            lectura = scan.nextLine();
            if (lectura.length() == 5) {
                if (lectura.substring(0, 1).equals("X")) {
                    if (lectura.substring(4, 5).equals("O")) {
                        correctas++;
                    }
                }
            }
            total++;
        } while (!lectura.equals("&&&&&"));
        total--;
        System.out.println("total de lecturas: " + total);
        System.out.println("lecturas correctas: " + correctas);
        System.out.println("lecturas incorrectas: " + (total - correctas));
    }
    
}
