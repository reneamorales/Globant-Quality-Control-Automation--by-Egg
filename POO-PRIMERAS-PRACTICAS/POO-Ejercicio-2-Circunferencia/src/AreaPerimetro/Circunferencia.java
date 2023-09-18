
package AreaPerimetro;

public class Circunferencia {
    
    private Double radio, area, perimetro;

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public void calcularAyP(){
        area =  Math.PI * Math.pow(radio, 2);
        perimetro = 2 *Math.PI * radio;
    }
    
    public void Mensaje(){
        calcularAyP();
        System.out.println("El valor del Area es: "+ area + " y el valor de Perimetro es "+ perimetro);
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
