package Service;

import Entity.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class CoutrysService {

    private Scanner read;
    HashSet<Paises> paises;

    public CoutrysService() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.paises = new HashSet();
    }

    public void cargarPaises() {
        System.out.print("Ingrese nombre pais: ");
        String nombrePais = read.next();

        Paises p = new Paises(nombrePais);
        agregarPais(p);
    }

    public void agregarPais(Paises pais) {
        paises.add(pais);
    }
//Los Conjuntos no tienen orden definido

    public void ordenAlfabetico() {
        //Deben CONVERTIRSE a LISTAS para hacer USO de los métodos de COLLECTIONS
        List<Paises> listaPaises = new ArrayList(paises);

        Collections.sort(listaPaises, new Comparator<Paises>() {
            @Override
            public int compare(Paises p1, Paises p2) {
                return p1.getPais().compareTo(p2.getPais());
            }
        });

        mostrarListaAlfa(listaPaises);
    }

    public void mostrarListaAlfa(List<Paises> listaPaises) {
        for (Paises p : listaPaises) {
            System.out.println(p.toString());
        }
    }

    public void mostrarLista() {
        for (Paises p : paises) {
            System.out.println(p.toString());
        }
    }

    public void borrarPais(String nombre) {
        Iterator<Paises> it = paises.iterator();
        boolean encontrado = false;

        System.out.println("Eliminando Pais:");
        while (it.hasNext()) {
            Paises pais = it.next();//almaceno el objeto iterado
            if (nombre.equals(pais.getPais())) { //Se obtiene y se compara el valor
                it.remove(); //re remueve el valor iterado actual 
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Pais Eliminado del CONJUNTO.");
        } else {
            System.out.println("El pais ingresado NO ha sido encontrado en el CONJUNTO.");
        }
        mostrarLista();

    }

}
