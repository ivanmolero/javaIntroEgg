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
public class S07Ejertra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int minutos, d, h, m; 
        System.out.println("ingrese el tiempo en minutos: ");
        minutos = scan.nextInt();
        d = minutos / (60 * 24);
        h = (minutos % (60 * 24)) / 60;
        m = (minutos % (60 * 24)) % 60;
        System.out.println(minutos + " representan " + d + " dias, " + h + " horas y " + m + " minutos.");
    }
    
}
