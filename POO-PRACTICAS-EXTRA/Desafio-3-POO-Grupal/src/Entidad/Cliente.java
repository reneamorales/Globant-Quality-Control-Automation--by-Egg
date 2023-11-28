package Entidad;

/**
 *
 * @author renem
 */
public class Cliente {

    public int id;
    public String nombre;
    public int edad;
    public double peso;
    public String objetivo;

    public Cliente() {
    }

    public Cliente(int id, String nombre, int edad, double peso, String objetivo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.objetivo = objetivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
    public void mostrar(){
        System.out.println("Id: "+ id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: "+ peso);
        System.out.println("Objetivo: "+ objetivo);
    }

}
