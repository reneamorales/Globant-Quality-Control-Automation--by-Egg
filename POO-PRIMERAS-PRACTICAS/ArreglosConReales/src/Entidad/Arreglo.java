package Entidad;

import java.util.Arrays;

/**
 *
 * @author renem
 */
public class Arreglo {

    private double[] datos;

    public Arreglo(int tamaño) {
        datos = new double[tamaño];
    }

    public Arreglo() {

    }

    public Arreglo(double[] datos) {
        this.datos = datos;
    }
    //Este metodo retorno los valores de cada indice del vector para el metodo copiarPrimeros.
    public double get(int indice) {
        return datos[indice];
    }

    public void llenarConAleatorios() {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = Math.random();
        }
    }

    public void ordenar() {
        Arrays.sort(datos);
    }

    public void copiarPrimeros(Arreglo A, int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            datos[i] = A.get(i);
        }
    }

    public void rellenarConValor(double valor) {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = valor;
        }
    }

    public void llenarUltimos() {
        for (int i = 10; i < 20; i++) {
            datos[i] = 0.5;
        }
    }

    public void mostrar() {
        System.out.println(Arrays.toString(datos));
    }
}
