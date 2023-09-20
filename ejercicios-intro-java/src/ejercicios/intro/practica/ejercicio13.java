/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.intro.practica;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("----------CUADRADO A PARTIR DE NUMERO DADO------------");

        System.out.println("Ingresa un numero:");
        int num = ingresar.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("* ");

        }
        System.out.println();

        for (int i = 1; i < num - 1; i++) {
            System.out.print("* ");
            for (int j = 1; j < num-1; j++) {

                System.out.print("  ");
            }
            System.out.println("* ");
        }

        for (int j = 0; j < num; j++) {
            System.out.print("* ");
        }
    }

}
