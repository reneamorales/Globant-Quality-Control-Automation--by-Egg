
import TestConJUnit.entities.Descuentos;
import TestConJUnit.servicios.ServicioDescuentos;
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
public class DescuentosTest {

    public DescuentosTest() {
    }

    ServicioDescuentos sd;

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        sd = new ServicioDescuentos();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void deberiaDevolverDescuento() {
        //Se obtiene de retorno el valor de descuento que se aplica.
        //Compara si el valor expected ES igual al valor actual.
        assertEquals(10, sd.aplicarDescuento(new Descuentos(100, 10)), 0);
        assertEquals(45, sd.aplicarDescuento(new Descuentos(150, 30)), 0);
        //Compara si el valor expected NO es igual al valor actual.
        assertNotEquals(0, sd.aplicarDescuento(new Descuentos(150, 30)), 0);
        assertEquals(0, sd.aplicarDescuento(new Descuentos(150, 60)), 0);
        assertEquals(24000, sd.aplicarDescuento(new Descuentos(80000, 30)), 0);
    }
}
