package Service;

import Entity.Perro;
import Entity.Persona;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author renem
 */
public class ServiceAdopcionPerro {

    HashMap<String, Integer> adopciones = new HashMap();

    public boolean verificarPerroEnLista(String perroBuscado) {
        boolean adoptado = false;
        System.out.println("Verificando perro dentro de la lista de adoptados");

        if (adopciones.containsKey(perroBuscado)) {
            System.out.println(perroBuscado + "Este perro ya ha sido adoptado.");
            adoptado = true;
        } else {
            System.out.println(perroBuscado + " aun no ha sido adoptado.");
            adoptado = false;
        }
        return adoptado;
    }

    public void adoptarEste(String PerroAdoptar, int dniPersona, List<Persona> personas) {
        System.out.println("Comparando valores:");
        boolean encontrado= false;
        
        for (Persona p : personas) {
            int dni = p.getDocumento();
            if (dni == dniPersona){
                if(!adopciones.containsValue(dniPersona)) {
                adopciones.put(PerroAdoptar, dniPersona);
                System.out.println("Felicidades!" + p.getNombre() + " Haz adoptado a " +  PerroAdoptar+ ".");
                }else{
                    System.out.println("Ya has adoptado un perro!");
                }
                encontrado= true;
                break;
            }
        }       
        
        
        if(!encontrado){
             System.out.println("¡Eres único! No eres de los que adoptan perritos, ¡tú adoptas gatitos!");
        }
        
    }

    public void mostrarListaDePerros(List<Perro> perros) {
        int x=1;
        for (Perro p : perros) {
            System.out.println(x + " :" + p.getNombre());
            x++;
        }
    }

    public void mostrarListaAdopciones() {
        System.out.println("Lista de Perros adoptados: ");
        for (Map.Entry<String, Integer> entry : adopciones.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Perro: " + key + " Dueño: " + value);
        }
        if(adopciones.isEmpty()){
            System.out.println("Aun no hay perros adoptados.");
        }
    }
}
