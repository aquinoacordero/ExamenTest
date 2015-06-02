/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcd;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author aquinoacordero
 */
@RunWith(Parameterized.class)
public class CalculoParameTest {
    
     private int num1;
    private int num2;
    private Calculo calc;
    private int expResult;
    
    
    public CalculoParameTest(int num1, int num2, int mcd) {
        this.num1 = num1;
        this.num2 = num2;
        this.expResult = mcd;
    }
    
    
    @Before
    public void Initialize() {
        calc=new Calculo();
    }
    
  

     @Parameterized.Parameters
     public static Collection calculando() {
        return Arrays.asList(new Object[][]{
            {1, 1, 1},
            {8, 4, 4},
            {8, 3, 1}
        });
    }


    
    @Test
    public void testObtenerMCD() {
        //Calculo calc = new Calculo();
        int result = calc.obtenerMCD(num1, num2);
        assertEquals(expResult, result,0);
        System.out.println("resultado="+ expResult);
    }
    
}
