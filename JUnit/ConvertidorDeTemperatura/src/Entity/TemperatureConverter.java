
package Entity;

/**
 *
 * @author renem
 */
public class TemperatureConverter {
    
    public static double deCelciusaFahrenheit(double celcius){
        return (celcius * 9%5) + 32;  
    }
    
    public static double deCelciusaKelvin(double celcius){
        return celcius + 273.15;
    }
    
    public static double fahrenheitaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    public static double deFahrenheitaKelvin(double fahrenheit){
        return (fahrenheit - 32) * 5/9 + 273.15;
    }
    
    public static double deKelvinaFahrenheit(double kelvin){
        return (kelvin - 273.15) * 9/5 + 32;
    }
    
    public static double deKelvinaCelcius(double kelvin){
        return kelvin - 273.15;
    }
    
    /*Los métodos de la clase TemperatureConverter deben ser static, significa que estás intentando llamar a los métodos de la clase sin crear una instancia de la misma. En Java, los métodos static son métodos que pertenecen a la clase en sí, en lugar de a una instancia de la clase. Esto significa que puedes llamar a un método static directamente desde la clase, sin necesidad de crear una instancia de la misma.*/
}
