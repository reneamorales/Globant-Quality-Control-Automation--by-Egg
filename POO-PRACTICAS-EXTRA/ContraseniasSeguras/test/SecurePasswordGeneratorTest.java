

import SecurePasswordGenerator.SecurePasswordGenerator;
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
public class SecurePasswordGeneratorTest {
    
    public SecurePasswordGeneratorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   @Test
   public void deberiaRetornarLongitudIgualaDoce(){
       String contrasenia1 = SecurePasswordGenerator.generarContraseniaSegura();
       assertTrue(contrasenia1.length() > 11);
       assertFalse(contrasenia1.length() < 11);
       assertNotNull(SecurePasswordGenerator.generarContraseniaSegura());
   }
}
