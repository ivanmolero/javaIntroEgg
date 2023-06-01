package demoegg;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imolero
 */
public class S05Ejerprop13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("ingrese el valor del lado: ");
        n = scan.nextInt();
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j == 0 || j == n - 1 || i == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
