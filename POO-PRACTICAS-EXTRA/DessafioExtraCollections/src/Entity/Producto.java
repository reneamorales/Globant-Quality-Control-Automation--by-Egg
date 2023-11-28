
package Entity;

/**
 *
 * @author renem
 */
public class Producto {
    private String producto;
    private String categoria;
    private double precio;
    private int cantidad;

    public Producto(String producto, String categoria, double precio, int cantidad) {
        this.producto = producto;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto() {
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "producto=" + producto + ", categoria=" + categoria + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
}
