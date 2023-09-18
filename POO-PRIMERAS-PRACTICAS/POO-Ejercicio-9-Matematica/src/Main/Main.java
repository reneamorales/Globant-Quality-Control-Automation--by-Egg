/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Matematica;
import MathServicios.MathServicios;

/**
 *
 * @author renem
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Matematica op = new Matematica();
        MathServicios ms = new MathServicios();

        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);

        System.out.println("El 1° valor: " + n1 + " el 2° valor: " + n2);

        op.setNum1(n1);
        op.setNum2(n2);
        int mayor = ms.devolverMayor(op);
        System.out.println("El mayor de ambos es " + mayor);
        int menor = ms.devolverMenor(op);

        int result = (int) Math.round(ms.calcularPotencia(mayor, menor));
       
        System.out.println("Potencia: " +mayor+ " elevado a " +menor+ " :" + result);

        System.out.println("El valor absoluto es " + ms.absoluto(menor));
        System.out.println("La raiz cuadrada es: " + Math.round(ms.calcularRaiz(menor)));
        
    }

}
