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
public class S07Ejertra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int ale1, ale2, adivina;
        String op = "";
        ale1 = (int)(Math.random() * 11);
        ale2 = (int)(Math.random() * 11);
        System.out.println("no verlo: " + ale1 + ", " + ale2);
        
        do {
            System.out.println("adivine el número: ");
            adivina = scan.nextInt();
            scan.reset();
            if (adivina == ale1 * ale2) {
                System.out.println("adivinaste!!!");
                op = "n";
            } else {
                System.out.println("desea volver a intenarlo? (s/n):");
                op = scan.next();
            }
        } while (op != "n");
        
    }
    
}
