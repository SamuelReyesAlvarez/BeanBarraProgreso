package barraprogreso;

import java.io.Serializable;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

/**
 *
 * @author Samuel Reyes Álvarez
 *
 * Bean personalizado de JProgressBar que incluye nuevos constructores que
 * reciben como parametros la ventana que posee la barra de progreso y la
 * siguiente ventana que se ejecutara en la aplicacion. Ademas, incluye un
 * metodo que se ancarga de cerrar la ventana que contiene la barra y abre la
 * siguiente ventana cuando el progreso de la barra alcanza el 100%.
 *
 * @version 3.1
 * @date 14/01/2019
 *
 */
public class BarraProgreso extends JProgressBar implements Serializable {

    // atributos basicos
    /**
     * Valor minimo de la barra
     */
    private int minimo;
    /**
     * Valor maximo de la barra
     */
    private int maximo;
    /**
     * Valor de progreso de la barra
     */
    private int progreso;
    /**
     * Texto que aparece sobre la barra
     */
    private String texto;
    /**
     * Borde de la barra
     */
    private Border borde;

    // opciones de ventanas disponibles
    /**
     * Ventana que contiene la barra es tipo JFrame
     */
    private JFrame framePadre = null;
    /**
     * Ventana que contiene la barra es tipo JDialog
     */
    private JDialog dialogPadre = null;
    /**
     * Ventana que la barra abrira es tipo JFrame
     */
    private JFrame frameNuevo = null;
    /**
     * Ventana que la barra abrira es tipo JDialog
     */
    private JDialog dialogNuevo = null;

    /**
     * Combinacion de ventanas elegida {framePadre, dialogPadre, frameNuevo,
     * dialogNuevo}
     */
    private int[] codigo = {0, 0, 0, 0};

    /**
     * Constructor estandar
     */
    public BarraProgreso() {
        super();
    }

    /**
     * Constructores con framePadre + frameNuevo
     *
     * @param ventanaPadre
     * @param ventanaNueva
     */
    public BarraProgreso(JFrame ventanaPadre, JFrame ventanaNueva) {
        setVentanaPadre(ventanaPadre);
        setVentanaNueva(ventanaNueva);
        ventanaNueva.setVisible(false);
    }

    /**
     * Constructor con framePadre + dialogNuevo
     *
     * @param ventanaPadre
     * @param ventanaNueva
     */
    public BarraProgreso(JFrame ventanaPadre, JDialog ventanaNueva) {
        setVentanaPadre(ventanaPadre);
        setVentanaNueva(ventanaNueva);
        ventanaNueva.setVisible(false);
    }

    /**
     * Constructor con dialogPadre + frameNuevo
     *
     * @param ventanaPadre
     * @param ventanaNueva
     */
    public BarraProgreso(JDialog ventanaPadre, JFrame ventanaNueva) {
        setVentanaPadre(ventanaPadre);
        setVentanaNueva(ventanaNueva);
        ventanaNueva.setVisible(false);
    }

    /**
     * Constructor con dialogPadre + dialogNuevo
     *
     * @param ventanaPadre
     * @param ventanaNueva
     */
    public BarraProgreso(JDialog ventanaPadre, JDialog ventanaNueva) {
        setVentanaPadre(ventanaPadre);
        setVentanaNueva(ventanaNueva);
        ventanaNueva.setVisible(false);
    }

    /**
     * Establece que la ventana que contiene a la barra es un JFrame
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

    /**
     * Establece que la ventana que contiene a la barra es un JDialog
     *
     * @param ventanaPadre
     */
    public void setVentanaPadre(JDialog ventanaPadre) {
        if (ventanaPadre != null) {
            dialogPadre = ventanaPadre;
            framePadre = null;
            codigo[0] = 0;
            codigo[1] = 1;
        }
    }

