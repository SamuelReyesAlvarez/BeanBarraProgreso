/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barraprogreso;

import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Samuel Reyes
 *
 */
public class BarraProgresoTest {

    private static JFrame jframePadre;
    private static JFrame jframeNuevo;
    private int minimo;
    private int maximo;

    public BarraProgresoTest() {
        minimo = 0;
        maximo = 100;
    }

    @BeforeClass
    public static void setUpClass() {
        jframePadre = new JFrame();
        jframeNuevo = new JFrame();
    }

    @AfterClass
    public static void tearDownClass() {
        jframePadre.dispose();
        jframeNuevo.dispose();
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setVentanaPadre method, of class BarraProgreso.
     */
    @Test
    public void testSetVentanaPadre_JFrame() {
        System.out.println("setVentanaPadre");
        JFrame ventanaPadre = jframePadre;
        BarraProgreso instance = new BarraProgreso();
        instance.setVentanaPadre(ventanaPadre);
    }

    /**
     * Test of setVentanaNueva method, of class BarraProgreso.
     */
    @Test
    public void testSetVentanaNueva_JFrame() {
        System.out.println("setVentanaNueva");
        JFrame ventanaNueva = jframeNuevo;
        BarraProgreso instance = new BarraProgreso();
        instance.setVentanaNueva(ventanaNueva);
    }

    /**
     * Test of setValores method, of class BarraProgreso.
     */
    @Test
    public void testSetValores_int_int() {
        System.out.println("setValores");
        int min = minimo;
        int max = maximo;
        BarraProgreso instance = new BarraProgreso();
        instance.setValores(min, max);
    }

    /**
     * Test of getMinimo method, of class BarraProgreso.
     */
    @Test
    public void testGetMinimo() {
        System.out.println("getMinimo");
        BarraProgreso instance = new BarraProgreso();
        int expResult = 0;
        int result = instance.getMinimo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMinimo method, of class BarraProgreso.
     */
    @Test
    public void testSetMinimo() {
        System.out.println("setMinimo");
        int minimo = 0;
        BarraProgreso instance = new BarraProgreso();
        instance.setMinimo(minimo);
    }

    /**
     * Test of getMaximo method, of class BarraProgreso.
     */
    @Test
    public void testGetMaximo() {
        System.out.println("getMaximo");
        BarraProgreso instance = new BarraProgreso();
        int expResult = 100;
        int result = instance.getMaximo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaximo method, of class BarraProgreso.
     */
    @Test
    public void testSetMaximo() {
        System.out.println("setMaximo");
        int maximo = 100;
        BarraProgreso instance = new BarraProgreso();
        instance.setMaximo(maximo);
    }

    /**
     * Test of getValores method, of class BarraProgreso.
     */
    @Test
    public void testGetValores() {
        System.out.println("getValores");
        BarraProgreso instance = new BarraProgreso();
        int[] expResult = instance.getValores();
        int[] result = instance.getValores();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of cambioDeVentana method, of class BarraProgreso.
     */
    @Test
    public void testCambioDeVentana() {
        System.out.println("cambioDeVentana");
        BarraProgreso instance = new BarraProgreso();
        instance.cambioDeVentana();
    }
}
