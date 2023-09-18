
package persona;

import Entidad.Persona;
import ServicioPersona.ServicioPersona;

/**
 *
 * @author renem
 */
public class Main {

    public static void main(String[] args) {

        ServicioPersona cp = new ServicioPersona();

        Persona personas[]= new Persona[4];
        
        personas[0]= cp.crearPersona();
        personas[1]= cp.crearPersona();
        personas[2]= cp.crearPersona();
        personas[3]= cp.crearPersona();
        
        double debajoDeSuPeso = 0;
        double enPesoIdeal = 0;
        double porEncima = 0;

        double mayorEdad = 0;
        double menorEdad = 0;

        for (Persona persona : personas) {

            int imc = cp.calcularIMC(persona);

            if (imc == -1) {
                System.out.println(persona.getNombre() + ": Está por debajo de su peso ideal.");
                debajoDeSuPeso++;
            } else {
                if (imc == 0) {
                    System.out.println(persona.getNombre() + ": Está en su peso ideal.");
                    enPesoIdeal++;
                } else {
                    if (imc == 1) {
                        System.out.println(persona.getNombre() + ": Tiene sobrepeso.");
                        porEncima++;
                    }
                }
            }
        }
        for (Persona persona : personas) {
            boolean ed = cp.esMayorDeEdad(persona);
            if (ed == true) {
                System.out.println(persona.getNombre() + ": Es mayor de edad.");
                mayorEdad++;
            } else {
                System.out.println(persona.getNombre() + ": Es menor de edad.");
                menorEdad++;
            }
        }

        System.out.println("---Porcenajes--");
        System.out.println("El porcentaje por debajo de su peso: " + debajoDeSuPeso / 4 * 100);
        System.out.println("El porcentaje en su peso ideal: " + enPesoIdeal / 4 * 100);
        System.out.println("El porcentaje con sobrepeso: " + porEncima / 4 * 100);
        System.out.println("");
        System.out.println("El porcentaje de mayor edad es : " + mayorEdad / 4 * 100);
        System.out.println("El porcentaje de menor edad es : " + menorEdad / 4 * 100);

    }

}
