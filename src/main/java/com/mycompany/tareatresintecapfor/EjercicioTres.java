
package com.mycompany.tareatresintecapfor;

/**
 *
 * @author Emerson
 */
public class EjercicioTres {
    public void multiplosCinco() {
        int inicio = 0;
        int fin = 50;

        System.out.println("Números multiplos del " + inicio + " al " + fin + ":");

        for (int i = inicio; i <= fin; i+=5) {
                System.out.println(i);
        }
    }
}
