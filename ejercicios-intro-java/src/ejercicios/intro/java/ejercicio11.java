package ejercicios.intro.java;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio11 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        //Cambio de caracteres de las vocales por @ # $ % *
        System.out.println("-------------------------------------");
        System.out.println("--------------FUNCIONES--------------");

        String vocales = "aeiouAEIOU";
        System.out.println("Ingrese una Frase;");
        String cad = ingresar.nextLine();
        String cadenaNueva = cad;

        for (int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if (vocales.indexOf(c) != -1) {
                switch (c) {
                    case 'a':
                    case 'A':
                        cadenaNueva = cadenaNueva.substring(0, i) + '@' + cadenaNueva.substring(i+1); // reemplaza la vocal 'a' por '@'
                        break;
                    case 'e':
                    case 'E':
                        cadenaNueva = cadenaNueva.substring(0, i) + '#' + cadenaNueva.substring(i+1); // reemplaza la vocal 'e' por '#'
                        break;
                    case 'i':
                    case 'I':
                        cadenaNueva = cadenaNueva.substring(0, i) + '$' + cadenaNueva.substring(i+1); // reemplaza la vocal 'i' por '$'
                        break;
                    case 'o':
                    case 'O':
                        cadenaNueva = cadenaNueva.substring(0, i) + '%' + cadenaNueva.substring(i+1); // reemplaza la vocal 'o' por '%'
                        break;
                    case 'u':
                    case 'U':
                        cadenaNueva = cadenaNueva.substring(0, i) + '*' + cadenaNueva.substring(i + 1); // reemplaza la vocal 'u' por '*'
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.println(cadenaNueva);

    }

}
