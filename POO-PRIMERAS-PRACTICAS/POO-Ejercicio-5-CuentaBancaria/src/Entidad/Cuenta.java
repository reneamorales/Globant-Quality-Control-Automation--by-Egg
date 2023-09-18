/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Servicio.ServicioCliente;

/**
 *
 * @author renem
 */
public class Cuenta {

    private int numeroCuenta;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldoActual(double saldoA) {
        this.saldo = saldo;
    }
    
    
    public void ingresar(double cant) {
        saldo += cant;
    }

    public double retirar(double cant) {
        if (cant > saldo) {
            System.out.println("Saldo Insuficente.");
            return 0;
        } else {
            saldo -= cant;
            return cant;
        }
    }

    public double extraccionRapida(double cant) {
        if (cant > ((20 * saldo) / 100)) {
            System.out.println("No puede extraer esa cantidad. Prueba por una menor cifra");
            return 0;
        } else {
            saldo -= cant;
            return cant;
        }

    }
}
