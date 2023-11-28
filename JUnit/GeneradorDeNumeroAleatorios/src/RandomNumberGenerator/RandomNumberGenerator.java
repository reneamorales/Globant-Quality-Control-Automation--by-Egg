package RandomNumberGenerator;



/**
 *
 * @author renem
 */
public class RandomNumberGenerator {

    public static double generarNumeroAleatorio() {
        int MAX=10;
        int MIN= 100;
        return  Math.floor(Math.random() * (MAX - MIN + 1)) + MIN;
    }

}
