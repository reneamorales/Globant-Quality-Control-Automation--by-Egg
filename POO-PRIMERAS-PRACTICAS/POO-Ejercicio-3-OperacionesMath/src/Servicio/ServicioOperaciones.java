/*
 *
 */
package Servicio;

import Entidad.Operaciones;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioOperaciones {
    Scanner leer = new Scanner(System.in);
    
    public Operaciones crearOperaciones(){
        System.out.println("Ingrese 2 valores para operarlos");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        return new Operaciones(num1,num2);
        
        
    }
    
}
