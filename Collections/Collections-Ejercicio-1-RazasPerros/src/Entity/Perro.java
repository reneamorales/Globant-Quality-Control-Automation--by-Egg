package Entity;

import java.util.Comparator;

/**
 *
 * @author renem
 */

/*
Implementamos comparator en la clase, indicandole el paramentro que se desea ordenar
*/
public class Perro implements Comparator<Perro> {

    private String razaPerro;

    public Perro() {
    }

    public Perro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    @Override
    public String toString() {
        return "Perro{" + "razaPerro=" + razaPerro + '}';
    }

    @Override
    public int compare(Perro t, Perro t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
