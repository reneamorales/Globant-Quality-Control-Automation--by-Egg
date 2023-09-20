/*
Simulacion de Dispositivo RS232, permite entradeas de formato: inicio X final de 0, de5 caracteres por frase.
Sino es aceptada se toman como icorrectos. Hasta que se ingresa "&&&&&"
 */
package ejercicios.intro.practica;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio12 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("------------OPERACIONES A PARTIR DE MENU--------------");

        String cad;
        String inicial;
        String fin;
        boolean envio;
        int correctos;
        int incorrectos;
        
        correctos= 0;
        incorrectos= 0;
        
        do{      
            System.out.println("Ingrese una cadena a enviar");          
            cad = ingresar.nextLine();
            
            inicial = cad.substring(0,1);
            fin = cad.substring(4);
          
            if (cad.length() == 5) {
                if (inicial.equals("X")) {
                    envio = true;
                    if (fin.equals("O")) {
                        envio = true;
                        System.out.println("ok");
                        correctos = correctos + 1;
                    }
                } else {
                    incorrectos = incorrectos + 1;
                }
                
            } else {
                incorrectos = incorrectos + 1;
            }
        }while (!cad.equals("&&&&&"));
        
        System.out.println("Cantidad CORRECTOS: "+ correctos);
        System.out.println("Cantidad INCORRECTOS: "+ (incorrectos-1));

    }
    
}
