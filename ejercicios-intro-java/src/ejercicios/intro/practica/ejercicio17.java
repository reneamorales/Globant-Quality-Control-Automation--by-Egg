package ejercicios.intro.practica;

/**
 *
 * @author renem
 */
public class ejercicio17 {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------------");
        System.out.println("-------FUNCION CONTABILIZAR DIGITOS DE VEC-----------");

        int[] v = new int[15];

        llenarVector(v);
        mostrarVector(v);
        saberCant(v);
    }

    public static void llenarVector(int v[]) {
        for (int i = 0; i < v.length; i++) {
            int numero = (int) (Math.random() * 50);
            v[i] = numero;
        }
    }

    public static void mostrarVector(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + v[i] + "], ");
        }
        System.out.println("");
    }

    public static void saberCant(int v[]) {
        int dig1 = 0, dig2 = 0;
        int dig3 = 0, dig4 = 0, dig5 = 0;

        for (int i = 0; i < v.length; i++) {
            int longitud = String.valueOf(v[i]).length();
            if (longitud == 1) {
                dig1++;
            }
            if (longitud == 2) {
                dig2++;
            }
            if (longitud == 3) {
                dig3++;
            }
            if (longitud == 4) {
                dig4++;
            }
            if (longitud == 5) {
                dig5++;
            }
        }
        System.out.println("Cantidad de valores por digito dentro del vector");
        System.out.println("con 1 digito :"+ dig1+ 
                "\ncon 2 digito :"+ dig2+
                "\ncon 3 digito :"+ dig3+
                "\ncon 1 digito :"+ dig4+
                "\ncon 1 digito :"+ dig5);
    }

}
