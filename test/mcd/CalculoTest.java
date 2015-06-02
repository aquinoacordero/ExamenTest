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
public class CalculoTest {


    public CalculoTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    
    @Test
    public void testObtenerMCD() {
        Calculo calc = new Calculo();
        int num1 = 1;
        int num2 = 1;
        int expResult = 1;
        int result = calc.obtenerMCD(num1, num2);
        assertEquals(expResult, result, 0);
        System.out.println("numero1 :"+num1+" numero2 : "+num2+
                " resultado= "+expResult);
    }

}
