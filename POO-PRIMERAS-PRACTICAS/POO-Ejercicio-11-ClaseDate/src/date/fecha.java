/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class fecha {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);

        System.out.print("Ingrese una fecha:");
        int dia = ingresar.nextInt();
        System.out.print("Ingrese mes: ");
        int mes = ingresar.nextInt();
        System.out.print("Ingrese anio: ");
        int anio = ingresar.nextInt();

        int dif = calcularAnios(dia, mes, anio);
        System.out.println("La diferencia de años es de: " + dif);

        /*
        //Formato nuestro
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = sdf.format(fechaAhora);
        System.out.println(fechaFormateada);
         */
    }

    public static int calcularAnios(int dia, int mes, int anio) {

        Date fechaAhora = new Date();
        int diaActual, mesActual, anioActual;

        diaActual = fechaAhora.getDay();
        mesActual = fechaAhora.getMonth() + 1;//Sino arranca desde 0
        anioActual = fechaAhora.getYear() + 1900;

        int diferenciaAnio = anioActual - anio;
/*
        if (mesActual <= mes) {
            if (mesActual == mes) {
                if (dia > diaActual) {
                    diferenciaAnio++;
                }
            }
        }*/
        return diferenciaAnio;
    }

}
