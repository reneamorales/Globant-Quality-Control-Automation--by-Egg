package desafio.pkg3.poo.grupal;

import Entidad.Cliente;
import Entidad.Rutina;
import Servicios.ServicioCliente;
import Servicios.ServicioRutina;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class Desafio3POOGrupal {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in).useDelimiter("\n");

        ServicioCliente sc = new ServicioCliente();

        boolean salir = false;
        boolean volver = false;
        int opcion = 0;
        int subOpcion1 = 0;

        do {
            System.out.println("-----------------Menu----------------");
            System.out.println("Qué desea hacer? Elige opcion");
            System.out.println("Registrar Cliente: ");
            System.out.println("Registrar Rutina: ");

            opcion = ingresar.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de usuario a registrar");
                    int cantRegist = ingresar.nextInt();
                    for (int i = 0; i < cantRegist; i++) {
                        Cliente c = new Cliente();

                        System.out.print("Ingrese id: ");
                        c.setId(ingresar.nextInt());
                        System.out.print("Ingrese nombre: ");
                        c.setNombre(ingresar.next());
                        System.out.print("Ingrese edad: ");
                        c.setEdad(ingresar.nextInt());
                        System.out.print("Ingrese peso: ");
                        c.setPeso(ingresar.nextInt());
                        System.out.print("Ingrese el Objetivo: ");
                        c.setObjetivo(ingresar.next());

                        sc.registrar(c);

                        do {
                            System.out.println("Elige:");
                            System.out.println("Mostrar Clientes: ");
                            System.out.println("Actualizar cliente:");
                            System.out.println("Eliminar Cliente: ");

                            subOpcion1 = ingresar.nextInt();
                            switch (subOpcion1) {
                                case 1:
                                    sc.obtenerCliente();break;
                                case 2:
                                    sc.actualizarCliente(00001, "Florencia", 30, 72, "adelgazar");
                                    sc.obtenerCliente();break;

                                case 3:
                                    sc.eliminarCliente(2);
                                    sc.obtenerCliente();break;

                                case 4:
                                    volver = true;
                            }

                        } while (!volver);
                    }
                case 2:
                    salir = true;
            }

        } while (!salir);

        /*
        for (int i = 0; i < 2; i++) {
            Cliente c = new Cliente();

            System.out.print("Ingrese id: ");
            c.setId(ingresar.nextInt());
            System.out.print("Ingrese nombre: ");
            c.setNombre(ingresar.next());
            System.out.print("Ingrese edad: ");
            c.setEdad(ingresar.nextInt());
            System.out.print("Ingrese peso: ");
            c.setPeso(ingresar.nextInt());
            System.out.print("Ingrese el Objetivo: ");
            c.setObjetivo(ingresar.next());

            sc.registrar(c);
        }

        sc.obtenerCliente();

        sc.actualizarCliente(00001, "Florencia", 30, 72, "adelgazar");
        sc.obtenerCliente();
        sc.eliminarCliente(2);
        sc.obtenerCliente();

        System.out.println("---------------------------------------------------");

        ServicioRutina sr = new ServicioRutina();

        for (int i = 0; i < 2; i++) {
            Rutina r = new Rutina();

            System.out.print("Ingrese id: ");
            r.setId(ingresar.nextInt());
            System.out.print("Ingrese nombre: ");
            r.setNombre(ingresar.next());
            System.out.print("Ingrese duracion: ");
            r.setDuracion(ingresar.nextInt());
            System.out.print("Ingrese nivel de Dificultad: ");
            r.setNivelDificultad(ingresar.next());

            sr.registrar(r);
        }

        sr.obtenerRutina();
        sr.actualizarRutina(2582, "Ricardo", 40, "intermedio");
        sr.obtenerRutina();
        sr.eliminarRutina(00001);
        sr.obtenerRutina();
    }*/
    }
}
