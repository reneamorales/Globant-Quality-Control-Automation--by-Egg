/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathServicios;

import Entidad.Matematica;

/**
 *
 * @author renem
 */
public class MathServicios {

    public int devolverMayor(Matematica valores) {
        int mayor;
        int p1 = valores.getNum1();
        int p2 = valores.getNum2();

        if (p1 > p2) {
            mayor = p1;
        } else {
            mayor = p2;
        }
        return mayor;
    }

    public int devolverMenor(Matematica valores) {
        int menor;
        int p1 = valores.getNum1();
        int p2 = valores.getNum2();

        if (p1 < p2) {
            menor = p1;
        } else {
            menor = p2;
        }
        return menor;
    }

    public double calcularPotencia(double mayor, double menor) {
        
        double result = Math.pow(mayor, menor);
        return result;

    }
    
    public int absoluto(int num1){
        int abs = Math.abs(num1);
        
        return abs;
    }
    
    public double calcularRaiz(int num){
        double rCuad= Math.sqrt(num);
        
        return rCuad;
    }
}
