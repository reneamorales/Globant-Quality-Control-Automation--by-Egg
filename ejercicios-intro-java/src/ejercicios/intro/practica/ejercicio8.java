/*
Comparar la longitud de una palabra, admitienco una longitud solo de 8 caracteres.
 */
package ejercicios.intro.practica;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio8 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        String palabra= "";

        do {
            System.out.println("El ingreso debe ser de 8 caracteres.");
            palabra = ingresar.nextLine();
        } while (palabra.length() > 8);

        try {
            int s = Integer.parseInt(palabra);//Convierte la cadena ingesada, si se hace sin problemas el tipo de dato es numerico.
            System.out.println("Incorrecto");
        } catch (NumberFormatException e) {//En caso de error en la conversión entonces el ingreso a sido texto y numero o ambos.
            System.out.println("correcto");
        }
    }
}
