
package com.mycompany.tareatresintecapfor;

/**
 *
 * @author Emerson
 */
public class EjercicioQuinto {
    public void piramide() {
        int altura = 10;

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  
        }
    }
}
