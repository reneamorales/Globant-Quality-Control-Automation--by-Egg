package Service;

import Entity.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author renem
 */
public class Tienda {

   // List<Producto> listaProducto = new ArrayList<>();

    public boolean venta(String productoBuscado) {
        boolean encontrado = false;
        Iterator<Producto> it = listaProducto.iterator();

        while (it.hasNext()) {

            Producto p = it.next();
            if (p.getProducto().equalsIgnoreCase(productoBuscado)) {
                if (p.getCantidad() > 0) {
                    System.out.println(p.getProducto());
                    p.setCantidad(p.getCantidad() - 1);
                    encontrado = true;
                } else {
                    System.out.println("No hay stock disponible");
                }
            }
        }
        return encontrado;
    }
}
