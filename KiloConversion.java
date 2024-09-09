/*
 * /
 * KiloConversion class to take user input and then convert Kilometers into
 * Miles
 */

import javax.swing.*;
import java.awt.event.*;

public class KiloConversion extends JFrame {

    private JPanel holdingPanel; // A holding panel
    private JLabel messageLabel; // Message to show to the user for input label
    private JTextField inputText; // To get user input (Kilometer value)
    private JButton convert; // Button for Kilometer to Miles converter

    public final int WINDOW_WIDTH = 400; // Width of the window
    public final int WINDOW_HEIGHT = 100; // Height of the window

    /*
     * Constructor
     * 
     * @params: none
     * 
     */

    public KiloConversion() {

        setTitle("Kilometers to Miles Conversion"); // Title of the window

        // Set size of the windows

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

    }

}