package ServicioPuntos;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioPuntos {

    Scanner ingresar = new Scanner(System.in).useDelimiter("\n");

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        Puntos puntos = new Puntos();

        System.out.println("Ingrese el valor de x1: ");
        int x1 = scanner.nextInt();

        System.out.println("Ingrese el valor de y1: ");
        int y1 = scanner.nextInt();

        System.out.println("Ingrese el valor de x2: ");
        int x2 = scanner.nextInt();

        System.out.println("Ingrese el valor de y2: ");
        int y2 = scanner.nextInt();

        Puntos p = new Puntos(x1, y1, x2, y2);
        double distancia = p.calcularDistancia();
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
}

