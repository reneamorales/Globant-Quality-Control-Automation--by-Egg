
package Main;

import StoreService.StoreService;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        StoreService ss = new StoreService();

        boolean terminar = false;
        System.out.println("----------------CINE----------------");
        do {
            ss.crearProducto();

            System.out.println("Desea dejar de cargar S/N");
            String descicion = read.nextLine();
            if (descicion.equalsIgnoreCase("s")) {
                ss.mostrarProductos();
                terminar = true;
            }
        } while (!terminar);
        
        
        
        System.out.println("");
        System.out.print("ingrese clave de producto a a Cambiar Precio:");
        int clave= read.nextInt();
        System.out.print("Ingrese nuevo precio para el Producto");
        Double precioProducto= read.nextDouble();
        ss.cambiarPrecio(clave, precioProducto);
        
        System.out.println("");
        System.out.print("Ingrese clave de producto a eliminar: ");
        int claveProductoEliminar= read.nextInt();
        ss.eliminarProducto(claveProductoEliminar);
    }
    
  
}
