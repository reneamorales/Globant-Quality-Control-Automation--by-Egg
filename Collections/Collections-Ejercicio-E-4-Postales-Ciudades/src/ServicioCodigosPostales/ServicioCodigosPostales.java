package ServicioCodigosPostales;

import Entity.CodigosPostales;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioCodigosPostales {

    private Scanner read;
    HashMap<Integer, CodigosPostales> ciudades;

    public ServicioCodigosPostales() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.ciudades = new HashMap();
    }

    public CodigosPostales ingresarCiudad() {
        System.out.print("Ingrese ciudad: ");
        String ciudad = read.next();

        return new CodigosPostales(ciudad);
    }

    public void agregarCiudadPostal(CodigosPostales ciudad) {
        System.out.print("Ingrese codigo postal: ");
        int codigoPostal = read.nextInt();
        ciudades.put(codigoPostal, ciudad);
    }

    public void crearCiudad() {
        CodigosPostales nuevaCiudad = ingresarCiudad();
        agregarCiudadPostal(nuevaCiudad);
    }

    public void mostrarLista() {
        for (Map.Entry<Integer, CodigosPostales> ciudadesyPostales : ciudades.entrySet()) {
           CodigosPostales ciudades = ciudadesyPostales.getValue();
            System.out.println("Ciudad: " + ciudades.getCiudad() + " Código Postal: " + ciudadesyPostales.getKey());
            //System.out.println("Ciudad: " + ciudadesyPostales.getValue().getCiudad() + " Código Postal: " + ciudadesyPostales.getKey());
        }
    }

    public void mostrarCiudad(int key) {
        System.out.println("Mostrando Ciudad: ");
        if (ciudades.containsKey(key)) {
          CodigosPostales ciudad= ciudades.get(key);
            System.out.println("La Ciudad correspondiente al Codigo Postal es: " +ciudad.getCiudad());
        }
    }
    
    public void eliminarCiudades(int key){
        System.out.println("Eliminando Ciudad por clave: ");
        if(ciudades.containsKey(key)){
            ciudades.remove(key);
            System.out.println("Ciudad eliminada corectamente");
        }else{
            System.out.println("La ciudad que ha intentado eliminar NO se ha encontrado.");
        }
    }
}
