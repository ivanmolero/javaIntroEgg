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
public class S08Ejertra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String nombre, op = "s";
        int edad; 
        int n, cont = 0;
        System.out.println("ingrese la cantidad de personas: ");
        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
        }
        do {       
            if (cont >= n) {
                System.out.println("desea seguir ingresando nombres? (si/no)");
                op = scan2.nextLine();
                System.out.println(op);
            }
            if (!op.equals("no")) {
                System.out.println("ingrese el nombre: ");
                nombre = scan2.nextLine();
                System.out.println("ingrese la edad: ");
                edad = scan.nextInt();
                mostrarDatos(nombre, edad);
            }
            cont++;
        } while (!op.equals("no"));
    }

    private static void mostrarDatos(String nombre, int edad) {
        System.out.println("------------------------------");
        System.out.println("NOMBRE: " + nombre);
        System.out.println("EDAD: " + edad);
        if (edad >= 18) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("es menor de edad");
        }
        System.out.println("------------------------------");
    }
    
}
