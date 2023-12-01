package Service;

import Entity.Perro;
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
public class PerroService {

    private Scanner leer;
    private List<Perro> perros;

    //esto NO puede esta definido como VOID
    public PerroService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.perros = new ArrayList();
    }

    public Perro cargarRaza() {
        System.out.println("Ingrese nueva raza: ");
        String raza = leer.next();

        return new Perro(raza);
    }
//Llama y crea un nuevo Objeto y llama y agrega el nuevo perro creado a la lista perro
    public void cargarPerros() {
        Perro perroCargado = cargarRaza();
        agregarRaza(perroCargado);
    }
    
    //Aniade el nuevo perro creado y lo agrega a la lista
    public void agregarRaza(Perro perro) {
        perros.add(perro);
    }
    
    public void mostrarRazas() {
        System.out.println("La lista de perros es: ");
        for (Perro r : perros) {
            System.out.println(r.toString());
        }

        System.out.println("cantidad: " + perros.size());
    }

    public void buscarEnLista(String perroaBuscar) {
        /*boolean encontrada = false;
        Iterator<Perro> it = perros.iterator();

        while (it.hasNext()) {
            Perro r = it.next();

            if (perroaBuscar.equals(r.getRazaPerro())) {
                perros.remove(r);
                encontrada = true;
                System.out.println("ok");
            }
        }
        if (!encontrada) {
            System.out.println("Raza no encontrada");
        }*/
        Collections.sort(perros, new Comparator<Perro>() {
           @Override
            public int compare(Perro p1, Perro p2) {
                return p1.getRazaPerro().compareTo(p2.getRazaPerro());
            }
        });
    }
}
