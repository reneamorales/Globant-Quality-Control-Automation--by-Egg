package Entity;

import java.util.ArrayList;

/**
 *
 * @author renem
 */
public class Persona {

    private String nombre, apellido;
    private int edad, documento;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public Persona(String nombre, String apellido, int edad, int documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }

    public void mostrarPersonasyPerros(ArrayList<Persona> personas) {
        for (Persona p : personas) {
            System.out.println("Nombre: " + p.getNombre()
                    + "\nApellido: " + p.getApellido()
                    + "\nEdad: " + p.getEdad()
                    + "\nDocumento: " + p.getDocumento()
                    + "\nDatos de Perro :"
                    + "\nNombre: " + p.getPerro().getNombre()
                    + "\nRaza: " + p.getPerro().getRaza()
                    + "\nEdad: " + p.getPerro().getEdad()
                    + "\nTamanio: " + p.getPerro().getTamanio());
            System.out.println("");
        }
    }

}
