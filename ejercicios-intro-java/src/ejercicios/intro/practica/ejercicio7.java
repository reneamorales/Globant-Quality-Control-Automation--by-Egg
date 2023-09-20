/*
 Comparacion de la frase "eureka", hacer uso del método squals()
 */
package ejercicios.intro.practica;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio7 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        
        System.out.println("Ingresa la palabra:");
        String palabra = ingresar.nextLine();
        
        if (palabra.equalsIgnoreCase("eureka")) { //Compara ignorando mayuscula o minuscuia.
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }

}
