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
public class S03Ejerprop04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        float centigrados,fahrenheit;
        System.out.print("Ingrese la temperatura en centigrados: ");
        centigrados = scan.nextInt();
        System.out.println("");
        fahrenheit = 32 + (9 * centigrados / 5);
        System.out.println("La temperatura en fahrenheit es: " + fahrenheit);
    }
    
}
