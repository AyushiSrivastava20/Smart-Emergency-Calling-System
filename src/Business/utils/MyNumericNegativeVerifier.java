/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.utils;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ayushi
 */
public class MyNumericNegativeVerifier extends InputVerifier {
    
    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        try {
            int number=Integer.parseInt(text);
            input.setBackground(Color.white);
            if(number<0)
                {
                    input.setBackground(Color.pink);
                    JOptionPane.showMessageDialog(input, "Number cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
        } catch (NumberFormatException e) {
            input.setBackground(Color.PINK);
            JOptionPane.showMessageDialog(input, "Please enter integer value", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
