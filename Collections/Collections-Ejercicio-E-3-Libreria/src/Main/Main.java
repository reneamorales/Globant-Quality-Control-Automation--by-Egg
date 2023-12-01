package Main;

import Entity.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Libro lib = new Libro();
        HashSet<Libro> libros = new HashSet();

        boolean terminar = false;
        System.out.println("----------------Biblioteca----------------");
        do {

            System.out.print("Ingrese titulo de Libro: ");
            String titulo = read.next();
            System.out.print("Ingrese titulo de autor: ");
            String autor = read.next();
            System.out.print("Ingrese titulo de cantidad de ejemplares: ");
            int cantidadEjemplares = read.nextInt();
            System.out.print("Ingrese titulo de cantida de ejemplares prestados: ");
            int cantEjempPrestados = read.nextInt();

            Libro nl = new Libro(titulo, autor, cantidadEjemplares, cantEjempPrestados);

            libros.add(nl);

            System.out.println("Desea dejar de cargar libros S/N");
            String descicion = read.next();

            if (descicion.equalsIgnoreCase("s")) {
                lib.mostrarListaLibros(libros);
                terminar = true;
            }
        } while (!terminar);

        System.out.println("");
        System.out.println("Ingrese nombre de libro para prestar: ");
        String libroPrestar = read.next();
        boolean prestamo= lib.prestamo(libros, libroPrestar);
        System.out.println("Prestamo exitoso: "+ prestamo);
        System.out.println("");
        lib.mostrarListaLibros(libros);
        System.out.println("");
        System.out.println("Ingrese nombre de libro ha devolver: ");
        String libroDevolver = read.next();
        boolean devolucion= lib.devolverLibro(libros, libroDevolver);
        System.out.println("Devolucion Exitosa: "+ devolucion);
        
        System.out.println("");
        lib.mostrarListaLibros(libros);

    }

}
