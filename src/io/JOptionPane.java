
/** required package class namespace */
package io;

/** required imports */
import java.awt.Component;
import javax.swing.Icon;


/**
 * JOptionPane.java - this class simulates the java.swing class that does the 
 * dialogs and user interfaces and redirects the outputs to a custom output
 *
 * @author Mr. Wachs 
 * @since 15-Mar-2019 
 */
public class JOptionPane 
{

    /**
     * Type meaning Look and Feel should not supply any options -- only
     * use the options from the <code>JOptionPane</code>.
     */
    public static final int         DEFAULT_OPTION = -1;
    /** Type used for <code>showConfirmDialog</code>. */
    public static final int         YES_NO_OPTION = 0;
    /** Type used for <code>showConfirmDialog</code>. */
    public static final int         YES_NO_CANCEL_OPTION = 1;
    /** Type used for <code>showConfirmDialog</code>. */
    public static final int         OK_CANCEL_OPTION = 2;
    /** Return value from class method if YES is chosen. */
    public static final int         YES_OPTION = 0;
    /** Return value from class method if NO is chosen. */
    public static final int         NO_OPTION = 1;
    /** Return value from class method if CANCEL is chosen. */
    public static final int         CANCEL_OPTION = 2;
    /** Return value form class method if OK is chosen. */
    public static final int         OK_OPTION = 0;
    /** 
     * Return value from class method if user closes window without selecting
     * anything, more than likely this should be treated as either a
     * <code>CANCEL_OPTION</code> or <code>NO_OPTION</code>. 
     */
    public static final int         CLOSED_OPTION = -1;
    /** Used for error messages. */
    public static final int  ERROR_MESSAGE = 0;
    /** Used for information messages. */
    public static final int  INFORMATION_MESSAGE = 1;
    /** Used for warning messages. */
    public static final int  WARNING_MESSAGE = 2;
    /** Used for questions. */
    public static final int  QUESTION_MESSAGE = 3;
    /** No icon is used. */
    public static final int   PLAIN_MESSAGE = -1;
    
    
    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     */
    public static void showMessageDialog(Component parentComponent, 
            Object message) {
        System.out.dialog(message);
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param messageType will not apply!
     */
    public static void showMessageDialog(Component parentComponent,
        Object message, String title, int messageType) {
        System.out.dialog(message);
    }
    
    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param messageType will not apply!
     * @param icon will not apply!
     */
    public static void showMessageDialog(Component parentComponent,
        Object message, String title, int messageType, Icon icon) {
        System.out.dialog(message);
    }
    
    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @return will not apply!
     */
    public static int showConfirmDialog(Component parentComponent,
        Object message) {
        System.out.dialog(message);
        return -1;
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param optionType will not apply!
     * @return will not apply!
     */
    public static int showConfirmDialog(Component parentComponent,
        Object message, String title, int optionType) {
        System.out.dialog(message);
        return -1;
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param optionType will not apply!
     * @param messageType will not apply!
     * @return will not apply!
     */
    public static int showConfirmDialog(Component parentComponent,
        Object message, String title, int optionType, int messageType) {
        System.out.dialog(message);
        return -1;
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param optionType will not apply!
     * @param messageType will not apply!
     * @param icon will not apply!
     * @return will not apply!
     */
    public static int showConfirmDialog(Component parentComponent,
        Object message, String title, int optionType,
        int messageType, Icon icon) { 
        System.out.dialog(message);
        return -1;
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param optionType will not apply!
     * @param messageType will not apply!
     * @param icon will not apply!
     * @param options will not apply!
     * @param initialValue will not apply!
     * @return will not apply!
     */
    public static int showOptionDialog(Component parentComponent,
        Object message, String title, int optionType, int messageType,
        Icon icon, Object[] options, Object initialValue) {
        System.out.dialog(message);
        return -1;
    }
    
    /**
     * Re-directs the dialog to custom output
     *
     * @param message the <code>Object</code> to display
     * @return will not apply!
     */
    public static String showInputDialog(Object message) {
        System.out.dialog(message);
        return "-1";
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param message the <code>Object</code> to display
     * @param initialSelectionValue will not apply!
     * @return will not apply!
     */
    public static String showInputDialog(Object message, 
            Object initialSelectionValue) {
        return showInputDialog(message);
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @return will not apply!
     */
    public static String showInputDialog(Component parentComponent,
        Object message) {
        return showInputDialog(message);
    }
    
    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param initialSelectionValue will not apply!
     * @return will not apply!
     */
    public static String showInputDialog(Component parentComponent, 
            Object message, Object initialSelectionValue) {
        return showInputDialog(message);
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param messageType will not apply!
     * @return will not apply!
     */
    public static String showInputDialog(Component parentComponent,
        Object message, String title, int messageType) {
        return showInputDialog(message);
    }

    /**
     * Re-directs the dialog to custom output
     *
     * @param parentComponent will not apply!
     * @param message the <code>Object</code> to display
     * @param title will not apply!
     * @param messageType will not apply!
     * @param icon will not apply!
     * @param selectionValues will not apply!
     * @param initialSelectionValue will not apply!
     * @return will not apply!
     */
    public static Object showInputDialog(Component parentComponent,
        Object message, String title, int messageType, Icon icon,
        Object[] selectionValues, Object initialSelectionValue) {
        return showInputDialog(message);
    }

    /**
     * Simulates a JFrame and re-directs the output to a custom output
     * 
     * @param message the <code>Object</code> to display
     */
    public static void simulateJFrame(Object message) {
        System.out.ui(message);
    }
    
    /**
     * Simulates the JFileChooser and re-directs the output to a custom output
     * 
     * @param message the <code>Object</code> to display 
     */
    public static void simulateJFileChoser(Object message) {
        System.out.dialog(message);
    }
    
}
