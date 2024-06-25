package View;

import javax.swing.*;
import java.awt.*;

public class BlueHomeBase {
    private static final Color BLUE_COLOR = new Color(52, 84, 184);

    public void draw(Graphics g, int cellSize) {
        g.setColor(BLUE_COLOR);
        g.fillRect(9 * cellSize, 9 * cellSize, 6 * cellSize, 6 * cellSize);
        g.fillRect(13 * cellSize, 8 * cellSize, cellSize, cellSize);
        g.fillRect(9 * cellSize, 7 * cellSize, 5 * cellSize, cellSize);
        g.fillRect(8 * cellSize, 12 * cellSize, cellSize, cellSize);

        drawWhiteGrid(g, cellSize, 11, 11);
    }

    private void drawWhiteGrid(Graphics g, int cellSize, int offsetX, int offsetY) {
        // Load the image
        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/View/Blue.jpg"));
        Image image = backgroundImage.getImage();

        // Draw the image in each cell
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int x = (offsetX + i) * cellSize;
                int y = (offsetY + j) * cellSize;
                g.drawImage(image, x, y, cellSize, cellSize, null);
            }
        }

        // Draw the grid lines
        g.setColor(Color.BLACK);
        for (int i = 0; i <= 2; i++) {
            g.drawLine((offsetX + i) * cellSize, offsetY * cellSize, (offsetX + i) * cellSize, (offsetY + 2) * cellSize);
            g.drawLine(offsetX * cellSize, (offsetY + i) * cellSize, (offsetX + 2) * cellSize, (offsetY + i) * cellSize);
        }
    }
}
