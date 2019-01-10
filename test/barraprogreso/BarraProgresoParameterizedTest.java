package barraprogreso;

import java.util.Arrays;
import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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

    private int min, max, valor;
    private JFrame ventanaPadre, ventanaSiguiente;

    @Parameters
    public static Iterable data() {
        return Arrays.asList(new Object[][]{
            {3, 3}, {5, 5}, {5, 4}
        });
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
}
