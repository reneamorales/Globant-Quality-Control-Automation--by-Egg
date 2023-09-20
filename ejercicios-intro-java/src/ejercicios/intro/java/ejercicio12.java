package ejercicios.intro.java;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio12 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        //Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
        System.out.println("---------------------------------------------");
        System.out.println("-------------------FUNCIONES-----------------");

        System.out.print("Ingrese un numero para evaluarlo con el segundo:");
        int numero1 = ingresar.nextInt();

        System.out.print("Ingrese un segundo numero.");
        int numero2 = ingresar.nextInt();

        EsMultiplo(numero1, numero2);
    }

    public static void EsMultiplo(int num1, int num2) {

        if (num1 % num2 == 0) {
            System.out.println("El numero es Multiplo.");
        } else {
            System.out.println("No es Multiplo");
        }
    }
}
