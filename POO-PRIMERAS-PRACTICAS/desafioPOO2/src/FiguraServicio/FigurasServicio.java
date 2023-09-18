/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FiguraServicio;

/**
 *
 * @author renem
 */
public class FigurasServicio {
    
    
    public void calcularArea(){
        
        Area= base * altura;
    }
    
    public void calcularSuperficie(){   
        calcularArea();
        calcularPerimetro();
        Superficie = Area % Perimetro;
    }
    
    public void calcularPerimetro(){
        Perimetro = (base + altura) * 2;
    }
    
    public String Mensajear(){
       calcularSuperficie();
       return ("El valor de la Superficie es: " + Area + " " + Perimetro + " "+ Superficie);
         
    }
}
