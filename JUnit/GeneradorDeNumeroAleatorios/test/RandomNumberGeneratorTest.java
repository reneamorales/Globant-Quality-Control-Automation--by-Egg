/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import RandomNumberGenerator.RandomNumberGenerator;
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
public class RandomNumberGeneratorTest {

    public RandomNumberGeneratorTest() {
    }
    //RandomNumberGeneratorTest rng;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        // rng= new RandomNumberGeneratorTest();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testRetornoDeValorDentroDeParametro() {
        double valor1 = 0;
        for (int i = 0; i < 5; i++) {
            valor1 = RandomNumberGenerator.generarNumeroAleatorio();
            assertTrue(valor1 >= 10 && valor1 <= 100);
            //assertTrue(valor1 >= 10 && valor1 <= 9);
            //assertFalse(valor1 >= 1 && valor1 <= 100);
        }

    }
}
