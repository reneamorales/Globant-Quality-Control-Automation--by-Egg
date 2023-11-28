
package PalindromeChecker;

/**
 *
 * @author renem
 */
public class PalindromeChecker {

    private String palabra;

    public PalindromeChecker() {
    }

    public PalindromeChecker(String palabra) {
        this.palabra = palabra;
    }

    public boolean palabraEsPalindromo(String palabra) {
        String palabraReversa = "";
        boolean respuesta = false;

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraReversa += palabra.charAt(i);
        }
        
        if (palabraReversa.equals(palabra)) {
            respuesta = true;
        }
        return respuesta;
    }

}
