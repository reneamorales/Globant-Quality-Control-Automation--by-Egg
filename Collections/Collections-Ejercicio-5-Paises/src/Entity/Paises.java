package Entity;

import java.util.Comparator;

/**
 *
 * @author renem
 */
public class Paises implements Comparator<Paises>{

    private String pais;

    public Paises() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Paises(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Paises{" + "pais=" + pais + '}';
    }

    @Override
    public int compare(Paises t, Paises t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
