package barraprogreso;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Samuel Reyes
 *
 */
@RunWith(Parameterized.class)
public class BarraProgresoParameterizedTest {

    private BarraProgreso instance;
    private int numero, resultado;

    @Parameters
    public static Iterable data() {
        return Arrays.asList(new Object[][]{
            {0, 0}, {100, 100}, {0, 100} // se esperan 2 pruebas exitosas y 1 fallida
        });
    }

    public BarraProgresoParameterizedTest(int numero, int resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new BarraProgreso();
    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of setMinimo method, of class BarraProgreso.
     */
    @Test
    public void testSetMinimo() {
        System.out.println("setMinimo");
        instance.setMinimo(numero);
        assertEquals(resultado, instance.getMinimo());
    }

    /**
     * Test of setMaximo method, of class BarraProgreso.
     */
    @Test
    public void testSetMaximo() {
        System.out.println("setMaximo");
        instance.setMaximo(numero);
        assertEquals(resultado, instance.getMaximo());
    }

    /**
     * Test of setProgreso method, of class BarraProgreso.
     */
    @Test
    public void testSetProgreso() {
        System.out.println("setProgreso");
        instance.setProgreso(numero);
        assertEquals(resultado, instance.getProgreso());
    }
}
