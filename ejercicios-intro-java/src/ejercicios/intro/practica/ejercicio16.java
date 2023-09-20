
package ejercicios.intro.practica;

import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ejercicio16 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("----------FUNCION VECTOR RANDOM BUSCAR N------------");

        // int [] v ={10, 15, 20, 25, 30} //definiendo por mi
        int[] v = new int[15];//reemplazo por 15 

        llenarVector(v);
        mostrarVector(v);

        System.out.println("Ingrese numero a buscar en el vector:");
        int buscar = ingresar.nextInt();

        buscarN(v, buscar);
    }

    public static void llenarVector(int v[]) {
        for (int i = 0; i < v.length; i++) {
            int numero = (int) (Math.random() * 50);
            v[i] = numero;
        }
    }

    public static void mostrarVector(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + v[i] + "], ");
        }
        System.out.println("");
    }

    public static void buscarN(int v[], int buscar) {
        int pos = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == buscar) {
                pos = i;
            }

        }
        if (pos != 0) {
            System.out.println("El valor buscado se encuentra en: " + pos);
        } else {
            System.out.println("El valor NO se encuentra dentro del Vector.");
        }
        System.out.println("");
    }
}
