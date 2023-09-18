/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;

/**
 *
 * @author renem
 */
public class ServicioCliente {

    private String nombre;
    private long dni;
    Cuenta cuentas[];

    public ServicioCliente() {
    }

    public ServicioCliente(String nombre, long dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    
    //retorno el saldo de la cuenta
    public double consultarSaldo(int indice){
         return cuentas[indice].getSaldo();
    }
    
    //Creamos el metodo para ingresar dinero
    public void ingresarDinero(int indice,double cantidad){
         cuentas[indice].ingresar(cantidad);
                 
    }
    
    //Creamos el metodo para retirar dinero
    public void retirarDinero(int indice,double cantidad){
        cuentas[indice].retirar(cantidad);
    }

    //Creamos el metodo para retirar dinero rapido
    public void retirarRapido(int indice,double cantidad){
        cuentas[indice].extraccionRapida(cantidad);
    }
    
    @Override
    public String toString() {
        return "ServicioCliente{" + "nombre=" + nombre + ", dni=" + dni + ", cuentas=" + cuentas + '}';
    }

   

}
