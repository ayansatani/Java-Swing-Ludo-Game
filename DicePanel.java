package View;

import javax.swing.*;
import java.awt.*;

public class DicePanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JLabel diceDisplay;

    public DicePanel() {
        setLayout(new GridLayout(1, 2));
        setPreferredSize(new Dimension(200, 100));

        // Dice Roll Button
        JButton rollDiceButton = new JButton("Roll Dice");

        // Dice Display
        diceDisplay = new JLabel("Dice: Roll-it", SwingConstants.CENTER);
        diceDisplay.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Add components to the panel
        add(rollDiceButton);
        add(diceDisplay);

        // Add action listener to the roll button
        rollDiceButton.addActionListener(e -> rollDice());
    }

    private void rollDice() {
        int diceValue = (int) (Math.random() * 6) + 1;
        diceDisplay.setText("Dice: " + diceValue);
    }
}
