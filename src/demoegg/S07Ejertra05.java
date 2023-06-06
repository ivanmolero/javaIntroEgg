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
public class S07Ejertra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String tipo;
        Double precio;
        System.out.println("ingrese el tipo de socio: ");
        tipo = scan.nextLine().toUpperCase();
        System.out.println("ingrese el precio del tratamiento: ");
        precio = scan.nextDouble();
        
        switch (tipo) {
            case "A":
                precio = precio * 0.5;
                break;
            case "B":
                precio = precio * 0.65;
                break;
            case "C":
                precio = precio * 1;
                break;
        }
        
        System.out.println("para el socio tipo " + tipo + " el precio con descuento es: " + precio);
    }
    
}
