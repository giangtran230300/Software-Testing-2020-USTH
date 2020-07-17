/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestinghomework;

import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author oOo
 */
public class VectorUnionTest {
    private Vector A = new Vector();
    private Vector B = new Vector();
    private Vector c = new Vector();
    public VectorUnionTest() {
    
    }
    
    @Before
    public void setUpClass() {
        A = new Vector();
        B = new Vector();
        c = new Vector();for(int i = 0;i<=10;i++) A.addElement(i);
        for(int i = -10;i<=0;i++) B.addElement(i);
        Vector c = VectorUnion.UnionAll(A, B);
         
    }
    
    @After
    public void tearDownClass() {
      A = null;
      B = null;
      c = null;
    }
    
    @Test
    public void testTrue(){
            Vector c = VectorUnion.UnionAll(A, B);
            assertTrue(c.contains(1));
        
    }
    @Test
    public void testlarge(){
        Vector c = VectorUnion.UnionAll(A, B);        
        assertFalse(c.contains(100000));
    }
    @Test
    public void testsmall(){
        Vector c = VectorUnion.UnionAll(A, B);
        assertFalse(c.contains(-100000));
    }
    @Test
    public void testtext(){
        Vector c = VectorUnion.UnionAll(A, B);
        assertFalse(c.contains("abc"));
    }

      
   
    
}
