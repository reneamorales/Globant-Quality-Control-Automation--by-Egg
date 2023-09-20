
package ejercicios.intro.java;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio8 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        // Estructura While:

        System.out.println("---------------------------------------------");
        System.out.println("-------------NOTAS ENTRE 0 Y 10--------------");

        int nota;
        System.out.println("Ingrese una Nota:");
        nota = ingresar.nextInt();

        while (nota < 0 || nota > 10) {//Evalua mientras sea verdadera la cond. es decir (MIENTRAS MENOR A O MAYOR A 10)

            System.out.println("Ingrese una Nota válida entre 1 y 10");
            nota = ingresar.nextInt();
        }

        System.out.println("El ingreso de la Nota es correcta");

    }

}
