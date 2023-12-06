package SingleService;

import Entity.CantanteFamoso;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class SingleService {

    public void crearCantantes(List<CantanteFamoso> listaCantantes) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese Nombre de Cantante: ");
        String nombre = read.next();

        System.out.print("Ingrese nombre de Disco más Vendido: ");
        String discoMasVendido = read.next();

        CantanteFamoso cf = new CantanteFamoso(nombre, discoMasVendido);
        agregarCantante(listaCantantes, cf);

    }

    public void agregarCantante(List<CantanteFamoso> listaCantantes, CantanteFamoso cantanteNuevo) {
        listaCantantes.add(cantanteNuevo);
    }

    public void mostrarLista(List<CantanteFamoso> cantantes) {
        for (CantanteFamoso c : cantantes) {
            System.out.println(c.toString());
        }
    }

    public void eliminarDeLista(List<CantanteFamoso> cantantes, String cantanteEliminar) {
        Iterator<CantanteFamoso> it = cantantes.iterator();

        while (it.hasNext()) {
            if (it.next().getCantante().equals(cantanteEliminar)) {
                it.remove();
            }
        }
    }
}
