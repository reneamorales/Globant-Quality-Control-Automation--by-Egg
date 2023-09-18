/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCurso;

import Entidad.Curso;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author renem
 */
public class ServicioCurso {

    Scanner ingresar = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso() {
        
        System.out.print("Ingrese nombre de curso: ");
        String nombreCurso = ingresar.nextLine();
        System.out.print("Ingrese cantidad de horas por día: ");
        int cantidadHorasPorDia = ingresar.nextInt();
        System.out.print("Ingrese cantidad de días por semana: ");
        int cantidadDiasPorSemana = ingresar.nextInt();
        System.out.print("Ingrese turno: ");
        String turno = ingresar.next();
        System.out.print("Ingrese el precio por hora : ");
        double precioPorHora = ingresar.nextInt();

        Curso curso = new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora);
        curso.setAlumnos(cargarAlumnos());
        return curso;
    }

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];

        for (int i = 0; i < alumnos.length; i++) {

            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = ingresar.nextLine();
        }
        return alumnos;
        
    }
}
