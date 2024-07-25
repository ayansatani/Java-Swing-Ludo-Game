package View;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    private static final long serialVersionUID = 1L;
    private static final int BOARD_SIZE = 15;
    private JButton[][] buttons;

    private RedHomeBase redHomeBase;
    private GreenHomeBase greenHomeBase;
    private YellowHomeBase yellowHomeBase;
    private BlueHomeBase blueHomeBase;
    private VictoryBase victoryBase;

    public GameBoard() {
        setPreferredSize(new Dimension(700, 700));
        setBackground(Color.WHITE);
        setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));

        buttons = new JButton[BOARD_SIZE][BOARD_SIZE];

        // Initialize buttons for each cell in the grid
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                JButton button = new JButton();
                button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                button.setBackground(Color.WHITE);
                button.setFocusable(false);
                
                buttons[i][j] = button;
                add(button);
            }
        }

        // Set the home base areas
        redHomeBase = new RedHomeBase();
        greenHomeBase = new GreenHomeBase();
        yellowHomeBase = new YellowHomeBase();
        blueHomeBase = new BlueHomeBase();
        victoryBase = new VictoryBase();

        setHomeBaseAreas();
        colorSelectedBlocks();
    }

    private void setHomeBaseAreas() {
        // Red home base
        setHomeBase(redHomeBase, 0, 0, 6);

        // Green home base
        setHomeBase(greenHomeBase, 9, 0, 6);

        // Yellow home base
        setHomeBase(yellowHomeBase, 0, 9, 6);

        // Blue home base
        setHomeBase(blueHomeBase, 9, 9, 6);
        
        // Central Victory Base
        setHomeBase(victoryBase, 6, 6, 3);
    }

    private void setHomeBase(JPanel homeBase, int startX, int startY, int size) {
        Component[] homeBaseComponents = homeBase.getComponents();
        int index = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int indexX = startX + i;
                int indexY = startY + j;
                if (indexX < BOARD_SIZE && indexY < BOARD_SIZE && index < homeBaseComponents.length) {
                    remove(buttons[indexX][indexY]);
                    add(homeBaseComponents[index], indexX * BOARD_SIZE + indexY);
                    index++;
                }
            }
        }
    }

    private void colorSelectedBlocks() {
        // Example positions to color
        int[][] redPositions = {{6,1}, {7,1}, {7,2}, {7,3}, {7,4}, {7,5}, {2,6}};
        int[][] greenPositions = {{13,6}, {13,7}, {12,7}, {11,7}, {10,7}, {9,7}, {8,2}};
        int[][] yellowPositions = {{1,8}, {1,7}, {2,7}, {3,7}, {4,7}, {5,7}, {6,12}};
        int[][] bluePositions = {{8,13}, {7,13}, {7,12}, {7,11}, {7,10}, {7,9}, {12,8}};

        // Color the blocks
        setColorForPositions(redPositions, new Color(235, 28, 36));
        setColorForPositions(greenPositions, new Color(2, 160, 75));
        setColorForPositions(yellowPositions, new Color(255, 224, 19));
        setColorForPositions(bluePositions, new Color(34, 64, 154));
    }

    private void setColorForPositions(int[][] positions, Color color) {
        for (int[] position : positions) {
            int x = position[0];
            int y = position[1];
            if (x < BOARD_SIZE && y < BOARD_SIZE) {
                buttons[x][y].setBackground(color);
            }
        }
    }

}
