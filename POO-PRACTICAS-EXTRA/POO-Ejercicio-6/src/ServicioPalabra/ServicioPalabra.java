
package ServicioPalabra;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioPalabra {

    Scanner ingresar = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        System.out.println("Ingrese la palabra:");
        String palabra = ingresar.next();
        System.out.println("ingrese cantidad de jugadas maximas");
        int cantidad = ingresar.nextInt();

        String[] cad = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            cad[i] = palabra.substring(i, i + 1);

        }

        return new Ahorcado(cad, cantidad, 0);

    }

    public int longitud(Ahorcado palabra) {
        return palabra.getBuscar().length;

    }

    public boolean buscar(Ahorcado palabra, String caract) {
        boolean e= false;
        for (int i = 0; i < longitud(palabra); i++) {

            if (caract.equals(palabra.getBuscar()[i])) {
                e = true;
                break;
            }else{
                e= false;
            }
        }
        return e;
    }
    
    public void encontrados(Ahorcado palabra, String letra){
      System.out.println(palabra.getCantidadEncontradas());     
      if(!buscar(palabra, letra)){
          System.out.println("La letra no pertenece a la palabra");
      }
       
    }
            
    public void intentos(Ahorcado palabra){
        System.out.println(palabra.getCantidadMaxima());
    }
    
    public void juego(){
        System.out.println("Longitud de la palabra:")+longitud());
        System.out.println("Mensaje: La letra pertenece a la palabra:"+ buscar());
        
    }
}
