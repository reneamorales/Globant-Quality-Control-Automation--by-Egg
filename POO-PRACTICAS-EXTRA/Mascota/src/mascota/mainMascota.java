/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

import Service.ServicioMascota;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author renem
 */
public class mainMascota {

    public static void main(String[] args) {

        ServicioMascota sm = new ServicioMascota();
        
        sm.crearMascota();
        sm.crearMascota();
        
        sm.mostrarMascotas();
 /*
        sm.fabricarChiquitos(5);
        sm.mostrarMascotas();
         */
/*
        sm.fabricaMascota(2);
        sm.mostrarMascotas();

        sm.actualizarMascotas(0);
        sm.mostrarMascotas();

        sm.eliminarMascota(0);
        sm.mostrarMascotas();

        sm.actualizarMascotas(4);//Intento de act. con indice erroneo.
        sm.mostrarMascotas();
*/
        //Pasa Array a listarlo como Collections
        /*
        String[] nombre = {"Pepe", "Pepa"};

        List<String> listaNombres = new ArrayList(Arrays.asList(nombre));

        //ARGREGAMOS DE FORMA MASIVA 
        List<String> listaNombres2 = new ArrayList();
        listaNombres2.addAll(listaNombres);//Podemos indicarle con un indice.
        
        String nombre1 = "Nick";
        
        System.out.println(nombre1.size());
*/
    }

}
