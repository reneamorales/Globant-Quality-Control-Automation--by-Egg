
package operaciones;

import Entidad.Operaciones;
import Servicio.ServicioOperaciones;

/**
 *
 * @author renem
 */
public class OperacionesMath {

    
    public static void main(String[] args) {
        
        ServicioOperaciones so = new ServicioOperaciones();
        
        Operaciones op1 = so.crearOperaciones();
        
        
        System.out.println("Suma: "+op1.sumar());
        System.out.println("Resta: "+ op1.restar());
        
        int m1 = op1.multiplicar();
        //En el caso de la div debe esperar un tipo de dato double
        double d1 = op1.dividir();
        
        //getters dentro de variables
        int valor1 = op1.getNumero1();
        int valor2 = op1.getNumero2();
        System.out.println("1er valor: " + valor1);
        
        //Impresion por acceso sin guardar
        System.out.println("2do valor: " + op1.getNumero2());
        
        System.out.println("El resultado de esta mul es "+ m1);
        System.out.println("El resultado de esta div es "+ d1);
        
    }
    
}
