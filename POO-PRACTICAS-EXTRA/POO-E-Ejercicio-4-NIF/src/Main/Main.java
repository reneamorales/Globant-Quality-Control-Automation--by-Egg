package Main;

import Entidad.Nif;
import ServicioNif.ServicioNif;

/**
 *
 * @author renem
 */
public class Main {

    public static void main(String[] args) {

        ServicioNif sn = new ServicioNif();

        Nif verificador1[] = new Nif[2];
        
        verificador1[0]= sn.crearNif();
        
        sn.mostrarNif( verificador1[0]);
        
        
        

    }

}
