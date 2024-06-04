package View;

import java.awt.Color;
import java.awt.Graphics;

public class GreenHomeBase {
    private static final Color GREEN_COLOR = new Color(2, 160, 75);

    public void draw(Graphics g, int cellSize) {
        g.setColor(GREEN_COLOR);
        g.fillRect(9 * cellSize, 0, 6 * cellSize, 6 * cellSize);
        g.fillRect(8 * cellSize, 1 * cellSize, cellSize, cellSize);
        g.fillRect(7 * cellSize, 1 * cellSize, cellSize, 5 * cellSize);
        g.fillRect(12 * cellSize, 6 * cellSize, cellSize, cellSize);

        drawWhiteGrid(g, cellSize, 11, 2);
    }

    private void drawWhiteGrid(Graphics g, int cellSize, int offsetX, int offsetY) {
        g.setColor(Color.WHITE);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                g.fillRect((offsetX + i) * cellSize, (offsetY + j) * cellSize, cellSize, cellSize);
            }
        }

        g.setColor(Color.BLACK);
        for (int i = 0; i <= 2; i++) {
            g.drawLine((offsetX + i) * cellSize, offsetY * cellSize, (offsetX + i) * cellSize, (offsetY + 2) * cellSize);
            g.drawLine(offsetX * cellSize, (offsetY + i) * cellSize, (offsetX + 2) * cellSize, (offsetY + i) * cellSize);
        }
    }
}
