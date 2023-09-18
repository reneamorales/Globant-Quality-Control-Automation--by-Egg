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
public class objeto {
    
    private int base, altura, Area, Perimetro;
    
    public void objeto(int base, int altura){
        this.base = base;
        this.altura = altura;
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
    
}
