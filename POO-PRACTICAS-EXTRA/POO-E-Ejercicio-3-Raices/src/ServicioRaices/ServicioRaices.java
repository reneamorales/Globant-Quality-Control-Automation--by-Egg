package ServicioRaices;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioRaices {

    public Raices calcularEcuacion() {
        Scanner ingresar = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese el primer valor");
        int a = ingresar.nextInt();
        System.out.print("Ingrese el segundo valor");
        int b = ingresar.nextInt();
        System.out.print("Ingrese el tercer valor");
        int c = ingresar.nextInt();
        
        return new  Raices(a, b, c);

    }
}
