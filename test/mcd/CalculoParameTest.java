/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aquinoacordero
 */
public class CalculoParameTest {
    
    public CalculoParameTest(int num1, int num2) {
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
    public void testObtenerMCD() {
        Calculo calc = new Calculo();
        System.out.println("obtenerMCD");
        int num1 = 0;
        int num2 = 0;
        Calculo instance = new Calculo();
        int expResult = 0;
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
