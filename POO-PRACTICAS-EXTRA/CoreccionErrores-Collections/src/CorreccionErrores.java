
import Entidad.Objeto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author renem
 */
public class CorreccionErrores {

    //En todos los caso se debio Importar los tipos de Colecciones
    ArrayList<Integer> listado = new ArrayList();//Debía tener declarado el tipo NO PRIMITIVO
    TreeSet<String> listado2 = new TreeSet(); //Debía aplicarse nombre y el parentesis
    HashMap<Integer, String> personas = new HashMap();//Debía cambiar el valor dentro del contenedor y cambiar al final x ().

    //AGREGANDO 5 ELEMENTOS A CADA UNO
    //LISTA:
    ArrayList<Integer> numeroA = new ArrayList();
    int x = 20;
    /*
    numeroA.add (x);

    //CONJUNTOS:
    HashSet<Integer> numerosB = new HashSet();
    Integer y = 20;

    numerosB.add (y);

    //MAPAS:
    HashMap<Integer, String> alumnos = new HashMap();
    int dni = 34578189;
    String nombreAlumno = "Pepe";

    alumnos.put(dni, nombreAlumno);
     */
//Correcion de errores
    /*
    HashMap<Integer, String> personas = new HashMap<>();
String n1 = "Albus";
String n2 = "Severus";
personas.put(1, n1);
personas.put(2, n2);
     */

    /*
    ArrayList<String> bebidas = new ArrayList<>();

    bebidas.add ("café");
    bebidas.add("té");
    
    Iterator<String> it = bebidas.iterator();

    while (it.hasNext()){
        //String bebida = it.next();//Podemos colocarlo para luego comparar con este.
        if (it.next().equals("Café")) {
            it.remove();
        }
    }
*/

}
