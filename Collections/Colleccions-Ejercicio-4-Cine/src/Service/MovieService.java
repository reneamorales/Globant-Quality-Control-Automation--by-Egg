package Service;

import Entity.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class MovieService {

    private Scanner read;
    private List<Pelicula> peliculas;

    public MovieService() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList();
    }

    public Pelicula ingresarPeli() {

        System.out.print("Ingrese nombre: ");
        String titulo = read.nextLine();
        System.out.print("Ingrese productora: ");
        String productora = read.nextLine();
        System.out.print("Ingrese duración: ");
        Double duracion = read.nextDouble();
        read.nextLine();

        return new Pelicula(titulo, productora, duracion);
    }

    public void agregarPeliculas(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void crearListado() {
        Pelicula ingreso = ingresarPeli();
        agregarPeliculas(ingreso);
    }

    public void mostrarListado() {
        Iterator it = peliculas.iterator();
        System.out.println("Listado de Peliculas: ");

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void mostrarListadoMayoresHora() {
        Iterator<Pelicula> it = peliculas.iterator();
        System.out.println("Mostrando Peliculas mayores a 1 de Duración:");
        while (it.hasNext()) {
            Pelicula pelicula = it.next();
            double duracion = pelicula.getDuracion();
            if (duracion > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void ordenarDuracion() {
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDuracion().compareTo(p2.getDuracion());
            }
        });
    }

    public void ordenMedianteDuracionInvertido() {
        ordenarDuracion();
        Collections.reverse(peliculas);
        System.out.println("Mostrando Peliculas por Orden de Duración INVERTIDO");
        mostrarListado();

    }
    
    public void ordenDuracionAscendente() {
        System.out.println("Mostrando Peliculas por Orden de Duración ASCENDENTE:");
        ordenarDuracion();
        mostrarListado();

    }
    
    public void ordenarPorTitulo() {
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        });
        System.out.println("Mostrando Peliculas por Orden de Titulo");
        mostrarListado();
    }
    
    public void ordenarPorProductora() {
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getProductora().compareTo(p2.getProductora());
            }
        });
        System.out.println("Mostrando Peliculas por Orden de Productora");
        mostrarListado();
    }

    
}
