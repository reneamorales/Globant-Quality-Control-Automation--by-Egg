
package TestConJUnit.entities;

/**
 *
 * @author renem
 */
public class Descuentos {
    private int valorProducto;
    private double valorDescuento;

    public Descuentos() {
    }

    public Descuentos(int valorProducto, double valorDescuento) {
        this.valorProducto = valorProducto;
        this.valorDescuento = valorDescuento;
    }

    public int getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(int valorProducto) {
        this.valorProducto = valorProducto;
    }

    public double getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }
    
}
