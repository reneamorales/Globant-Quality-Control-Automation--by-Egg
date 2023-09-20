
package ejercicios.intro.java;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner ingresar = new Scanner(System.in);
        // Estructura Switch:
        System.out.println("---------------------------------------------");
        System.out.println("-------------TIPO DE MOTORES--------------");

        System.out.println("Ingrese una de las opciones de Forma aleatorio");
        System.out.println("Bomba de  Gasolina, Hormigon, Agua, Pasta Alimenticia");
        int tipoBomba = ingresar.nextInt();

        switch (tipoBomba) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es de hormigón");
                break;
            case 4:
                System.out.println("La bomba es de Pasta Alimenticia");
                break;
            default:
                System.out.println("El numero ingrese no corresponde a ninguna de las Opciones Disponibles, 1, 2, 3 ó 4");
        }

    }
}
