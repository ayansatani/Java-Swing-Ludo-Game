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
                    button.setFocusable(false);
                    if(i==1 && j == 1) {
                    	ImageIcon home = new ImageIcon("home.png");
                    	button.setIcon(home);
//                    } else if (i==0 && j== 1) {
//                    	ImageIcon home = new ImageIcon("Yellow_home.png");
//                    	button.setIcon(home);
//                    }else if (i==1 && j== 0) {
//                    	ImageIcon home = new ImageIcon("Red_home.png");
//                    	button.setIcon(home);
//                    }else if (i==1 && j== 2) {
//                    	ImageIcon home = new ImageIcon("Blue_home.png");
//                    	button.setIcon(home);
//                    }else if (i==2 && j== 1) {
//                    	ImageIcon home = new ImageIcon("Green_home.png");
//                    	button.setIcon(home);
                    }
                    
	                add(button);
	            }
	        }
	    }
	}

