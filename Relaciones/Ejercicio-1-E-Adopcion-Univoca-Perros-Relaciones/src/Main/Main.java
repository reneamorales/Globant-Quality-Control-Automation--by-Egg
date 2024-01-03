package Main;

import Entity.Perro;
import Entity.Persona;
import Service.ServiceAdopcionPerro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ServiceAdopcionPerro sap = new ServiceAdopcionPerro();

        List<Persona> personas = new ArrayList<>();
        List<Perro> perros = new ArrayList<>();

        cargarPerros(read, sap, perros);
        System.out.println("Bienvenido a la adopción de Pichichos");
        System.out.println("Aquí, cada perrito está esperando a su nuevo mejor amigo. Navega, elige y adopta. ");
        System.out.println("Ahora, aquí están los perritos disponibles para adopción:");
        sap.mostrarListaDePerros(perros);

        cargarPersonas(read, sap, personas);

        boolean Salir = false;

        do {
            adoptarPerro(read, sap, personas, perros);

            System.out.println("Desea continuar: ");
            String eleccion = read.next();
            if (!eleccion.equalsIgnoreCase("si")) {
                Salir = true;
            }
        } while (!Salir);
        sap.mostrarListaAdopciones();
    }

    public static void cargarPerros(Scanner read, ServiceAdopcionPerro sap, List<Perro> perros) {

        perros.add(new Perro("Fido", "Labrador", 3, "Grande"));
        perros.add(new Perro("Rex", "Pastor Alemán", 5, "Grande"));
        perros.add(new Perro("Luna", "Caniche", 2, "Pequeño"));
        perros.add(new Perro("Toby", "Beagle", 4, "Mediano"));
        perros.add(new Perro("Bella", "Bulldog Francés", 1, "Pequeño"));
        perros.add(new Perro("Max", "Boxer", 6, "Grande"));
        perros.add(new Perro("Lucy", "Chihuahua", 3, "Pequeño"));
        perros.add(new Perro("Charlie", "Golden Retriever", 7, "Grande"));
        perros.add(new Perro("Rocky", "Rottweiler", 4, "Grande"));
        perros.add(new Perro("Molly", "Yorkshire Terrier", 2, "Pequeño"));
    }

    public static void cargarPersonas(Scanner read, ServiceAdopcionPerro sap, List<Persona> personas) {

        personas.add(new Persona("Juan", "Pérez", 25, 12345678));
        personas.add(new Persona("María", "García", 32, 23456789));
        personas.add(new Persona("Carlos", "Rodríguez", 40, 34567890));
        personas.add(new Persona("Ana", "Fernández", 28, 45678901));
        personas.add(new Persona("Luis", "González", 35, 56789012));
        personas.add(new Persona("Marta", "López", 30, 67890123));
        personas.add(new Persona("Javier", "Martínez", 45, 78901234));
        personas.add(new Persona("Sofía", "Hernández", 22, 89012345));
        personas.add(new Persona("Pedro", "Gómez", 50, 90123456));
        personas.add(new Persona("Lucía", "Ruiz", 27, 1234567));
    }

    public static void adoptarPerro(Scanner read, ServiceAdopcionPerro sap, List<Persona> personas, List<Perro> perros) {
        boolean perroEnLista=false;
        System.out.println("Cual es el perro que adopta: ");
        String nombrePerro = read.next();
        Iterator it= perros.iterator();
        while(it.hasNext()) {
                if (((Perro)it.next()).getNombre().equals(nombrePerro)){
                    perroEnLista= true;
                    boolean fueAdoptado = sap.verificarPerroEnLista(nombrePerro);
                    if (fueAdoptado) {
                        System.out.println("Adopta otro perro.");
                    } else {
                        System.out.println("Quieres adoptarlo? ");
                        String adoptar = read.next();
                        if (adoptar.equalsIgnoreCase("si")) {
                            System.out.println("ingrese su documento: ");
                            int documentoPersona = read.nextInt();
                            sap.adoptarEste(nombrePerro, documentoPersona, personas);
                        }
                    }
                    break;
                }              
        }  
        if(!perroEnLista){
            System.out.println("Debe ingresar un nombre de la lista:");
        }
    }

        
}
    


    


