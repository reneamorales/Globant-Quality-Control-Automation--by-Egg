
package ejercicio12;

import Entidad.Persona;
import ServicioPersona.ServicioPersona;

/**
 *
 * @author renem
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        ServicioPersona servicio = new ServicioPersona();
        Persona persona1 = servicio.crearPersona();
        int edad = persona1.calcularEdad();
        
        System.out.println("Es menor de 18: "+persona1.menorQue(18));
        System.out.println("Edad: "+persona1.calcularEdad());
        persona1.mostrarPersona();
    }

}
