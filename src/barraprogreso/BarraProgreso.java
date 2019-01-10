package barraprogreso;

import java.io.Serializable;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

/**
 *
 * @author Samuel Reyes
 *
 * Bean personalizado de JProgressBar que incluye nuevos constructores que
 * reciben como parametros la ventana que posee la barra de progreso y la
 * siguiente ventana que se ejecutara en la aplicacion. Ademas, incluye un
 * metodo que se ancarga de cerrar la ventana que contiene la barra y abre la
 * siguiente ventana cuando el progreso de la barra alcanza el 100%.
 *
 */
public class BarraProgreso extends JProgressBar implements Serializable {

    // atributos basicos
    private int minimo;
    private int maximo;
    private int progreso;
    private String texto;
    private Border borde;

    // opciones de ventanas disponibles
    private JFrame framePadre = null;
    private JDialog dialogPadre = null;
    private JFrame frameNuevo = null;
    private JDialog dialogNuevo = null;

    // este atributo se usa para controlar la combinacion de ventanas elegida
    private int[] codigo = {0, 0, 0, 0};

    /**
     * Constructor estandar
     */
    public BarraProgreso() {
        super();
    }

    /**
     * Constructores con las diferentes combinaciones de tipos de ventanas
     *
     * @param ventanaPadre
     * @param ventanaNueva
     */
    public BarraProgreso(JFrame ventanaPadre, JFrame ventanaNueva) {
        setVentanaPadre(ventanaPadre);
        setVentanaNueva(ventanaNueva);
        ventanaNueva.setVisible(false);
    }

    public BarraProgreso(JFrame ventanaPadre, JDialog ventanaNueva) {
        setVentanaPadre(ventanaPadre);
        setVentanaNueva(ventanaNueva);
        ventanaNueva.setVisible(false);
    }

    public BarraProgreso(JDialog ventanaPadre, JFrame ventanaNueva) {
        setVentanaPadre(ventanaPadre);
        setVentanaNueva(ventanaNueva);
        ventanaNueva.setVisible(false);
    }

    public BarraProgreso(JDialog ventanaPadre, JDialog ventanaNueva) {
        setVentanaPadre(ventanaPadre);
        setVentanaNueva(ventanaNueva);
        ventanaNueva.setVisible(false);
    }

    /**
     * Metodos que definen el tipo de ventana que contiene a la barra de
     * progreso
     *
     * @param ventanaPadre
     */
    public void setVentanaPadre(JFrame ventanaPadre) {
        if (ventanaPadre != null) {
            framePadre = ventanaPadre;
            dialogPadre = null;
            codigo[0] = 1;
            codigo[1] = 0;
        }
    }

    public void setVentanaPadre(JDialog ventanaPadre) {
        if (ventanaPadre != null) {
            dialogPadre = ventanaPadre;
            framePadre = null;
            codigo[0] = 0;
            codigo[1] = 1;
        }
    }

    /**
     * Metodos que definen el tipo de ventana que se abrira al completarse la
     * carga de la barra de progreso
     *
     * @param ventanaNueva
     */
    public void setVentanaNueva(JFrame ventanaNueva) {
        if (ventanaNueva != null) {
            frameNuevo = ventanaNueva;
            dialogNuevo = null;
            codigo[2] = 1;
            codigo[3] = 0;
        }
    }

    public void setVentanaNueva(JDialog ventanaNueva) {
        if (ventanaNueva != null) {
            dialogNuevo = ventanaNueva;
            frameNuevo = null;
            codigo[2] = 0;
            codigo[3] = 1;
        }
    }

    /**
     * Metodo sobrecargado que establece los valores minimo y maximo de la barra
     * y otro que incluye el progreso actual ademas de los anteriores
     *
     * @param min
     * @param max
     * @throws IllegalArgumentException
     */
    public void setValores(int min, int max) throws IllegalArgumentException {
        if (min < max) {
            setMinimo(min);
            setMaximo(max);
        } else {
            throw new IllegalArgumentException("El valor de MIN debe ser menor que el valor de MAX");
        }
    }

    public void setValores(int min, int max, int progresoActual) {
        setValores(min, max);
        if (min <= progresoActual && progresoActual <= max) {
            setProgreso(progresoActual);
        } else {
            throw new IllegalArgumentException("El valor de progresoActual debe estar entre los valores de min y max");
        }
    }

    /**
     * Metodo que establece el estilo del borde y el texto que aparecera dentro
     * de la barra de progreso y los activa para que sean visibles. Si alguno de
     * ellos se define como null, se desactivara
     *
     * @param border
     * @param texto
     */
    public void setBordeYTexto(Border border, String texto) {
        if (border == null) {
            setBorderPainted(false);
        } else {
            setBorderPainted(true);
            setBorde(border);
        }

        if (texto == null) {
            setStringPainted(false);
        } else {
            setStringPainted(true);
            setTexto(texto);
        }
    }

    /**
     * Metodos Getters y Setters basicos
     *
     * @return valores basicos de la barra de progreso
     */
    public int getMinimo() {
        minimo = getMinimum();
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
        this.setMinimum(minimo);
    }

    public int getMaximo() {
        maximo = getMaximum();
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
        this.setMaximum(maximo);
    }

    public int getProgreso() {
        progreso = getValue();
        return progreso;
    }

    public void setProgreso(int progreso) {
        this.progreso = progreso;
        this.setValue(progreso);
    }

    public String getTexto() {
        texto = getString();
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
        this.setString(texto);
    }

    public Border getBorde() {
        borde = getBorder();
        return borde;
    }

    public void setBorde(Border borde) {
        this.borde = borde;
        this.setBorder(borde);
    }

    /**
     * Metodos Getters de las ventanas elegidas
     *
     * @return
     */
    public JFrame getFramePadre() {
        return framePadre;
    }

    public JDialog getDialogPadre() {
        return dialogPadre;
    }

    public JFrame getFrameNuevo() {
        return frameNuevo;
    }

    public JDialog getDialogNuevo() {
        return dialogNuevo;
    }

    public int[] getValores() {
        int[] valores = {getMinimo(), getMaximo(), getProgreso()};
        return valores;
    }

    /**
     * Metodo que realiza la transicion entre ventanas si el progreso esta
     * completo
     */
    public void cambioDeVentana() {
        if (this.getPercentComplete() == 1.0) {
            int codigoFacil = codigo[0] * 8 + codigo[1] * 4 + codigo[2] * 2 + codigo[3] * 1;

            switch (codigoFacil) {
                case 10: // framePadre + frameNuevo
                    framePadre.dispose();
                    frameNuevo.setVisible(true);
                    break;
                case 6: // dialogPadre + frameNuevo
                    dialogPadre.dispose();
                    frameNuevo.setVisible(true);
                    break;
                case 9: // framePadre + dialogNuevo
                    framePadre.dispose();
                    dialogNuevo.setVisible(true);
                    break;
                case 5: // dialogPadre + dialogNuevo
                    dialogPadre.dispose();
                    dialogNuevo.setVisible(true);
                    break;
                default: // este caso no deberia darse
                    System.out.println("Error en el codigo de ventanas de la barra de progreso");
                    break;
            }
        }
    }
}
