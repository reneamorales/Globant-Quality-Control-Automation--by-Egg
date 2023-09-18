
package ServicioPersona;

import Entidad.Persona;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioPersona {

    Scanner ingresar = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.print("Ingrese el nombre: ");
        String nombre = ingresar.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (dd-MM-yyyy): ");
        String fecha = ingresar.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDeNacimiento = null;
        try {
            fechaDeNacimiento = formato.parse(fecha);
            System.out.println("Ingreso correcto");
        } catch (ParseException e) {
            System.out.println("Error al ingresar la fecha.");
        }
        return new Persona(nombre, fechaDeNacimiento);
    }
}
