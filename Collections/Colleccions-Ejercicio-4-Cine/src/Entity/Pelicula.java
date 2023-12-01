
package Entity;

import java.util.Comparator;

/**
 *
 * @author renem
 */
public class Pelicula implements Comparator<Pelicula>{

    private String titulo;
    private String productora;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String productora, Double duracion) {
        this.titulo = titulo;
        this.productora = productora;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", productora=" + productora + ", duracion=" + duracion + '}';
    }

    @Override
    public int compare(Pelicula t, Pelicula t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
