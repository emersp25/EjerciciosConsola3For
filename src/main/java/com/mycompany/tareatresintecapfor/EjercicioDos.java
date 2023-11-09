
package com.mycompany.tareatresintecapfor;

/**
 *
 * @author Emerson
 */
public class EjercicioDos {
    public void impares(){
        int inicio = 1;
        int fin = 10;

        System.out.println("Números impares en el intervalo del " + inicio + " al " + fin + ":");

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
