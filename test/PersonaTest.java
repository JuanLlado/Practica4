/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import practica4.Persona;

/**
 *
 * @author Juan Llado
 */
public class PersonaTest {
    
    public PersonaTest() {
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

    /**
     * Test of toString method, of class Persona.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Persona.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Persona instance = new PersonaImpl();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDNI method, of class Persona.
     */
    @Test
    public void testGetDNI() {
        System.out.println("getDNI");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getDNI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDNI method, of class Persona.
     */
    @Test
    public void testSetDNI() {
        System.out.println("setDNI");
        String DNI = "";
        Persona instance = new PersonaImpl();
        instance.setDNI(DNI);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class Persona.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Persona instance = new PersonaImpl();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEdad method, of class Persona.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        Persona instance = new PersonaImpl();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PersonaImpl extends Persona {
    }
    
}
