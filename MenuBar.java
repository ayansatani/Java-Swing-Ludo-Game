package View;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Control.MenuController;

public class MenuBar {
    private JMenuBar menuBar;

    public MenuBar() {
        menuBar = new JMenuBar();

       //introducing/creating new menu-items(menu options) for the menu bar
        JMenuItem New = new JMenuItem("New Game");
        JMenuItem Translate = new JMenuItem("Translate");
        JMenuItem Help = new JMenuItem("Help");
        JMenuItem About = new JMenuItem("About");
        JMenuItem Exit = new JMenuItem("Exit");

        //adding actionlisteners from menucotroller
        Help.addActionListener(MenuController.getHelpActionListener());
        About.addActionListener(MenuController.getAboutActionListener());
        Exit.addActionListener(MenuController.getExitActionListener());

        //adding menuitems to the menu bar
        menuBar.add(New);
        menuBar.add(Translate);
        menuBar.add(Help);
        menuBar.add(About);
        menuBar.add(Exit);
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }
}
