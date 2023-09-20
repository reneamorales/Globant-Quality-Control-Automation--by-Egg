/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package ejercicios.intro.practica;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio10 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        //Numero y suma hasta el limite declarado

        System.out.println("Ingrese un numero limite de para la suma");
        int numLimite = ingresar.nextInt();

        int num;
        int suma = 0;

        while (suma <= numLimite) {
            System.out.println("Ingrese numero a sumar");
            num = ingresar.nextInt();

            suma = suma + num;
        }
        System.out.println("La suma de los valores es " + suma);

    }

}
