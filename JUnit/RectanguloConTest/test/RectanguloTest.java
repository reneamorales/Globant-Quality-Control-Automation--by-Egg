

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;
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
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    ServicioRectangulo sr;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        sr = new ServicioRectangulo();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void deberiaInicialiarConColor(){
        assertNotNull(new Rectangulo(10,10).getColor());
    }
    
    @Test
    public void deberiaCalcularArea(){
        assertEquals(100, sr.calcularArea(new Rectangulo(10, 10)), 0);
        assertEquals(20, sr.calcularArea(new Rectangulo(4, 5)), 0);
        assertEquals(1, sr.calcularArea(new Rectangulo(1, 1)), 0);
    }
    @Test 
    public void deberiaCalcularPerimetro(){
        assertEquals(40, sr.calcularPerimetro(new Rectangulo(10,10)),0);
        assertEquals(100, sr.calcularPerimetro (new Rectangulo(20,30)),0);
        assertEquals(30, sr.calcularPerimetro (new Rectangulo(5,10)),0);
    }
    @Test
    public void deberiaActivarDesactivar(){
        Rectangulo r = new Rectangulo(5, 5);
        assertTrue(r.isActive());
        r.setActive(false);
        assertFalse(r.isActive());
        
    }
}
