/*
 Compara si una frase introducida comienza con "A".
 */
package ejercicios.intro.practica;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio9 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        char letra = 'A';
        String palabraIngresada = ingresar.nextLine();

        if (palabraIngresada.startsWith(String.valueOf(letra))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO NO COMIENZA CON LA MISMA LETRA");
        }
    }
    //Comparacion de Una CADENA con una SUBCADENA  
    /*
        String cadena = "Tomar mate";
        String subcadena = "TomaR";

        if (cadena.substring(0, 5).equals(subcadena)){
            System.out.println("CORRECTO SON IGUALES.");
        }else{
            System.out.println("INCORRECTO NO ES IGUAL LA CADENA DE LA SUBCADENA.");
        }
     */

}
