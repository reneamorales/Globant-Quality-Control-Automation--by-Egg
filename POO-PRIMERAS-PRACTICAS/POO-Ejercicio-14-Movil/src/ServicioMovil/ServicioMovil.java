package ServicioMovil;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioMovil {

    Scanner ingresar = new Scanner(System.in).useDelimiter("\n");

    public void cargarMovil() {

        Movil m = new Movil();

        System.out.println("Ingrese marca: ");
        String marca = ingresar.nextLine();
        System.out.println("Ingrese precio: ");
        double precio = ingresar.nextInt();
        System.out.println("Ingrese modelo: ");
        String modelo = ingresar.next();
        System.out.println("Ingrese modelo de ram: ");
        String modeloRam = ingresar.next();
        System.out.println("Ingrese almacenamiento: ");
        int almacenamiento = ingresar.nextInt();

        int[] sku = new int[7];
        int[] cod = new int[7];
        
        cod=ingresarCodigo(sku);

        Movil movil1 = new Movil(marca, precio, modelo, modeloRam, almacenamiento, sku);

        System.out.println("Información de móvil cargado: " + movil1.toString());
        
        

    }

    public int[] ingresarCodigo(int[] sku) {
        System.out.println("Ingrese codigo sku con Enters en cada ingreso: ");
        for (int i = 0; i < sku.length; i++) {
            sku[i] = ingresar.nextInt();
        }
        return sku;
    }
}
