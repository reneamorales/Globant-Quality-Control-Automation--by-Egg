package ejercicios.intro.java;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        //Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.

        boolean boo = ingresar.nextBoolean();
        double dou = ingresar.nextDouble();//Admite con ",".
        char caract = ingresar.next().charAt(0);

        System.out.println("El booleano que ingreso es " + boo);
        System.out.println("El double ingresado es " + dou);
        System.out.println("El primer Caracter es " + caract);

    }

}
