/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calcu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author abel
 */
public class CalcuTest {
    
    public CalcuTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
        
        
        
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
        
        
        
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        
        
        
        
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
        
        
        
        
    }
    
   

    /**
     * Test of main method, of class Calcu.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calcu.main(args);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of Suma method, of class Calcu.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        Calcu instance = new Calcu(5.6f,6.5f);
        float expResult = 12.1F;
        float result = instance.Suma();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of Resta method, of class Calcu.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        Calcu instance = new Calcu(5.6f,6.5f);
        float expResult = -0.9F;
        float result = instance.Resta();
        assertEquals(expResult, result, 0.001F);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicar method, of class Calcu.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        Calcu instance = new Calcu(5.6f,6.5f);
        float expResult = 36.4F;
        float result = instance.Multiplicar();
        assertEquals(expResult, result, 0.0001F);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of Dividir method, of class Calcu.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        Calcu instance = new Calcu(5.6f,6.5f);
        float expResult = 0.86F;
        float result = instance.Dividir();
        assertEquals(expResult, result, 0.01F);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
