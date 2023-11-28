
package Entidad;

/**
 *
 * @author renem
 */
public class Rutina {
    public int id;
    public String nombre;
    public int duracion;
    public String nivelDificultad;

    public Rutina() {
    }

    public Rutina(int id, String nombre, int duracion, String nivelDificultad) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }
    
    public void mostrar(){
        System.out.println("Id: "+ id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Duracion: " + duracion);
        System.out.println("nivelDificultad: "+ nivelDificultad);
    }
    
}
