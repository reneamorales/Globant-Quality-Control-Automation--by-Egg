
package ServicioArreglos;

import Entidad.Arreglo;
import java.util.Arrays;

/**
 *
 * @author renem
 */
public class ServicioArreglos {

    public void ejecutar() {
        // Crear el arreglo A de 50 números reales y llenarlo con números aleatorios
        Arreglo A = new Arreglo(50);
        A.llenarConAleatorios();

        // Mostrar el arreglo A por pantalla
        System.out.println("Arreglo A:");
        A.mostrar();

        // Ordenar el arreglo A de menor a mayor
        A.ordenar();

        // Crear el arreglo B de 20 números reales
        Arreglo B = new Arreglo(20);

        // Copiar los primeros 10 números de A en B
        B.copiarPrimeros(A, 10);

        //System.out.println(Arrays.toString(micopia));
        // Rellenar los últimos 10 elementos de B con el valor 0.5
        B.llenarUltimos();

        // Mostrar los arreglos A y B por pantalla
        System.out.println("Arreglo A ordenado:");
        A.mostrar();
        System.out.println("Arreglo B:");
        B.mostrar();
    }
}
