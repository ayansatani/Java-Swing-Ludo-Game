package View;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    private static final long serialVersionUID = 1L;
	private static final int BOARD_SIZE = 15; // Example size

    public GameBoard() {
        setPreferredSize(new Dimension(600, 600));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
    }

    private void drawBoard(Graphics g) {
        int cellSize = getWidth() / BOARD_SIZE;

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                g.drawRect(i * cellSize, j * cellSize, cellSize, cellSize);
            }
        }

        // Draw home bases, start positions, and other elements
        drawHomeBases(g, cellSize);
    }

    private void drawHomeBases(Graphics g, int cellSize) {
    	
    	//red
        g.setColor(new Color(235,28,36));
        g.fillRect(0, 0, 6 * cellSize, 6 * cellSize);
        g.fillRect(1*cellSize, 6*cellSize, cellSize, cellSize);
        g.fillRect(1*cellSize, 7*cellSize, 5*cellSize, cellSize);
        

        //green
        g.setColor(new Color(2,160,75));
        g.fillRect(9 * cellSize, 0, 6 * cellSize, 6 * cellSize);
        g.fillRect(8*cellSize, 1*cellSize, cellSize, cellSize);
        g.fillRect(7*cellSize, 1*cellSize, cellSize, 5*cellSize);


        //yellow
        g.setColor(new Color(255,224,19));
        g.fillRect(0, 9 * cellSize, 6 * cellSize, 6 * cellSize);
        g.fillRect(6*cellSize, 13*cellSize, cellSize, cellSize);
        g.fillRect(7*cellSize, 9*cellSize, cellSize, 5*cellSize);



        //blue
        g.setColor(new Color(34,64,154));
        g.fillRect(9 * cellSize, 9 * cellSize, 6 * cellSize, 6 * cellSize);
        g.fillRect(13*cellSize, 8*cellSize, cellSize, cellSize);
        g.fillRect(9*cellSize, 7*cellSize, 5*cellSize, cellSize);

        
        //home
        g.setColor(Color.WHITE);
    	g.fillRect(6*cellSize, 6*cellSize, 3*cellSize, 3*cellSize);

        g.setColor(Color.BLACK);
    }
}
