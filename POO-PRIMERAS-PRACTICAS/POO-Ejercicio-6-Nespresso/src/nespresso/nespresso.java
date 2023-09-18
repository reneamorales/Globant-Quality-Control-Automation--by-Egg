/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso;

import Cafetera.cafetera;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class nespresso {

    public static void main(String[] args) {

        Scanner ingresar = new Scanner(System.in);

        int capacidad;
        int cantidadAhora;
        boolean Apagar = false;        
        int option;
        int cantidadCafe, tamanioTaza;

        System.out.println("Cafetera Nespresso");

        System.out.println("Ingrese capacidad de su cafetera");
        capacidad = ingresar.nextInt();

        System.out.println("Ingrese la cantidad actual");
        cantidadAhora = ingresar.nextInt();

        cafetera cafe = new cafetera(capacidad, cantidadAhora);

        System.out.println("Hola! Qué desea hacer?");
        
        do{
        
        System.out.println("1.Agregar Café");
        System.out.println("2.Servir café");
        System.out.println("3.Llenar cafetera");
        System.out.println("4. Vaciar cafetera");
        option = ingresar.nextInt();
        
        switch (option){
            case 1:
                System.out.println("Ingrese la cantidad:");
                cantidadCafe = ingresar.nextInt();
                System.out.println("Colocando cafe");
                cafe.agregarCafe(cantidadCafe);
                
            break;
            case 2:
                System.out.println("Ingrese el tamaño de la taza:");
                tamanioTaza = ingresar.nextInt();
                System.out.println("Serviendo cafe");
                cafe.servirTaza(tamanioTaza);
                
                break;
            case 3:
                
                
            
        }
        
        }while(!Apagar);
        
       

    }

}
