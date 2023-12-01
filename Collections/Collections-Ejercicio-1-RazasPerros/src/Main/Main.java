package Main;

import Service.PerroService;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PerroService ps = new PerroService();

        boolean terminar = false;

        do {
            ps.cargarPerros();
            
            System.out.println("Quiere guardar otro perro ó desea salir: s/n");
            String descicion = leer.nextLine();
            if(descicion.equalsIgnoreCase("s")){
                ps.mostrarRazas();
                terminar = true;
            }

        } while (!terminar);
        
        System.out.println("Ingrese un perro a eliminar:");
        String perroEliminar =  leer.nextLine();
        
        ps.buscarEnLista(perroEliminar);
        ps.mostrarRazas();

    }

}
