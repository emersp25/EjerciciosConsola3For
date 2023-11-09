
package com.mycompany.tareatresintecapfor;

/**
 *
 * @author Emerson
 */
public class EjercicioCuarto {
    public void tablasMultiplicar (){
        int numero = 1;

        while (numero <= 10) {
            System.out.println("Tabla de multiplicar del " + numero + ":");

            int multiplicador = 1;
            while (multiplicador <= 10) {
                int resultado = numero * multiplicador;
                System.out.println(numero + " x " + multiplicador + " = " + resultado);
                multiplicador++;
            }

            System.out.println();
            numero++;
        }
    }
}
