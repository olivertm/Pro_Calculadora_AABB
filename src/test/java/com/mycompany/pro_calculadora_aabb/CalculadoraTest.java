/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pro_calculadora_aabb;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author olivert
 */
public class CalculadoraTest {
    
    /**
     * Test of Suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        int a = 3;
        int b = 1;
        int expResult = 4;
        int result = Calculadora.Suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of Resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        int a = 3;
        int b = 1;
        int expResult = 2;
        int result = Calculadora.Resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        int a = 1;
        int b = 1;
        int expResult = 1;
        int result = Calculadora.Multiplicacion(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        int a = 3;
        int b = 3;
        int expResult = 1;
        int result = Calculadora.Division(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of Porcentaje method, of class Calculadora.
     */
    @Test
    public void testPorcentaje() {
        System.out.println("Porcentaje");
        int numero = 100;
        int por = 30;
        int expResult = 30;
        int result = Calculadora.Porcentaje(numero, por);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Calculadora.
     */
    /*
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora.main(args);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
*/
    
}
