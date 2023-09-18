
package Servicio;

import Entidad.Cadena;

/**
 *
 * @author renem
 */
public class ServicioCadena {

    public int mostrarVocales(Cadena palabras) {
        int cont = 0;
        String frase = palabras.getFrase();

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            caracter = Character.toLowerCase(caracter);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                cont++;
            }
        }
        return cont;
    }

    public String invertirFrase(Cadena palabras) {
        String frase = palabras.getFrase();
        String palabraNueva = "";
        for (int i = frase.length() - 1; i >= 0; i--) {

            palabraNueva += frase.charAt(i);
        }
        return palabraNueva;
    }

    public int vecesRepetido(Cadena palabras, char carac) {
        String frase = palabras.getFrase();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == carac) {

                cont++;
            }
        }
        return cont;
    }

    public boolean compararLongitud(Cadena palabras, String otraFrase) {
        boolean resp = false;
        String frase = palabras.getFrase();
        if (frase.length() == otraFrase.length()) {
            resp = true;
        }
        return resp;
    }

    public String unirFrase(Cadena palabras, String otraFrase) {
        String frase = palabras.getFrase();
        String freseUnida;
        frase += " ";
        freseUnida = frase.concat(otraFrase);

        return freseUnida;
    }

    public String reemplazar(Cadena palabras, char carac) {
        String fraseNueva = "";
        String frase = palabras.getFrase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                fraseNueva += carac;
            } else {
                fraseNueva += frase.charAt(i);
            }
        }
        return fraseNueva;
    }

    public boolean contiene(Cadena palabras, char carac) {
        boolean resp = false;
        int cont = 0;

        String frase = palabras.getFrase();

        for (int i = 0; i >= frase.length(); i++) {
            if (frase.charAt(i) == carac) {
                cont++;
            }
        }
        if (cont > 0) {
            resp= true;
        }
        return resp;

    }
}
