
package ValidatorService;

import Entities.PasswordValidator;

/**
 *
 * @author renem
 */
public class ValidatorService {

    public boolean longitudAceptada(PasswordValidator pv) {
        boolean respuesta = false;
        if (pv.getContraseña().length() >= 12) {
            respuesta = true;
        }
        return respuesta;
    }

    public boolean contieneCararacterEspecial(PasswordValidator pv) {
        boolean conCaracterEspecial = false;
        String caracteresEspeciales = "!@#$%^&*()-_=+{}[]\\|;:";

        for (int i = 0; i < caracteresEspeciales.length(); i++) {
            for (int j = 0; j < pv.getContraseña().length(); j++) {
                if (pv.getContraseña().charAt(j) == caracteresEspeciales.charAt(i)) {
                    conCaracterEspecial = true;
                    break;
                }
            }
        }
        return conCaracterEspecial;
    }
    
    public boolean contraseniaNula(PasswordValidator pv){
        boolean nula= false;
        if(pv == null || pv.getContraseña() == null || pv.getContraseña().equals("")){
        nula=true;
    }
        return nula;
    }
    
    public boolean contraseniaAceptada(PasswordValidator pv){
        boolean esValida= false;
        if(longitudAceptada(pv) && contieneCararacterEspecial(pv)){
            esValida= true;
        }
        return esValida;
    }
}
