package View;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Control.MenuController;

public class MenuBar {
    private JMenuBar menuBar;

    public MenuBar() {
        menuBar = new JMenuBar();

        // Introducing/creating new menu-items(menu options) for the menu bar
        JMenuItem New = new JMenuItem("New Game");
        JMenuItem Connect = new JMenuItem("Connect");
        JMenuItem Disconnect = new JMenuItem("Disconnect");
        JMenuItem Translate = new JMenuItem("Translate");
        JMenuItem Help = new JMenuItem("Help");
        JMenuItem About = new JMenuItem("About");
        JMenuItem Feedback = new JMenuItem("Feedback");
        JMenuItem Exit = new JMenuItem("Exit");

        // Adding action listeners from MenuController
        Help.addActionListener(MenuController.getHelpActionListener());
        About.addActionListener(MenuController.getAboutActionListener());
        Feedback.addActionListener(MenuController.getFeedbackActionListener());
        Exit.addActionListener(MenuController.getExitActionListener());

        // Adding menu items to the menu bar
        menuBar.add(New);
        menuBar.add(Connect);
        menuBar.add(Disconnect);
        menuBar.add(Translate);
        menuBar.add(Help);
        menuBar.add(About);
        menuBar.add(Feedback);
        menuBar.add(Exit);
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }
}
