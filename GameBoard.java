package View;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    private static final long serialVersionUID = 1L;
    private static final int BOARD_SIZE = 15;

    private RedHomeBase redHomeBase;
    private GreenHomeBase greenHomeBase;
    private YellowHomeBase yellowHomeBase;
    private BlueHomeBase blueHomeBase;

    public GameBoard() {
        setPreferredSize(new Dimension(700, 700));
        setBackground(Color.WHITE);

        redHomeBase = new RedHomeBase();
        greenHomeBase = new GreenHomeBase();
        yellowHomeBase = new YellowHomeBase();
        blueHomeBase = new BlueHomeBase();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
    }

    private void drawBoard(Graphics g) {
        int cellSize = (getWidth() / BOARD_SIZE)-2;

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                g.drawRect(i * cellSize, j * cellSize, cellSize, cellSize);
            }
        }

        redHomeBase.draw(g, cellSize);
        greenHomeBase.draw(g, cellSize);
        yellowHomeBase.draw(g, cellSize);
        blueHomeBase.draw(g, cellSize);

        drawHome(g, cellSize);
    }

    private void drawHome(Graphics g, int cellSize) {
        g.setColor(Color.WHITE);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                g.fillRect((6 + i) * cellSize, (6 + j) * cellSize, cellSize, cellSize);
            }
        }
        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.BOLD, cellSize);
        g.setFont(font);
        FontMetrics metrics = g.getFontMetrics(font);
        String text = "HOME";
        int x = (getWidth() - metrics.stringWidth(text)) / 2;
        int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
        g.drawString(text, x-15 , y+2 );
    }
}
