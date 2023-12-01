package Main;

import Entity.CantanteFamoso;
import SingleService.SingleService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        SingleService cfs = new SingleService();
        List<CantanteFamoso> cantantes = new ArrayList();

        boolean terminar = false;
        boolean t = false;

        for (int i = 0; i < 3; i++) {
            cfs.crearCantantes(cantantes);
        }
        do {

            int op = 0;
            System.out.println("Elige una Opcion: ");
            op= read.nextInt();
            System.out.println("");
            System.out.println("Agregar un cantante mas: ");
            System.out.println("Mostrar todos los Cantantes: ");
            System.out.println("Eliminar un cantante: ");
            System.out.println("Salir del Programa: ");
            System.out.println("");
            switch (op) {
                case 1:
                    cfs.crearCantantes(cantantes);
                    break;
                case 2:
                    cfs.mostrarLista(cantantes);
                    break;
                case 3:
                    System.out.println("Ingrese nombre de cantante a eliminar:");
                    String cantanteEliminar = read.next();
                    cfs.eliminarDeLista(cantantes, cantanteEliminar);
                    break;
                case 4:
                    terminar = true;break;

            }

        } while (!terminar);

        cfs.mostrarLista(cantantes);

    }
}
