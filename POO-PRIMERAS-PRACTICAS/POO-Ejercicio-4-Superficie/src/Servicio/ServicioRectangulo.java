package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioRectangulo {

    Scanner ingresar = new Scanner(System.in);

    public Rectangulo enviarValores() {
        
        Rectangulo p1 = new Rectangulo();
        
        System.out.print("Ingrese el valor de la Base: ");
        p1.setBase(ingresar.nextInt());
      
        System.out.println("Ingrese el valor del Altura");
        p1.setAltura(ingresar.nextInt());

        return p1;
        
    }

}
