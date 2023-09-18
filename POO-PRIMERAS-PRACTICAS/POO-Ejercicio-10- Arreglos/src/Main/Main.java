package Main;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author renem
 */
public class Main {

    public static void main(String[] args) {

        double A[]= new double [50];
        
        Random rand = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(80);
        }
        System.out.println("Arreglo A desordenado:");
        imprimirArreglo(A);
        
        Arrays.sort(A);
        
        System.out.println("Arreglo A luego de ser ordenanado: ");
        imprimirArreglo(A);
        
        double B[]= new double [20];
        
        B= Arrays.copyOf(A,10);
        imprimirArreglo(B);
        
        Arrays.fill(B, 10, 20, 0.5);
        
        imprimirArreglo(B);
        /*
        int A[] = {2, 12, 16, 8, 10, 4, 6, 14};

        System.out.println("Arreglo A: ");
        imprimirArreglo(A);
        System.out.println("Arreglo Ordenado: ");
        Arrays.sort(A);
        imprimirArreglo(A);

        int B[] = new int[5];
        Arrays.fill(B, 9);
        System.out.println("Arreglo B: ");
        imprimirArreglo(B);

        int C[] = Arrays.copyOf(A, 5);
        System.out.println("Arreglo C: ");
        imprimirArreglo(C);

        Arrays.sort(A);
        int posicion = Arrays.binarySearch(A, 6);
        System.out.println("Pocision elemento 6: " + posicion);
        
        int D[] = new int[5];
        llenarConRandoms(D);
        imprimirArreglo(D);
*/

    }

    //Es estatico para no tener que crear una clase de Objeto
    public static void imprimirArreglo(double arreglo[]) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            if (i == arreglo.length - 1) {
                System.out.print(arreglo[i]);
            } else {
                System.out.print(arreglo[i] + " ");
            }
        }
        System.out.println("]");
        System.out.println();
    }


}
