/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import AreaPerimetro.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioRadio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        public Circunferencia pedirRadio(){
        System.out.println("Ingrese Radio");
        double radio = leer.nextDouble();
        
        return new Circunferencia(radio);
    }
    
}
