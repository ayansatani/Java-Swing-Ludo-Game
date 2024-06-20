//bluhomebase.java
package View;

import java.awt.Color;
import java.awt.Graphics;

public class BlueHomeBase {
    private static final Color BLUE_COLOR = new Color(34, 64, 154);

    public void draw(Graphics g, int cellSize) {
        g.setColor(BLUE_COLOR);
        g.fillRect(9 * cellSize, 9 * cellSize, 6 * cellSize, 6 * cellSize);
        g.fillRect(13 * cellSize, 8 * cellSize, cellSize, cellSize);
        g.fillRect(9 * cellSize, 7 * cellSize, 5 * cellSize, cellSize);
        g.fillRect(8 * cellSize, 12 * cellSize, cellSize, cellSize);

        drawWhiteGrid(g, cellSize, 11, 11);
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
