/*
 *
 *
 */
package cuentabancaria;

import Entidad.Cuenta;
import Servicio.ServicioCliente;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class CuentaBancaria {

    public static int buscarNumeroDeCuenta(Cuenta cuentas[], int numeroDeCuentaAbuscar) {
        int indice = 0;
        int iterador = 0;
        boolean numeroDeCuentaEncontrada = false;

        while ((iterador < cuentas.length) && (numeroDeCuentaEncontrada == false)) {
            if (cuentas[iterador].getNumeroCuenta() == numeroDeCuentaAbuscar) {
                numeroDeCuentaEncontrada = true;
                indice = iterador;
            }
            iterador++;
        }

        if (numeroDeCuentaEncontrada == false) {
            indice = -1;
        }
        return indice;
    }

    public static void main(String[] args) {

        Scanner ingresar = new Scanner(System.in);

        String nombre;
        long dni;
        Cuenta cuentas[];
        ServicioCliente cliente;
        int numeroCuenta, cantCuentas, indiceNumeroCuenta;
        double saldo, cantDinero;

        System.out.println("Ingrese nombre");
        nombre = ingresar.next();

        System.out.println("Ingrese un numero de dni");
        dni = ingresar.nextLong();

        System.out.print("\nAhora digite la cantidad de cuentas que tiene el cliente : ");
        cantCuentas = ingresar.nextInt();

        System.out.println("");

        cuentas = new Cuenta[cantCuentas];

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("\nDigite la " + (i + 1) + "° cuenta");

            System.out.println("Digite numero de la cuenta");
            numeroCuenta = ingresar.nextInt();

            System.out.println("Digite saldo de la cuenta");
            saldo = ingresar.nextDouble();
            System.out.println("");

            cuentas[i] = new Cuenta(numeroCuenta, saldo);

        }

        cliente = new ServicioCliente(nombre, dni, cuentas);

        boolean Salir = false;

        do {
            System.out.println("Banco");

            System.out.println("Que desea hacer: ");
            System.out.println("1. Ingresar");
            System.out.println("2. Retirar ");
            System.out.println("3. Extraccion rapida");
            System.out.println("4. Ver Saldo");
            System.out.println("5. Ver Mis Datos");
            System.out.println("6. Salir");

            int eleccion = ingresar.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("Ingrese numero de cuenta");
                    numeroCuenta = ingresar.nextInt();
                    indiceNumeroCuenta = buscarNumeroDeCuenta(cuentas, numeroCuenta);

                    if (indiceNumeroCuenta == -1) {
                        System.out.println("\nCuenta no encontrada, verifique su numero de cuenta.");
                        System.out.println("");
                    } else {
                        System.out.println("Digite la cantidad de dinero a depositar: ");
                        cantDinero = ingresar.nextInt();

                        cliente.ingresarDinero(indiceNumeroCuenta, cantDinero);
                        System.out.println("Deposito Correcto: ");
                        System.out.println("Saldo Disponible : " + cliente.consultarSaldo(indiceNumeroCuenta));
                        break;
                    }
                    break;

                case 2:
                    System.out.println("\nDigite el numero de la cuenta:");
                    numeroCuenta = ingresar.nextInt();
                    indiceNumeroCuenta = buscarNumeroDeCuenta(cuentas, numeroCuenta);

                    if (indiceNumeroCuenta == -1) {
                        System.out.println("\nNo existe cuenta con ese numero.");
                        System.out.println("");
                    } else {
                        System.out.println("Ingrese monto a retirar: ");
                        cantDinero = ingresar.nextInt();

                        if (cliente.consultarSaldo(indiceNumeroCuenta) < cantDinero) {
                            System.out.println("Saldo insuficiente");
                            System.out.println("");
                        } else {
                            cliente.retirarDinero(indiceNumeroCuenta, cantDinero);
                            System.out.println("");
                            System.out.println("Retiro con éxito.");
                            System.out.println("Saldo Disponible" + cliente.consultarSaldo(indiceNumeroCuenta));
                        }
                    }

                    break;

                case 3:
                    System.out.println("\nDigite el numero de la cuenta:");
                    numeroCuenta = ingresar.nextInt();
                    indiceNumeroCuenta = buscarNumeroDeCuenta(cuentas, numeroCuenta);

                    if (indiceNumeroCuenta == -1) {
                        System.out.println("\nNo existe cuenta con ese numero.");
                        System.out.println("");
                    } else {
                        System.out.println("Ingrese monto a retirar: ");
                        cantDinero = ingresar.nextInt();
                        cliente.retirarRapido(indiceNumeroCuenta, cantDinero);
                        System.out.println("Retiro exitoso.");
                        System.out.println("Saldo Disponible "+ cliente.consultarSaldo(indiceNumeroCuenta));
                    }
                    break;

                case 4:
                    System.out.print("\nDigite el numero de cuenta : ");
                    numeroCuenta = ingresar.nextInt();
                    indiceNumeroCuenta = buscarNumeroDeCuenta(cuentas, numeroCuenta);

                    if (indiceNumeroCuenta == -1) {
                        System.out.println("\nNo existe una cuenta con ese número");
                        System.out.println("");
                    } else {
                        System.out.println("Saldo disponible : " + cliente.consultarSaldo(indiceNumeroCuenta));
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.out.print("\nDigite el numero de cuenta : ");
                    numeroCuenta = ingresar.nextInt();
                    indiceNumeroCuenta = buscarNumeroDeCuenta(cuentas, numeroCuenta);

                    if (indiceNumeroCuenta == -1) {
                        System.out.println("\nNo existe una cuenta con ese número");
                        System.out.println("");
                    } else {

                        System.out.println("Mis Datos" + cliente.toString());
                    }
                    break;
                case 6:
                    System.out.println("Gracias por Operar con Nosotros");
                    Salir = true;
                    break;
                default:
                    System.out.println("Selecciona una de las Opciones Disponibles.");

            }

        } while (!Salir);

    }

}
