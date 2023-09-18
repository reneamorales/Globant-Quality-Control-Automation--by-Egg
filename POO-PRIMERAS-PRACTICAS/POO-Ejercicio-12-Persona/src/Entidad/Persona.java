
package Entidad;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author renem
 */
public class Persona {
    private String nombre;
    private Date fechaDeNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    
    public int calcularEdad() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaDeNacimiento);
        int yearNacimiento = calendar.get(Calendar.YEAR);
        int monthNacimiento = calendar.get(Calendar.MONTH);
        int dayNacimiento = calendar.get(Calendar.DAY_OF_MONTH);

        calendar.setTime(new Date());
        int yearActual = calendar.get(Calendar.YEAR);
        int monthActual = calendar.get(Calendar.MONTH);
        int dayActual = calendar.get(Calendar.DAY_OF_MONTH);

        int edad = yearActual - yearNacimiento;
        if (monthActual < monthNacimiento || (monthActual == monthNacimiento && dayActual < dayNacimiento)) {
            edad--;
        }
        return edad;
    }

    public boolean menorQue(int edad) {
        return calcularEdad() < edad;
    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaDeNacimiento);
    }
    
}
    

