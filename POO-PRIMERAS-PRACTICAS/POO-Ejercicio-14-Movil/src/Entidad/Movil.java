package Entidad;

/**
 *
 * @author renem
 */
public class Movil {

    private String marca;
    private double precio;
    private String modelo;
    private String modeloRam;
    private int almacenamiento;
    private int[] codigo;

    public Movil() {
    }

    public Movil(String marca, double precio, String modelo, String modeloRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.modeloRam = modeloRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModeloRam() {
        return modeloRam;
    }

    public void setModeloRam(String modeloRam) {
        this.modeloRam = modeloRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    public int enviarCodigo(int[] codigo) {
        int retorno = 0;
        char c = 0;
        for (int i = 0; i < codigo.length; i++) {
            c += codigo.charAt(i);
            retorno += c;
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", modeloRam=" + modeloRam + ", almacenamiento=" + almacenamiento + ", codigo=" + codigo + '}';
    }

}
