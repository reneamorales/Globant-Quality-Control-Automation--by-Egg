package ejercicios.intro.java;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio9 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("--INGRESO Y SUMA DE NUMEROS SOLO POSITIVOS HASTA DETEC. CERO--");

        int num;
        int suma;
        int cont;

        cont = 0;
        suma = 0;
        do {
            System.out.println("Ingrese un Numero:");
            num = ingresar.nextInt();

            if (num > 0) {
                suma = suma + num;
            }
            cont++;

        } while (num != 0 && cont <= 5);

        System.out.println("La suma de los valores es de: " + suma + " " + cont);
    }

}
