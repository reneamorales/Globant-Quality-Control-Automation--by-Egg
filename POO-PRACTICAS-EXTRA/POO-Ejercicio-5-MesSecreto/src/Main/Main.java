package Main;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class Main {

    public static void main(String[] args) {

        Scanner ingresar = new Scanner(System.in).useDelimiter("\n");

        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};

        String mesSecreto = mes[9];

        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        String mesIngresado= ingresar.next();
        boolean a = false;
          
        do {
            if (mesIngresado.equals(mesSecreto)){
            System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            mesIngresado = ingresar.next();
            }else{
                a= true;
            }
        } while (!a);
        
        if (a){
            System.out.println("¡Ha acertado!");
        }

    }

}
