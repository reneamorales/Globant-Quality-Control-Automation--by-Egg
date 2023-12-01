package Main;

import Entity.Producto;
import java.util.Scanner;
import Service.ProductService;
import Service.tienda;

/**
 *
 * @author renem
 */
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        ProductService ps = new ProductService();
        tienda t = new tienda();

        System.out.print("Ingrese cantidad de Producto a crear: ");
        int cantCrear = read.nextInt();

        for (int i = 0; i < cantCrear; i++) {
            Producto p = new Producto();

            System.out.println("Ingrese nombre de producto: ");
            p.setProducto(read.next());
            System.out.println("Ingrese categoria: ");
            p.setCategoria(read.next());
            System.out.println("Ingrese precio: ");
            p.setPrecio(read.nextDouble());
            System.out.println("Ingrese cantidad: ");
            p.setCantidad(read.nextInt());

            ps.agregarProducto(p);

        }

        ps.mostrarLista();

       
    }

}
