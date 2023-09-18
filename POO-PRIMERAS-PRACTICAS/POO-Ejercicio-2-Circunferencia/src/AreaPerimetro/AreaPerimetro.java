package AreaPerimetro;

import Servicio.ServicioRadio;
import java.util.Scanner;

public class AreaPerimetro {

    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        

        ServicioRadio sr = new ServicioRadio();
        Circunferencia most = sr.pedirRadio();

        System.out.println(most.getRadio());
        most.Mensaje();

    }

}
