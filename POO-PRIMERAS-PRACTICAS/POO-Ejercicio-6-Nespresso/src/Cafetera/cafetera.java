/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafetera;

/**
 *
 * @author renem
 */
public class cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public cafetera() {
        // Constructor predeterminado o vacío
    }

    public cafetera(int capacidadMaxima, int cantidadActual) {
        // Constructor con la capacidad máxima y la cantidad actual
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        // hace que la cantidad actual sea igual a la capacidad máxima
        cantidadActual += capacidadMaxima;

    }

    public void servirTaza(int tamañoTaza) {
        /*se pide el tamaño de una taza vacía, 
        el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.*/
        if (cantidadActual >= tamañoTaza) {
            cantidadActual -= tamañoTaza;
            System.out.println("La taza ha sido llenada.");
        } else {

            System.out.println("La taza no pudo ser llenada. Quedo en " + cantidadActual);
            cantidadActual = 0;
        }

    }

    public void vaciarCafetera() {
        // pone la cantidad de café actual en cero
        cantidadActual = 0;

    }

    public void agregarCafe(int cantCafe) {
        /* se le pide al usuario una cantidad de café, el método lo recibe
y se añade a la cafetera la cantidad de café indicada */
        
        if (cantCafe > capacidadMaxima-cantidadActual){
            System.out.println("\nSu cafetera tiene "+ cantidadActual + "ml si coloca más rebasará.");
            
        }else{
             cantidadActual += cantCafe;
            System.out.println("Listo! ha colocado más café");
        }
    }

}
