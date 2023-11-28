package ServicioNif;

import Entidad.Nif;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioNif {
    
    Scanner ingresar = new Scanner(System.in).useDelimiter("\n");
    
    public Nif crearNif() {
        Nif n = new Nif();
        
        System.out.print("Ingrese Dni:");
        int dni = ingresar.nextInt();        
        char caracter = asignarLetra(dni);
        n.setDni(dni);
        n.setLetra(caracter);
        
        System.out.println(caracter);
      
        return n;
        
    }
    
    public char asignarLetra(int dni) {
        
        int resto = (dni % 23);
        
        char[] letrasNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        char letra = letrasNIF[resto];
        
        return letra;
        
    }
    
    public void mostrarNif(Nif datos){
        
        System.out.println("NIF: "+ datos.getDni()+"-"+datos.getLetra());
        
    }
    
}
