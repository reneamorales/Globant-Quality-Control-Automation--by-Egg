package Main;

import Service.MovieService;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        MovieService ms = new MovieService();

        boolean terminar = false;
        System.out.println("----------------CINE----------------");
        do {
            ms.crearListado();

            System.out.println("Desea dejar de cargar S/N");
            String descicion = read.nextLine();
            if (descicion.equalsIgnoreCase("s")) {
                ms.mostrarListado();
                terminar = true;
            }
        } while (!terminar);

        System.out.println("");
        ms.mostrarListadoMayoresHora();
        System.out.println("");
        ms.ordenMedianteDuracionInvertido();
        System.out.println("");
        ms.ordenDuracionAscendente();
        System.out.println("");
        ms.ordenarPorTitulo();
        System.out.println("");
        ms.ordenarPorProductora();

    }

}
