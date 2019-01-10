/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barraprogreso;

import java.beans.*;

/**
 *
 * @author Usuario
 */
public class BarraProgresoBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( barraprogreso.BarraProgreso.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_borde = 0;
    private static final int PROPERTY_borderPainted = 1;
    private static final int PROPERTY_dialogNuevo = 2;
    private static final int PROPERTY_dialogPadre = 3;
    private static final int PROPERTY_dimensiones = 4;
    private static final int PROPERTY_frameNuevo = 5;
    private static final int PROPERTY_framePadre = 6;
    private static final int PROPERTY_maximo = 7;
    private static final int PROPERTY_minimo = 8;
    private static final int PROPERTY_orientation = 9;
    private static final int PROPERTY_progreso = 10;
    private static final int PROPERTY_stringPainted = 11;
    private static final int PROPERTY_texto = 12;
    private static final int PROPERTY_valores = 13;
    private static final int PROPERTY_ventanaNueva = 14;
    private static final int PROPERTY_ventanaPadre = 15;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[16];
    
        try {
            properties[PROPERTY_borde] = new PropertyDescriptor ( "borde", barraprogreso.BarraProgreso.class, "getBorde", "setBorde" ); // NOI18N
            properties[PROPERTY_borderPainted] = new PropertyDescriptor ( "borderPainted", barraprogreso.BarraProgreso.class, "isBorderPainted", "setBorderPainted" ); // NOI18N
            properties[PROPERTY_dialogNuevo] = new PropertyDescriptor ( "dialogNuevo", barraprogreso.BarraProgreso.class, "getDialogNuevo", null ); // NOI18N
            properties[PROPERTY_dialogPadre] = new PropertyDescriptor ( "dialogPadre", barraprogreso.BarraProgreso.class, "getDialogPadre", null ); // NOI18N
            properties[PROPERTY_dimensiones] = new PropertyDescriptor ( "dimensiones", barraprogreso.BarraProgreso.class, "getDimensiones", "setDimensiones" ); // NOI18N
            properties[PROPERTY_frameNuevo] = new PropertyDescriptor ( "frameNuevo", barraprogreso.BarraProgreso.class, "getFrameNuevo", null ); // NOI18N
            properties[PROPERTY_framePadre] = new PropertyDescriptor ( "framePadre", barraprogreso.BarraProgreso.class, "getFramePadre", null ); // NOI18N
            properties[PROPERTY_maximo] = new PropertyDescriptor ( "maximo", barraprogreso.BarraProgreso.class, "getMaximo", "setMaximo" ); // NOI18N
            properties[PROPERTY_minimo] = new PropertyDescriptor ( "minimo", barraprogreso.BarraProgreso.class, "getMinimo", "setMinimo" ); // NOI18N
            properties[PROPERTY_orientation] = new PropertyDescriptor ( "orientation", barraprogreso.BarraProgreso.class, "getOrientation", "setOrientation" ); // NOI18N
            properties[PROPERTY_progreso] = new PropertyDescriptor ( "progreso", barraprogreso.BarraProgreso.class, "getProgreso", "setProgreso" ); // NOI18N
            properties[PROPERTY_stringPainted] = new PropertyDescriptor ( "stringPainted", barraprogreso.BarraProgreso.class, "isStringPainted", "setStringPainted" ); // NOI18N
            properties[PROPERTY_texto] = new PropertyDescriptor ( "texto", barraprogreso.BarraProgreso.class, "getTexto", "setTexto" ); // NOI18N
            properties[PROPERTY_valores] = new IndexedPropertyDescriptor ( "valores", barraprogreso.BarraProgreso.class, "getValores", null, null, "setValores" ); // NOI18N
            properties[PROPERTY_ventanaNueva] = new PropertyDescriptor ( "ventanaNueva", barraprogreso.BarraProgreso.class, null, "setVentanaNueva" ); // NOI18N
            properties[PROPERTY_ventanaPadre] = new PropertyDescriptor ( "ventanaPadre", barraprogreso.BarraProgreso.class, null, "setVentanaPadre" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[0];//GEN-HEADEREND:Events
        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_cambioDeVentana0 = 0;
    private static final int METHOD_setBordeYTexto1 = 1;
    private static final int METHOD_setValores2 = 2;
    private static final int METHOD_setVentanaNueva3 = 3;
    private static final int METHOD_setVentanaPadre4 = 4;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[5];
    
        try {
            methods[METHOD_cambioDeVentana0] = new MethodDescriptor(barraprogreso.BarraProgreso.class.getMethod("cambioDeVentana", new Class[] {})); // NOI18N
            methods[METHOD_cambioDeVentana0].setDisplayName ( "" );
            methods[METHOD_setBordeYTexto1] = new MethodDescriptor(barraprogreso.BarraProgreso.class.getMethod("setBordeYTexto", new Class[] {javax.swing.border.Border.class, java.lang.String.class})); // NOI18N
            methods[METHOD_setBordeYTexto1].setDisplayName ( "" );
            methods[METHOD_setValores2] = new MethodDescriptor(barraprogreso.BarraProgreso.class.getMethod("setValores", new Class[] {int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setValores2].setDisplayName ( "" );
            methods[METHOD_setVentanaNueva3] = new MethodDescriptor(barraprogreso.BarraProgreso.class.getMethod("setVentanaNueva", new Class[] {javax.swing.JFrame.class})); // NOI18N
            methods[METHOD_setVentanaNueva3].setDisplayName ( "" );
            methods[METHOD_setVentanaPadre4] = new MethodDescriptor(barraprogreso.BarraProgreso.class.getMethod("setVentanaPadre", new Class[] {javax.swing.JFrame.class})); // NOI18N
            methods[METHOD_setVentanaPadre4].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/iconos/barradecarga16.png";//GEN-BEGIN:Icons
    private static String iconNameC32 = "/iconos/barradecarga32.png";
    private static String iconNameM16 = "/iconos/barradecarga16.png";
    private static String iconNameM32 = "/iconos/barradecarga32.png";//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }

}
