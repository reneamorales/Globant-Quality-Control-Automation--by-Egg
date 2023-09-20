/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
*/
package ejercicios.intro.java;

import java.util.Scanner;

public class ejercicio13y14 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        

        System.out.println("----------------------------------");
        System.out.println("------------ARREGLOS--------------");

        String equipo[] = new String[5];
        //v[0]= 5;//Esta forma pertenece a la teoría pero NO ES VALIDA
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingrese un nombre");
            equipo[i] = ingresar.nextLine();
        }

        System.out.println("Listado de Nombre dentro del vector:");

        for (int i = 0; i < equipo.length; i++) {
            if(i == equipo.length-1){
                System.out.print(equipo[i]);
            }else{
                System.out.print(equipo[i]+", ");
            }
            
        }
    }
}
