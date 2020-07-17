/*      
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestinghomework;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author oOo
 */
public class MinTest {

    private List<String> list;

    public MinTest() {

    }

    @Before
    public void setUpClass() {
        list = new ArrayList();
    }

    @After
    public void tearDownClass() {
        list = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroSize() {
        Min.min(list);
    }

    @Test(expected = NullPointerException.class)
    public void testForNull1() {
        list.add(null);
        list.add("cat");
        Min.min(list);
    }

    @Test(expected = ClassCastException.class)
    public void testForDiffClass() {
        List list = new ArrayList();
        list.add(1);
        list.add("cat");
        Min.min(list);
    }

    /**
     * Test of min method, of class Min.
     */
    @Test
    public void testMin() {
        System.out.println("min");
        list.add("A");
        list.add("B");
        list.add("Casdas");
        list.add("Avalanche");
        Object expResult = "A";
        Object result = Min.min(list);
        assertEquals(expResult, result);
        expResult = "Avalanche";
        list.remove("A");
        assertEquals(expResult,"Avalanche");
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testMinforNumber(){
        List list = new ArrayList();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(10);
        list.add(15);
        for(int i = 0;i<list.size();i++){
            int exp = (int) list.get(0);
            assertEquals(Min.min(list),exp);
            list.remove(0);
        }
    }
}
