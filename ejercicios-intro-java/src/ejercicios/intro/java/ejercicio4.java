/**
 *
 */
package ejercicios.intro.java;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio4 {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        
        //Normalmente se declara el objeto de ingreso, pero le podemos dar el 
        //nombre que nosotros queramos y usarlo como lo hemos declarado
        //Scanner leer = new Scanner(System.in);
        Scanner ingresar = new Scanner(System.in);

        System.out.println("Ingrese su NOMBRE:");
        String nombre = ingresar.nextLine();
        System.out.println("Igrese su EDAD:");
        byte edad = ingresar.nextByte();

        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años.");

    }

}
