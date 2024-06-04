package Control;

import javax.swing.*;

import View.GameBoard;

public class Main {
    public static void main(String[] args) {
            GameBoard view = new GameBoard();

            JFrame frame = new JFrame("Ludo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(view);
            frame.pack();
            frame.setVisible(true);
        
    }
}
