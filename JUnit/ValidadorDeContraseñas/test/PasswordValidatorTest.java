/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entities.PasswordValidator;
import ValidatorService.ValidatorService;
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
public class PasswordValidatorTest {

    public PasswordValidatorTest() {
    }

    ValidatorService pvs;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pvs = new ValidatorService();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void deberiaIndicarTamanioCorrecto() {
        assertEquals(true, (pvs.longitudAceptada(new PasswordValidator("ReneMorales20235"))));
    }

    @Test
    public void deberiaIndicarQuecContieneCE() {
        assertEquals(true, (pvs.contieneCararacterEspecial(new PasswordValidator("Rene2023&"))));
    }
    
    @Test
    public void deberiaIndicarContraseniaCorrecta(){
        assertEquals(true, (pvs.contraseniaAceptada(new PasswordValidator("ReneMorales2023&"))));
        //assertEquals(true, (pvs.contraseniaAceptada(new PasswordValidator("Rene2023&"))));
        //assertEquals(true, (pvs.contraseniaAceptada(new PasswordValidator("ReneMorales2023")))); 
    }
    @Test
    public void deberiaVerificarObjetoNoNulo(){
        assertNotNull(new PasswordValidator("ReneMorales2023&"));
    }
    
    //Crear un metodo que valide que es nulo el objeto

}
