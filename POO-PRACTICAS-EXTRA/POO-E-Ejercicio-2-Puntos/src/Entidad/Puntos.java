package Entidad;

import static java.lang.Math.sqrt;

/**
 *
 * @author renem
 */
public class Puntos {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }
    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calcularDistancia() {
        int dx = x2 - x1;
        int dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

}
