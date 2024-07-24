package View;

import javax.swing.*;
import java.awt.*;

public class GreenHomeBase extends JPanel {
    private static final long serialVersionUID = 1L;

	public GreenHomeBase() {
        setLayout(new GridLayout(6, 6));
        setPreferredSize(new Dimension(140, 140)); // Adjust size as needed
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                JButton button = new JButton();
                if ((i==2 || i==3) && (j==2 || j==3)) {
                    button.setBackground(Color.WHITE); // White for empty cells
                } 
                else {
                    button.setBackground(new Color(2, 160, 75)); // Green color for home base
                    button.setBorderPainted(false);
                    button.setEnabled(false);

                } 
                add(button);
            }
        }
    }
}
