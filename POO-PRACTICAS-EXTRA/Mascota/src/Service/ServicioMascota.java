/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioMascota {

    private Scanner leer;
    //private ArrayList<String> mascotas;//Aca tambien podemos hacer uso de List teniendo de igual manera que importar, teniendo algunas funcional. más.
    private List<Mascota> mascotas;

    //c vez que llamemos al ServicioMascotas el Constructor
    public ServicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();//Podemos hacer nacer (inicializar) al List por medio de ArrayList
    }

    public Mascota crearMascota() {

        System.out.println("Introducir nombre");
        String nombre = leer.nextLine();
       /*System.out.println("Introducir apodo");
        String apodo = leer.nextLine();
        System.out.println("Introducir tipo");
        String tipo = leer.nextLine();*/

        //String mascota = nombre +" " + apodo + " " +tipo;
        // Vamos a conservar los dts mediante el ArrayList
        //mascotas.add(mascota);
        //Cuando tenemos el tipo de dato de Objeto debemos retornarlo
        Mascota m = new Mascota(nombre);
        /*
        //Añadimos m
        mascotas.add(m);*/
        // y podemos retornar ugual.
        return m;

    }

    //
    public void agregarMascota(Mascota m) {
        mascotas.add(m);

    }

    //Metodo de visualizacion de Mascotas
    public void mostrarMascotas() {
        System.out.println("Las mascotas actuales de la Lista de Mascotas son: ");

        //for(Mascota var: mascotas){
        // Hacemos los cambios del tipo de datos
        for (Mascota var : mascotas) {
            //System.out.println(var);
            //Pasamos a mostrar el toString de cada pos.
            System.out.println(var.toString());

        }
        System.out.println("Cantidad: " + mascotas.size());
    }

    /**
     * Crea mascotas, todos Chiquitos
     *
     * @param cantidad equivale a la cantidad de mascotas a crear y añiador a la
     * lista.
     */
    public void fabricarChiquitos(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Tyson", "Chiquito", "Beagle"));
        }

        // Con esto nos evitamos de tener que estar creando de manera manual la creacion hasta la totalidad de la cantidad
    }

    /**
     * Crear mediante el ingreso por Consola
     *
     * @param cantidad
     */
    public void fabricaMascota(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();

            //le paso la var a metodo para que lo agregue
            agregarMascota(mascotaCreada);
            System.out.println(mascotaCreada.toString());
        }

    }

    //ACTUALIZACION DE OBJETOS - 2 Formas
    // en este caso no es necesario volver a guardarla en la Collections
    /*
    public void actualizarMascota(int index){
        Mascota m = mascotas.get(index);
        m.setApodo("Roberto");
    }*/
    public void actualizarMascotas(int index) {
        if (index <= (mascotas.size() - 1)) {
            System.out.println("");
            System.out.println("Actualizando Lista de mascota");
            Mascota m = crearMascota();
            mascotas.set(index, m);
        } else {
            System.out.println("Indice erroneo.");
        }
    }

    //Podemos eliminar por medio del indice, por Collections completa, o por Lista
    public void eliminarMascota(int index) {
        mascotas.remove(index);

    }

}
