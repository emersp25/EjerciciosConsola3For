
package com.mycompany.tareatresintecapfor;


/**
 *
 * @author Emerson
 */
public class EjercicioUno {
    public void pares() {
        int inicio = 1;
        int fin = 10;

        System.out.println("Números pares en el intervalo del " + inicio + " al " + fin + ":");

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
