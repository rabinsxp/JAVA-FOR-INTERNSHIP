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
    private JLabel successMessage; // Showing message after conversion

    public final int WINDOW_WIDTH = 400; // Width of the window
    public final int WINDOW_HEIGHT = 100; // Height of the window

    /*
     * Constructor
     * 
     * @params: none
     * 
     */

    public KiloConversion() {

        // Set the title.
        setTitle("Kilometers to Miles Converter");

        // Set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Build the panel and add it to the frame.
        buildPanel();

        // Add the panel to the frame's content pane.
        add(holdingPanel);

        setVisible(true);

    }

    /**
     * The buildPanel method adds a label, text field, and
     * and three buttons to a panel.
     */

    public void buildPanel() {

        messageLabel = new JLabel("Enter number in kilometers: ");
        inputText = new JTextField(10);
        successMessage = new JLabel("");

        convert = new JButton("Convert");

        // Add action listner to the Convert button

        convert.addActionListener(new ConvertButtonListner());

        // Create a panel and the components to it.

        holdingPanel = new JPanel();

        holdingPanel.add(messageLabel);
        holdingPanel.add(inputText);
        holdingPanel.add(convert);
        holdingPanel.add(successMessage);

    }

    /**
     * Private inner class that handles the event when
     * the user clicks one of the Convert Button.
     */

    private class ConvertButtonListner implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String input; // To hold the user's input

            // Get the kilometers entered by the user
            input = inputText.getText();
            double results = 0.00; // The units we are converting

            try {

                results = Double.parseDouble(input) * 0.62137; // KM to Miles conversion formula
                // Display the conversion.

            }

            catch (NumberFormatException ex) {
                successMessage.setText("Please enter a valid number");

            }
        }
    }

    /**
     * The main method creates an instance of the
     * KiloConversion class, displaying its window.
     */

    public static void main(String[] args) {

        new KiloConversion();
    }

}