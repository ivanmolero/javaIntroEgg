package demoegg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imolero
 */
public class S08Ejertra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(reemplaza(i,3) + " - " + reemplaza(j,3) + " - " + reemplaza(k,3));
                }
            }
        }
    }

    private static String reemplaza(int i, int valor) {
        String salida = ((Integer)i).toString();
        if (i == valor) {
            salida = "E";
        }
        return salida;
    }
    
}
