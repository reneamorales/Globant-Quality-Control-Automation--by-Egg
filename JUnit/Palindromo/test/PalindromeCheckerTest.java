
import PalindromeChecker.PalindromeChecker;
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
public class PalindromeCheckerTest {

    public PalindromeCheckerTest() {
    }
    PalindromeChecker pc;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pc = new PalindromeChecker();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void deberiaIndicarQueSonEnviosPalindromos() {
        assertEquals(true, (pc.palabraEsPalindromo("neuquen")));
        assertEquals(true, (pc.palabraEsPalindromo("reconocer")));
        assertEquals(true, (pc.palabraEsPalindromo("somos")));
        assertEquals(true, (pc.palabraEsPalindromo("salas")));  
        assertEquals(false, (pc.palabraEsPalindromo("equipo")));
        assertEquals(false, (pc.palabraEsPalindromo("semana")));
    }
}
