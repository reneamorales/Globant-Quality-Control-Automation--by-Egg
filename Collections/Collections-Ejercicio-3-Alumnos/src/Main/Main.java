package Main;

import Service.ServicioAlumno;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ServicioAlumno sa = new ServicioAlumno();

        boolean terminar = false;

        do {
            sa.cargarAlumnoNotas();

            System.out.println("Desea dejar de cargar:");
            String descicion = read.nextLine();
            if (descicion.equalsIgnoreCase("s")) {
                terminar = true;
            }

        } while (!terminar);

        System.out.print("muestra de Lista:");
        sa.mostrarLista();

        System.out.println("Ingrese nombre del Alumno para Promediar");
        String nombre = read.next();

        double promedio1 = sa.promedirAlumno(nombre);
        System.out.println(promedio1);
    }

}
