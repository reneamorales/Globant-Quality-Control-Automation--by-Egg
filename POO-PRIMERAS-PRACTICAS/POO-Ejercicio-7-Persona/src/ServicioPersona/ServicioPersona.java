
package ServicioPersona;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioPersona {

    Scanner ingresar = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        
        System.out.println("Ingrese nombre:");
        String nombre = ingresar.next();
        System.out.println("Ingrese edad:");
        int edad = ingresar.nextInt();
        String sexo;
        ingresar.nextLine();
        do {
            System.out.println("Ingrese sexo (M, H ó O por otro).");
            sexo = ingresar.next();
            if (!sexo.equals("M") && !sexo.equals("H") && !sexo.equals("O")) {
                System.out.println("Incorrecto Intentalo de nuevo.");
                sexo = ingresar.next();
            }
        } while (!sexo.equals("M") && !sexo.equals("H") && !sexo.equals("O"));

        System.out.println("Ingrese peso:");
        double peso = ingresar.nextDouble();
        System.out.println("Ingrese estatura:");
        double estatura = ingresar.nextDouble();
  
        return new Persona(nombre, edad, sexo, peso, estatura); 
        
    }

    public int calcularIMC(Persona persona) {

        double imc = persona.getPeso() / Math.pow(persona.getEstatura(), 2);
        if (imc < 20) {
            return -1;
        } else {
            if (imc >= 20 && imc <= 25) {
                return 0;
            } else {
                return 1;
            }

        }
    }

    public boolean esMayorDeEdad(Persona persona) {
        int edad = persona.getEdad();
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
