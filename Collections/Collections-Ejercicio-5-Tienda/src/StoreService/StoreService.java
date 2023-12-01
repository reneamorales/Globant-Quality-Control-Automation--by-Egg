package StoreService;

import Entity.Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class StoreService {

    private Scanner read;
    HashMap<Integer, Tienda> productos;
    private int contadorDeClaves;

    public StoreService() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.productos = new HashMap();
        this.contadorDeClaves = 1;
    }

    public Tienda ingresarProducto() {
        System.out.print("Ingrese producto: ");
        String producto = read.next();
        System.out.print("Ingrese precio");
        Double precio = read.nextDouble();

        return new Tienda(producto, precio);
    }

    public void agregarProductos(Tienda producto) {
        productos.put(contadorDeClaves, producto);
        contadorDeClaves++;
    }

    public void crearProducto() {
        Tienda nuevoProducto = ingresarProducto();
        agregarProductos(nuevoProducto);
    }

    public void cambiarPrecio(int key, Double precioNuevo) {
        System.out.println("Cambiando precio de Producto");
        if (productos.containsKey(key)) {
            Tienda t = productos.get(key);
            System.out.println("El precio " + t.getProducto() + " es de : " + t.getPrecio());
            t.setPrecio(precioNuevo);
            System.out.println("El nuevo precio es: " + t.getPrecio());
        } else {
            System.out.println("La clave " + key + " NO existe en el HASHMAP");
        }
    }

    public void eliminarProducto(int key) {
        System.out.println("Eliminando Producto: ");
        if (productos.containsKey(key)) {
            productos.remove(key);
            System.out.println("El producto " + key + " ha sido eliminado del HASHMAP");
        } else {
            System.out.println("No ha sido posible hallar esa clave.");
        }
    }

    public void mostrarProductos() {
        System.out.println("Lista de Productos en el HASHMAP productos con su claves y valores: ");

        for (Map.Entry<Integer, Tienda> Entry : productos.entrySet()) {
            System.out.println("Clave: " + Entry.getKey() + " producto: " + Entry.getValue());
        }

        System.out.println("Acediendo solo a los valores de forma directa");
        for (Map.Entry<Integer, Tienda> Entry : productos.entrySet()) {
            Tienda valores = Entry.getValue();
            System.out.println("producto: " + valores.getProducto() + " precio: " + valores.getPrecio());
        }
    }

}
