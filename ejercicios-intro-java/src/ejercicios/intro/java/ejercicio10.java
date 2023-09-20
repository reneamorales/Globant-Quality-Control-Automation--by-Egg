package ejercicios.intro.java;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio10 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("--LECTURA DE 4 NUMS. E IMPRESION DE ATERISCO CORRESPODIENTE A CADA VALOR--");

      
        int val;
        int cont = 1;
        String carac = "*";

        do {
            System.out.println("Ingrese valor a imprimir");

            val = ingresar.nextInt();
            System.out.print(val + ":");

            for (int i = 0; i < val; i++) {
                System.out.print(carac);
            }
            cont++;

        } while (cont <= 4);
    }

}
