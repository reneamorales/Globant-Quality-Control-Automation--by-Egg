/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author renem
 */
public class CodigosPostales {
    private String ciudad;

    public CodigosPostales() {
    }

    public CodigosPostales(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "CodigosPostales{" + "ciudad=" + ciudad + '}';
    }
    
}
