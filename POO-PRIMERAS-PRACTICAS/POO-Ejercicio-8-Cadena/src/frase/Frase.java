package frase;

import Entidad.Cadena;
import Servicio.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class Frase {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in).useDelimiter("\n");

        Cadena frase = new Cadena();
        ServicioCadena sc = new ServicioCadena();

        System.out.println("Ingrese una frase");
        String palabras = ingresar.nextLine();

        //Envio de los valores al Constructor
        frase.setFrase(palabras);
        frase.setLongitud(palabras.length());
        
        
        //Usando los métodos
        System.out.println(sc.mostrarVocales(frase)+ " vocales");
        System.out.println("Frase invertida: "+sc.invertirFrase(frase));
        
        System.out.println("Ingrese un caracter para ver las veces que se repite: ");
        char c = ingresar.next().charAt(0);
        System.out.println(sc.vecesRepetido(frase, c));
       
        System.out.println("Ingrese una frase nueva para compararla con la existente: ");
        String otraFrase = ingresar.next();
        System.out.println("Frases iguales: " + sc.compararLongitud(frase, otraFrase));
      
        System.out.println("Ingrese una nueva frase para unirla con la existente");
        String fraseParaUnir= ingresar.next();
        System.out.println("Frase unida: "+ sc.unirFrase(frase, fraseParaUnir ));
        
        System.out.println("Ingrese un caracter para reemplazar a: a ");
        char nuevoCaracter= ingresar.next().charAt(0);
        System.out.println("Remplazo de caracter : "+ sc.reemplazar(frase, nuevoCaracter ));
        
        System.out.println("Ingrese un caracter para ver si está en la cadena ");
        char caracterAbuscar= ingresar.next().charAt(0);
        System.out.println("El caracter a buscar esta: "+ sc.contiene(frase, caracterAbuscar));
        
       
    }

}
    