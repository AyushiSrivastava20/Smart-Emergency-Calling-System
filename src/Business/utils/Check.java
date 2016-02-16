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
public class Check extends InputVerifier {
    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        String pattern = "^[0-9\\.]*$";
        if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.length() == 0 || text.matches(pattern) != true) {
                input.setBackground(Color.pink);
                JOptionPane.showMessageDialog(input, "Please enter valid string. Special characters are not allowed", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.WHITE);
                return true;
            }
        }
        else
        {
            input.setBackground(Color.PINK);
            return true;
        }
    }
}
