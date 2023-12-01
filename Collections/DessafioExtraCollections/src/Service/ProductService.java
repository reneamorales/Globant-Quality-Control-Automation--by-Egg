package Service;

import Entity.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author renem
 */
public class ProductService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Producto> listaProducto = new ArrayList();
    
    Tienda t = new Tienda();

    public void agregarProducto(Producto producto) {
        listaProducto.add(producto);
    }

    public void mostrarLista() {
        for (Producto p : listaProducto) {
            System.out.println(p.toString());
        }
    }
    
    public void hacerCompra(){
        System.out.println("Ingrese producto a comprar");
        String productoComprar = read.nextLine();
        boolean comprar = t.venta(productoComprar);
    }

}
