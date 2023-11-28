package Servicios;

import Entidad.Rutina;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioRutina {

    Scanner ingresar = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Rutina> rutinas = new ArrayList<Rutina>();

    public void registrar(Rutina rutina) {

        rutinas.add(rutina);
    }

    public void obtenerRutina() {
        System.out.println("obteniendo rutinas: ");
        System.out.println("Lista de Rutinas: ");

        for (Rutina r : rutinas) {
            r.mostrar();
            System.out.println("");
        }
    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad) {
        System.out.println("actualizando cliente: ");

        Iterator<Rutina> it = rutinas.iterator();//Un iterador más cómodo

        while (it.hasNext()) {//Mientras haya  para recorrer

            Rutina r = it.next(); //Desde la pos. en que se encuentra avanza uno mas
            if (r.getId() == id) {
                r.setNombre(nombre);
                r.setDuracion(duracion);
                r.setNivelDificultad(nivelDificultad);
            }
        }
    }

    public void eliminarRutina(int id) {
        System.out.println("eliminar cliente: ");

        Iterator<Rutina> it = rutinas.iterator();//Un iterador más cómodo

        while (it.hasNext()) {//Mientras haya  para recorrer

            Rutina r = it.next(); //Desde la pos. en que se encuentra avanza uno mas
            if (r.getId() == id) {
                rutinas.remove(r);
                return;
            }
        }
    }
}
