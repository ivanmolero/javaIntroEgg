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
public class S02Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int numero, contador = 0, suma = 0;
        do {            
            System.out.println("ingrese un numero: ");
            numero = scan.nextInt();
            if (numero == 0) {
                System.out.println("se capturó el número cero.");
                break;
            }
            if (numero >= 0) {
                suma = suma + numero;
            }
            contador++;
        } while (contador < 20);
        System.out.println("la suma de los números es: " + suma);
    }
    
}