    /**
     * Establece que la ventana que la barra abrira es un JFrame
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

    /**
     * Establece que la ventana que la barra abrira es un JDialog
     *
     * @param ventanaNueva
     */
    public void setVentanaNueva(JDialog ventanaNueva) {
        if (ventanaNueva != null) {
            dialogNuevo = ventanaNueva;
            frameNuevo = null;
            codigo[2] = 0;
            codigo[3] = 1;
        }
    }

    /**
     * Se encarga de establecer los valores minimo y maximo de la barra
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

    /**
     * Se encarga de establecer los valores minimo, maximo y de progreso de la
     * barra
     *
     * @param min
     * @param max
     * @param progresoActual
     * @throws IllegalArgumentException
     */
    public void setValores(int min, int max, int progresoActual) throws IllegalArgumentException {
        setValores(min, max);
        if (min <= progresoActual && progresoActual <= max) {
            setProgreso(progresoActual);
        } else {
            throw new IllegalArgumentException("El valor de progresoActual debe estar entre los valores de min y max");
        }
    }

    /**
     * Establece el estilo del borde y el texto que aparecera dentro de la barra
     * de progreso y los activa para que sean visibles. Si alguno de ellos se
     * define como null, se desactivara
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
     * Devuelve el valor definido como minimo en la barra
     *
     * @return minimo
     */
    public int getMinimo() {
        minimo = getMinimum();
        return minimo;
    }

    /**
     * Establece el valor minimo de la barra
     *
     * @param minimo
     */
    public void setMinimo(int minimo) {
        this.minimo = minimo;
        this.setMinimum(minimo);
    }

    /**
     * Devuelve el valor establecido como maximo en la barra
     *
     * @return maximo
     */
    public int getMaximo() {
        maximo = getMaximum();
        return maximo;
    }

    /**
     * Establece el valor maximo de la barra
     *
     * @param maximo
     */
    public void setMaximo(int maximo) {
        this.maximo = maximo;
        this.setMaximum(maximo);
    }

    /**
     * Devuelve el progreso actual de la barra
     *
     * @return progreso
     */
    public int getProgreso() {
        progreso = getValue();
        return progreso;
    }

    /**
     * Establece el progreso actual de la barra
     *
     * @param progreso
     */
    public void setProgreso(int progreso) {
        this.progreso = progreso;
        this.setValue(progreso);
    }

    /**
     * Devuelve el texto establecido en la barra
     *
     * @return texto
     */
    public String getTexto() {
        texto = getString();
        return texto;
    }

    /**
     * Establece el texto que se mostrara encima de la barra
     *
     * @param texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
        this.setString(texto);
    }

    /**
     * Devuelve el borde definido en la barra
     *
     * @return borde
     */
    public Border getBorde() {
        borde = getBorder();
        return borde;
    }

    /**
     * Establece el borde de la barra
     *
     * @param borde
     */
    public void setBorde(Border borde) {
        this.borde = borde;
        this.setBorder(borde);
    }

    /**
     * Devuelve el JFrame que contiene a la barra
     *
     * @return framePadre
     */
    public JFrame getFramePadre() {
        return framePadre;
    }

    /**
     * Devuelve el JDialog que contiene a la barra
     *
     * @return dialogPadre
     */
    public JDialog getDialogPadre() {
        return dialogPadre;
    }

    /**
     * Devuelve el JFrame que la barra abre
     *
     * @return frameNuevo
     */
    public JFrame getFrameNuevo() {
        return frameNuevo;
    }

    /**
     * Devuelve el JDialog que la barra abre
     *
     * @return dialogNuevo
     */
    public JDialog getDialogNuevo() {
        return dialogNuevo;
    }

    /**
     * Devuelve un array de int con los valores minimo, maximo y progreso actual
     *
     * @return valores
     */
    public int[] getValores() {
        int[] valores = {getMinimo(), getMaximo(), getProgreso()};
        return valores;
    }

    /**
     * Realiza la transicion entre ventanas si el progreso esta completo al 100%
     */
    public void cambioDeVentana() {
        if (this.getPercentComplete() > 0.9) {
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
