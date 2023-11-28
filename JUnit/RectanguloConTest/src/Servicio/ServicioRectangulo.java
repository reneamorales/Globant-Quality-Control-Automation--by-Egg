package Servicio;

import Entidad.Rectangulo;

/**
 *
 * @author renem
 */
public class ServicioRectangulo {

    public double calcularArea(Rectangulo r) {
        return r.getAncho() * r.getLargo();
    }
    
    public double calcularPerimetro(Rectangulo r){
        return 2*(r.getAncho() + r.getLargo());
    }

}
