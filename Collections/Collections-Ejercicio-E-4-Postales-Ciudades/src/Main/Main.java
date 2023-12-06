
package Main;

import ServicioCodigosPostales.ServicioCodigosPostales;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ServicioCodigosPostales scp = new ServicioCodigosPostales();

        boolean terminar = false;
        System.out.println("---------CIUDADES Y POSTALES-----------");
        do {
            scp.crearCiudad();

            System.out.println("Desea dejar de cargar S/N");
            String descicion = read.nextLine();
            if (descicion.equalsIgnoreCase("s")) {
                scp.mostrarLista();
                terminar = true;
            }
        } while (!terminar);
        
        System.out.println("");
        System.out.println("Ingrese Codigo para Mostrar cuidad si existe: ");
        int codPostal = read.nextInt();
        scp.mostrarCiudad(codPostal);
        System.out.println("");
        scp.crearCiudad();
        System.out.println("");
        scp.mostrarLista();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese clave de Ciudad ha Eliminar");
            int clave= read.nextInt();
            scp.eliminarCiudades(clave);
        }
    }
    
}
