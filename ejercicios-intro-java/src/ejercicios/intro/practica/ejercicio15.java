
package ejercicios.intro.practica;

/**
 *
 * @author renem
 */
public class ejercicio15 {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------------");
        System.out.println("----FUNCION LLENADO Y MUESTRA DE VECTOR CON 100 N-----");

        int[] v = new int[15];//reemplazo por 15 

        llenarVector(v);
        mostrarVector(v);
    }

    public static void llenarVector(int v[]) {
        for (int i = 0; i < v.length; i++) {
            v[i] = i;
        }
    }

    public static void mostrarVector(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + v[i] + "], ");
        }
        System.out.println("");
    }
}
