
package Main;

import Entity.Perro;
import Entity.Persona;
import java.util.ArrayList;

/**
 *
 * @author renem
 */
public class Ejercicio1AdopcionPerrosRelaciones {

    public static void main(String[] args) {
         ArrayList<Perro> perros = new ArrayList();

        Perro perro1 = new Perro("Toby", "Colli", 5, "Mediano");
        Perro perro2 = new Perro("Max", "Pastor", 9, "Grande");
        perros.add(perro1);
        perros.add(perro2);
        
        System.out.println("Lista de Perros: ");
        System.out.println(perros.toString());

        ArrayList<Persona> personas = new ArrayList();
        
        Persona persona1 = new Persona("Rene", "Morales", 23, 38980860, perro1);
        Persona persona2 = new Persona("Damián", "Morales", 32, 40520690, perro2);
        
        personas.add(persona1);
        personas.add(persona2);
        
        System.out.println("Lista de Personas: ");
        System.out.println(personas.toString());
        System.out.println("");
        
        System.out.println("LISTA MOSTRADA DESDE LA CLASE PERSONA");
        Persona p= new Persona();
        p.mostrarPersonasyPerros(personas);
    }
    
}
