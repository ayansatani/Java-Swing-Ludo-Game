package View;

import javax.swing.*;
import java.awt.*;

public class VictoryBase extends JPanel {

	private static final long serialVersionUID = 1L;

		public VictoryBase() {
	        setLayout(new GridLayout(3, 3));
	        setPreferredSize(new Dimension(10, 10)); // Adjust size as needed
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                JButton button = new JButton();              
                    button.setBackground(Color.WHITE); // White for empty cells
                    button.setBorderPainted(false);
                    if(i==1 && j == 1 ) {// remove the if statement if the whole victory block is to be made unclickable.
                    	ImageIcon centre = new ImageIcon("home.png");
                    	button.setIcon(centre);
                    }
                    
	                add(button);
	            }
	        }
	    }
	}
