
package Entidad;

/**
 * @author renem
 */
public class Raices{
    private double a, b, c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getDiscriminante(){
        return Math.pow(b,2)-4*a*c;
    }
    
    public boolean tieneRaices(){
        
        return getDiscriminante() >= 0;
    }
    
    public boolean tieneRaiz(){
        return getDiscriminante() ==0;
    }
    
    public void obtenerRaices(){
        if (tieneRaices()){
            double x1 = ( -b + Math.sqrt(getDiscriminante())) / (2 *a);
            double x2 = ( +b + Math.sqrt(getDiscriminante())) / (2 *a);
            System.out.println("Las raíces son: " + x1 + "y"+ x2);
        }
    }
    
    public void obtenerRaiz(){
        if(tieneRaiz()){
            double x= -b / (2 * a);
            System.out.println("La única Raíz es: " + x);
        }
    }
    
    public void calcular(){
        obtenerRaices();
        obtenerRaiz();
        if (!tieneRaices() & !tieneRaiz()){
            System.out.println("La ecuacion no tiene ninguna solución.");
        }
        
    }
  
}
