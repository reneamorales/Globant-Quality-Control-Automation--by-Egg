package Entity;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author renem
 */
public class Libro {

    private String titulo, autor;
    private int cantidadEjemplares, cantidadPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int cantidadEjemplares, int cantidadPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadEjemplares = cantidadEjemplares;
        this.cantidadPrestados = cantidadPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public int getCantidadPrestados() {
        return cantidadPrestados;
    }

    public void setCantidadPrestados(int cantidadPrestados) {
        this.cantidadPrestados = cantidadPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", cantidadEjemplares=" + cantidadEjemplares + ", cantidadPrestados=" + cantidadPrestados + '}';
    }

    public boolean prestamo(HashSet<Libro> lista, String libroBuscado) {
        boolean encontrado = false;

        System.out.println("Buscando titulo de libro para prestar:");
        Iterator<Libro> it = lista.iterator();

        while (it.hasNext()) {
            Libro libro = it.next();
            if (libro.getTitulo().equals(libroBuscado)) {
                if (libro.getCantidadEjemplares() > 0) {

                    libro.setCantidadPrestados(libro.getCantidadPrestados() + 1);
                    libro.setCantidadEjemplares(libro.getCantidadEjemplares() - 1);
                    encontrado = true;
                    System.out.println("HAZ PRESTADO EXITOSAMENTO UN LIBRO DE: "
                            + libro.getTitulo());
                    System.out.println("La nueva cantidad de libros prestados de " + libro.getTitulo()
                            + "\nes de : " + libro.getCantidadPrestados());
                } else {
                    System.out.println("No hay ejemplares disponibles para prestar.");
                }
            }
        }
        if (!encontrado) {
            System.out.println("NO HAY LIBRO CON TITULO: "
                    + libroBuscado);
            encontrado = false;
        }
        return encontrado;
    }

    public boolean devolverLibro(HashSet<Libro> lista, String libroDevuelto) {
        boolean encontrado = false;

        System.out.println("Buscando titulo de libro para devolver:");
        Iterator<Libro> it = lista.iterator();

        while (it.hasNext()) {
            Libro libro = it.next();
            if (libro.getTitulo().equals(libroDevuelto)) {
                if (libro.getCantidadPrestados() > 0) {

                    libro.setCantidadPrestados(libro.getCantidadPrestados() - 1);
                    libro.setCantidadEjemplares(libro.getCantidadEjemplares() + 1);
                    encontrado = true;
                    System.out.println("HAZ DEVUELTO EXITOSAMENTO UN LIBRO DE: "
                            + libro.getTitulo());
                    System.out.println("La nueva cantidad de libros disponibles de " + libro.getTitulo()
                            + "\nes de : " + libro.getCantidadEjemplares());
                } else {
                    System.out.println("No hay ejemplares para devolver.");
                }
            }
        }
        if (!encontrado) {
            System.out.println("NO HAY LIBRO CON TITULO: "
                    + libroDevuelto);
            encontrado = false;
        }
        return encontrado;
    }

    public void mostrarListaLibros(HashSet<Libro> listaLibros) {
        System.out.println("LISTA DE LIBROS DISPONIBLES: ");
        for (Libro l : listaLibros) {
            System.out.println(l);
        }
    }
}
