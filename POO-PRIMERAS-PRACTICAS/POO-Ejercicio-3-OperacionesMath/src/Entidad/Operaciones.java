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
public class Operaciones {

    private int numero1, numero2;
    public int suma, resta, multiplica, divide;

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operaciones() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
   
    public int sumar() {
        suma = numero1 + numero2;
        return suma;
    }

    public int restar() {
        suma = numero1 - numero2;
        return suma;
    }

    public int multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Se está intentando multiplicar por Cero.");
            return 0;
        } else {
            multiplica = numero1 * numero2;
            return multiplica;
        }
    }
    
    //Aca retorno con double
     public double dividir() {
        if (numero2 == 0) {
            System.out.println("Se está intentando dividir por Cero.");
            return 0;
        } else {
             
            return (double) numero1 / numero2;
        }
    }

}
