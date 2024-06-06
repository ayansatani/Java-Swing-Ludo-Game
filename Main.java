package Control;

import javax.swing.*;
import java.awt.*;

import View.GameBoard;
import View.MenuBar;
import View.ChatPanel;
import View.DicePanel;

public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        MenuBar menu = new MenuBar();
        ChatPanel chatPanel = new ChatPanel();
        DicePanel dicePanel = new DicePanel();

        // Create a panel to hold ChatPanel and DicePanel vertically
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(chatPanel, BorderLayout.CENTER);
        rightPanel.add(dicePanel, BorderLayout.SOUTH);

        JFrame frame = new JFrame("Ludo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon logo = new ImageIcon("Ludo_icon.png");
        
        frame.setIconImage(logo.getImage());

        // Create a split pane to separate the game board and right panel
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, gameBoard, rightPanel);
        splitPane.setDividerLocation(800); // Initial divider location
        splitPane.setEnabled(true); // Prevents the user from changing the divider location

        frame.setJMenuBar(menu.getMenuBar());
        frame.getContentPane().add(splitPane);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
