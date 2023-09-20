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
public class ejercicio14 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("----------FUNCION CONVERTIDOR DE MONEDA------------");

        System.out.println("Ingrese la cantidad de Euros:");
        int cant = ingresar.nextInt();
        System.out.println("Ingrese la Moneda a Convertir_");
        String moned = ingresar.next();
        String moneda = moned.toLowerCase();

        convertirValor(cant, moneda);

    }

    public static void convertirValor(int cant, String moneda) {

        double valor;

        if (moneda.equals("libra")) {
            valor = cant * 0.86;
            System.out.println("El valor de " + cant + " " + moneda + " a Euros " + "es de: " + valor);
        } else {

            if (moneda.equals("dolar")) {
                valor = cant * 1.28611;
                System.out.println("El valor de " + cant + " " + moneda + " a Euros " + "es de: " + valor);
            } else {

                if (moneda.equals("yenes")) {
                    valor = cant * 129.852;
                    System.out.println("El valor de " + cant + " " + moneda + " a Euros " + "es de: " + valor);
                } else {
                    System.out.println("Error! No es posible Convertir a esa moneda");
                }
            }
        }

    }
}
