package TestConJUnit.servicios;

import TestConJUnit.entities.Descuentos;

/**
 *
 * @author renem
 */
public class ServicioDescuentos {

    public double aplicarDescuento(Descuentos d) {
        double descuento = 0;
        if (d.getValorDescuento() < 50) { //Los descuentos deben ser menores de 50%
            descuento = (d.getValorProducto() * d.getValorDescuento()) / 100;
        }else{
            if (d.getValorProducto() > 5000) { //El precio de los productos deben ser mayores a $5000
                descuento = (d.getValorProducto() * d.getValorDescuento()) / 100;
            }else{
                descuento = 0;
            }
        }
        
        return descuento;
    }

}
