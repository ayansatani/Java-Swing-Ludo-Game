package View;

import javax.swing.*;
import java.awt.*;

public class DicePanel extends JPanel {
    private static final long serialVersionUID = 1L;

    public DicePanel() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(200, 100));

        // Dice Roll Area
        JButton rollDiceButton = new JButton("Roll Dice");

        // Add components to the panel
        add(rollDiceButton, BorderLayout.CENTER);
    }
}
