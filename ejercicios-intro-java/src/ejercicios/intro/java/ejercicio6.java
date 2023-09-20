package ejercicios.intro.java;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
// Estructura IF-ELSE

        System.out.println("---------------------------------------------");

        System.out.println("Ingrese un valor ENTERO POSITIVO:");
        int num1 = ingresar.nextInt();

        System.out.println("Ingrese un valor ENTERO POSITIVO:");
        int num2 = ingresar.nextInt();

        if (num1 > 25 || num2 > 25) {
            System.out.println("Uno de los valores es mayor a 25.");
        } else // sin el else ejecuta ambos bifurcaciones a la vez en caso de ambos ser mayores
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos valores son mayor a 25.");
        } else {
            System.out.println("Ninguno de los valores ingresados es mayor a 25.");
        }

    }
}
