package Servicios;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioCliente {

    Scanner ingresar = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void registrar(Cliente cliente) {

        clientes.add(cliente);
    }

    public void obtenerCliente() {
        System.out.println("obteniendo cliente: ");
        System.out.println("Lista de CLientes: ");
        for (Cliente c : clientes) {
            c.mostrar();
            System.out.println("");
        }
    }

    public void actualizarCliente(int id, String nombre, int edad, double peso, String objetivo) {
        System.out.println("actualizando cliente: ");

        Iterator<Cliente> it = clientes.iterator();//Un iterador más cómodo

        while (it.hasNext()) {//Mientras haya  para recorrer

            Cliente c = it.next(); //Desde la pos. en que se encuentra avanza uno mas
            if (c.getId() == id) {
              c.setNombre(nombre);
              c.setEdad(edad);
              c.setPeso(peso);
              c.setObjetivo(objetivo);
              
            }

        }
    }
    
    public void eliminarCliente(int id) {
        System.out.println("eliminar cliente: ");
        Iterator<Cliente> it = clientes.iterator();//Un iterador más cómodo

        while (it.hasNext()) {//Mientras haya  para recorrer

            Cliente c = it.next(); //Desde la pos. en que se encuentra avanza uno mas
            if (c.getId() == id) {
              clientes.remove(c);
              return;
            }
        }
    }
    
   
}
