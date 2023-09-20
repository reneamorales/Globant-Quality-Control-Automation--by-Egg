/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú: MENU
1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Salir Elija opción:
*/
package ejercicios.intro.practica;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio11 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("------OPERACIONES A PARTIR DE MENU-----------");

        System.out.println("Ingresa un primer número ");
        int num1 = ingresar.nextInt();
        System.out.println("Ingresa un primer número ");
        int num2 = ingresar.nextInt();
        int resultado;
        int option;
        boolean salir = false;
        String s;
        System.out.println();

        do {

            System.out.println(" ----MENU----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.println("Seleccione una Opcion para Operar: ");
            option = ingresar.nextInt();

            switch (option) {
                case 1:
                    resultado = Integer.sum(num1, num2);
                    System.out.println("El resultado de la Operación es: " + resultado);
                    System.out.println("");
                    break;
                case 2:
                    resultado = Math.subtractExact(num1, num2);
                    System.out.println("El resultado de la Operación es: " + resultado);
                    System.out.println();
                    break;
                case 3:
                    resultado = Math.multiplyExact(num1, num2);
                    System.out.println("El resultado de la Operación es: " + resultado);
                    System.out.println();
                    break;
                case 4:
                    resultado = Math.floorDiv(num1, num2);
                    System.out.println("El resultado de la Operación es: " + resultado);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("GRACIAS POR OPERAR!");
                    salir = true;
                    break;
                default:
                    System.out.println("! Seleccione solo una de las Opciones disponibles");
                    System.out.println();
                    break;
            }

        } while (!salir);
    }
}
   