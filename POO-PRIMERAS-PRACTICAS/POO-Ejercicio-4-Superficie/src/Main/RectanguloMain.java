package Main;

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;
import java.util.Scanner;

public class RectanguloMain {

    Scanner ingresar = new Scanner(System.in);

    public static void main(String[] args) {

        //Creamos el Objeto para crear la Instancia de clase, con la que nos vamos a comunicar
        ServicioRectangulo mensajero = new ServicioRectangulo();
        
        Rectangulo msj = mensajero.enviarValores();
        
        System.out.println(msj.Mensajear());
        

    }

}
