
import Entity.TemperatureConverter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renem
 */
public class ConvertidorDeTemperaturaTest {
    
    private static final double DELTA = 1e-15;

    public ConvertidorDeTemperaturaTest() {
    }

    //TemperatureConverter tc;
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        // tc = new TemperatureConverter();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testDeKelviAFahrenheit() {
        assertEquals(32, TemperatureConverter.deKelvinaFahrenheit(273.15), 0);
        assertEquals(212, TemperatureConverter.deKelvinaFahrenheit(373.15), 0);
    }

    @Test
    public void testFahrenheitaKelvin() {
        assertEquals(273.15, TemperatureConverter.deFahrenheitaKelvin(32), DELTA);
        assertEquals(288.70, TemperatureConverter.deFahrenheitaKelvin(60), DELTA);
    }
    /*
    @Test
    public void testDeKelviAFahrenheit() {
        assertEquals(32, TemperatureConverter.deKelvinaFahrenheit(273.15), 0);
        assertEquals(212, TemperatureConverter.deKelvinaFahrenheit(373.15), 0);
    }

    @Test
    public void testDeKelviAFahrenheit() {
        assertEquals(32, TemperatureConverter.deKelvinaFahrenheit(273.15), 0);
        assertEquals(212, TemperatureConverter.deKelvinaFahrenheit(373.15), 0);
    }*/
}
