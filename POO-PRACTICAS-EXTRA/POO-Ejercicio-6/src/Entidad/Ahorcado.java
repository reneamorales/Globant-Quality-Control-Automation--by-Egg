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
public class Ahorcado {
    private String[] buscar;
    private int cantidadEncontradas;
    private int cantidadMaxima;

    public Ahorcado() {
    }

    public Ahorcado(String[] buscar, int cantidadEncontradas, int cantidadMaxima) {
        this.buscar = buscar;
        this.cantidadEncontradas = cantidadEncontradas;
        this.cantidadMaxima = cantidadMaxima;
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public int getCantidadEncontradas() {
        return cantidadEncontradas;
    }

    public void setCantidadEncontradas(int cantidadEncontradas) {
        this.cantidadEncontradas = cantidadEncontradas;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }
    
    
    
}
