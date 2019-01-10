/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barraprogreso;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.border.Border;
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

    public BarraProgresoTest() {
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
     * Test of setVentanaPadre method, of class BarraProgreso.
     */
    @Test
    public void testSetVentanaPadre_JFrame() {
        System.out.println("setVentanaPadre");
        JFrame ventanaPadre = null;
        BarraProgreso instance = new BarraProgreso();
        instance.setVentanaPadre(ventanaPadre);
    }

    /**
     * Test of setVentanaPadre method, of class BarraProgreso.
     */
    @Test
    public void testSetVentanaPadre_JDialog() {
        System.out.println("setVentanaPadre");
        JDialog ventanaPadre = null;
        BarraProgreso instance = new BarraProgreso();
        instance.setVentanaPadre(ventanaPadre);
    }

    /**
     * Test of setVentanaNueva method, of class BarraProgreso.
     */
    @Test
    public void testSetVentanaNueva_JFrame() {
        System.out.println("setVentanaNueva");
        JFrame ventanaNueva = null;
        BarraProgreso instance = new BarraProgreso();
        instance.setVentanaNueva(ventanaNueva);
    }

    /**
     * Test of setVentanaNueva method, of class BarraProgreso.
     */
    @Test
    public void testSetVentanaNueva_JDialog() {
        System.out.println("setVentanaNueva");
        JDialog ventanaNueva = null;
        BarraProgreso instance = new BarraProgreso();
        instance.setVentanaNueva(ventanaNueva);
    }

    /**
     * Test of setValores method, of class BarraProgreso.
     */
    @Test
    public void testSetValores_int_int() {
        System.out.println("setValores");
        int min = 0;
        int max = 100;
        BarraProgreso instance = new BarraProgreso();
        instance.setValores(min, max);
    }

    /**
     * Test of setValores method, of class BarraProgreso.
     */
    @Test
    public void testSetValores_3args() {
        System.out.println("setValores");
        int min = 0;
        int max = 100;
        int progresoActual = 50;
        BarraProgreso instance = new BarraProgreso();
        instance.setValores(min, max, progresoActual);
    }

    /**
     * Test of setBordeYTexto method, of class BarraProgreso.
     */
    @Test
    public void testSetBordeYTexto() {
        System.out.println("setBordeYTexto");
        Border border = null;
        String texto = "";
        BarraProgreso instance = new BarraProgreso();
        instance.setBordeYTexto(border, texto);
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
        int expResult = instance.getMaximo();
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
     * Test of getProgreso method, of class BarraProgreso.
     */
    @Test
    public void testGetProgreso() {
        System.out.println("getProgreso");
        BarraProgreso instance = new BarraProgreso();
        int expResult = 0;
        int result = instance.getProgreso();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProgreso method, of class BarraProgreso.
     */
    @Test
    public void testSetProgreso() {
        System.out.println("setProgreso");
        int progreso = 50;
        BarraProgreso instance = new BarraProgreso();
        instance.setProgreso(progreso);
    }

    /**
     * Test of getTexto method, of class BarraProgreso.
     */
    @Test
    public void testGetTexto() {
        System.out.println("getTexto");
        BarraProgreso instance = new BarraProgreso();
        String expResult = instance.getTexto();
        String result = instance.getTexto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTexto method, of class BarraProgreso.
     */
    @Test
    public void testSetTexto() {
        System.out.println("setTexto");
        String texto = "Cargando..";
        BarraProgreso instance = new BarraProgreso();
        instance.setTexto(texto);
    }

    /**
     * Test of getBorde method, of class BarraProgreso.
     */
    @Test
    public void testGetBorde() {
        System.out.println("getBorde");
        BarraProgreso instance = new BarraProgreso();
        Border expResult = instance.getBorde();
        Border result = instance.getBorde();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBorde method, of class BarraProgreso.
     */
    @Test
    public void testSetBorde() {
        System.out.println("setBorde");
        Border borde = null;
        BarraProgreso instance = new BarraProgreso();
        instance.setBorde(borde);
    }

    /**
     * Test of getFramePadre method, of class BarraProgreso.
     */
    @Test
    public void testGetFramePadre() {
        System.out.println("getFramePadre");
        BarraProgreso instance = new BarraProgreso();
        JFrame expResult = null;
        JFrame result = instance.getFramePadre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDialogPadre method, of class BarraProgreso.
     */
    @Test
    public void testGetDialogPadre() {
        System.out.println("getDialogPadre");
        BarraProgreso instance = new BarraProgreso();
        JDialog expResult = null;
        JDialog result = instance.getDialogPadre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFrameNuevo method, of class BarraProgreso.
     */
    @Test
    public void testGetFrameNuevo() {
        System.out.println("getFrameNuevo");
        BarraProgreso instance = new BarraProgreso();
        JFrame expResult = null;
        JFrame result = instance.getFrameNuevo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDialogNuevo method, of class BarraProgreso.
     */
    @Test
    public void testGetDialogNuevo() {
        System.out.println("getDialogNuevo");
        BarraProgreso instance = new BarraProgreso();
        JDialog expResult = null;
        JDialog result = instance.getDialogNuevo();
        assertEquals(expResult, result);
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
