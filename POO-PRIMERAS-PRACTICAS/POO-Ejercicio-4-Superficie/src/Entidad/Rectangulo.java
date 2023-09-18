/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author renem
 */
public class Rectangulo {
    
    private int base, altura, Area, Perimetro, Superficie;
    
    public void Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }

    public int getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(int Perimetro) {
        this.Perimetro = Perimetro;
    }

    public int getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(int Superficie) {
        this.Superficie = Superficie;
    }
    
    
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
       return ("El valor de la Superficie es: "+"Area: " + Area + " Perimetro: " + Perimetro + " Superficie: "+ Superficie);
         
    }
    
}

