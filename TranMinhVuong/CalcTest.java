/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestinghomework;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


/**
 *
 * @author oOo
 */
public class CalcTest {
    
    public CalcTest() {
    }
    
    @Before
    public void setUpClass() {
    }
    
    @After
    public void tearDownClass() {
    }

    @Test
    public void testMinus() {
        // TODO review the generated test code and remove the default call to fail.
       assertEquals(Calc.minus(5,3),5-3);
    }
    @Test
    public void testMultiply(){
        assertEquals(Calc.multiply(5,4),5*4);
    }
    @Test
    public void testMultiplyType(){
        assertSame(Calc.multiply(5,4),20);
    }
    @Test
    public void testMultiplyType2(){
        assertNotSame(Calc.multiply(5,4),20.0);
    }
    @Test
    public void testDivide(){
        assertEquals(Calc.divide(5,1),5/1);
    }
    @Test
    public void testDivideUp(){
        assertNotSame(Calc.divide(2,3),2/3);
    }
    @Test
    public void testDivideDown(){
        assertNotSame(Calc.divide(1,3),1/3);
    }
    @Test(expected = ArithmeticException.class)
    public void testDividebyZero(){
        Calc.divide(5,0);
    }
 
    
}
