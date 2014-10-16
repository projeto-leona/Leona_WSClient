/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteCamera;

import br.leona.controller.IndexController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin_2
 */
public class JUnitTestCamera {
    private IndexController indexController;
    
    public JUnitTestCamera() {
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
    public void testDesligarCamera() {    
        assertFalse(indexController.IsLigado());
    }
    @Test
    public void testLigarCamera() {   
        indexController.SetLigaDesliga();
        assertTrue(indexController.IsLigado());
    }
}
