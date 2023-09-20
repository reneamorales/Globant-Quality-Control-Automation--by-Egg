/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package ejercicios.intro.practica;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Ingrese un numero a evaluar.");
        int numeroIngresado = ingresar.nextInt();

        System.out.println("El doble del numero es: " + numeroIngresado * 2);
        System.out.println("El triple del numero es: " + numeroIngresado * 3);
        System.out.println("La raiz cuadrada del numero es: " + sqrt(numeroIngresado));

    }

}
