
package Main;

import Service.CoutrysService;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class Main {

    public static void main(String[] args) {
         Scanner read = new Scanner(System.in).useDelimiter("\n");
        CoutrysService cs = new CoutrysService();

        boolean terminar = false;

        do {
            cs.cargarPaises();

            System.out.println("Desea dejar de cargar:");
            String descicion = read.nextLine();
            if (descicion.equalsIgnoreCase("s")) {
                cs.mostrarLista();
                terminar = true;
            }

        } while (!terminar);
       
        cs.ordenAlfabetico();
        System.out.println("");
        System.out.print("Ingrese nombre de pais a eliminar: ");
        String paisEliminar = read.next();
        cs.borrarPais(paisEliminar);
        
    }
    
}
