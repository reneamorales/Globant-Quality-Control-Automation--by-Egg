/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioAlumno {

    private Scanner read;
    private List<Alumno> alumnos;

    public ServicioAlumno() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList();
    }

    public void cargarAlumnoNotas() {
        System.out.print("Ingrese nombre alumno: ");
        String nombreAlumno = read.next();

        List<Integer> notas = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            System.out.print("Ingrese la nota " + (i + 1));
            int nota = read.nextInt();
            read.nextLine();
            notas.add(nota);
        }
        Alumno nuevoAlumno = new Alumno(nombreAlumno, notas);
        aniadirAlumnoNotas(nuevoAlumno);
    }

    public void aniadirAlumnoNotas(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void mostrarLista() {
        for (Alumno al : alumnos) {
            //Funciona en ambos casos siempre que este declarado el toString.
            System.out.println(al);
            //System.out.println(al.toString());
        }
    }

    public double promedirAlumno(String nombre) {
        double suma = 0;
        double promedio = 0;
        for (Alumno a : alumnos) {
            if (nombre.equals(a.getNombre())) {
                List<Integer> notas = a.getNotas();
                if (notas.isEmpty()) {
                    return -1;
                }
                suma = notas.stream().mapToInt(Integer::intValue).sum();
                promedio = suma / notas.size();
            }
        }
        return promedio;
    }
}
