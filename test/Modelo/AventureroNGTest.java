/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package Modelo;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Manue
 */
public class AventureroNGTest {
    
    public AventureroNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getClase method, of class Aventurero.
     */
    @Test
    public void testGetClase() {
        System.out.println("getClase");
        Aventurero instance = null;
        String expResult = "";
        String result = instance.getClase();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAtributoEspecial method, of class Aventurero.
     */
    @Test
    public void testGetAtributoEspecial() {
        System.out.println("getAtributoEspecial");
        Aventurero instance = null;
        String expResult = "";
        String result = instance.getAtributoEspecial();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Aventurero.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Aventurero instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Aventurero.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Aventurero instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNivel method, of class Aventurero.
     */
    @Test
    public void testGetNivel() {
        System.out.println("getNivel");
        Aventurero instance = null;
        int expResult = 0;
        int result = instance.getNivel();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNivel method, of class Aventurero.
     */
    @Test
    public void testSetNivel() {
        System.out.println("setNivel");
        int nivel = 0;
        Aventurero instance = null;
        instance.setNivel(nivel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntosVida method, of class Aventurero.
     */
    @Test
    public void testGetPuntosVida() {
        System.out.println("getPuntosVida");
        Aventurero instance = null;
        int expResult = 0;
        int result = instance.getPuntosVida();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPuntosVida method, of class Aventurero.
     */
    @Test
    public void testSetPuntosVida() {
        System.out.println("setPuntosVida");
        int puntosVida = 0;
        Aventurero instance = null;
        instance.setPuntosVida(puntosVida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Aventurero.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Aventurero instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AventureroImpl extends Aventurero {

        public AventureroImpl() {
            super("");
        }

        public String getClase() {
            return "";
        }

        public String getAtributoEspecial() {
            return "";
        }
    }
    
}
