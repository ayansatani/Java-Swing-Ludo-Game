package Control;

import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class MenuController {

    public static ActionListener getHelpActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showHelpDialog();
            }
        };
    }

    public static ActionListener getAboutActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAboutDialog();
            }
        };
    }

    public static ActionListener getFeedbackActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmAndSendFeedback();
            }
        };
    }

    public static ActionListener getExitActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitApplication();
            }
        };
    }

    private static void showHelpDialog() {
        String helpMessage = "Welcome to Ludo!\n\n" +
                             "Objective:\n" +
                             "The goal of the game is to move all your tokens from your home base to the finish area before your opponents.\n\n" +
                             "How to Play:\n" +
                             "1. Each player rolls the dice to move their tokens.\n" +
                             "2. Tokens move clockwise around the board according to the number rolled on the dice.\n" +
                             "3. A token can only leave the home base when a 6 is rolled.\n" +
                             "4. Rolling a 6 gives an extra turn.\n" +
                             "5. Tokens can capture opponent's tokens by landing on the same square, sending the opponent's token back to their home base.\n" +
                             "6. The first player to move all their tokens to the finish area wins.\n\n" +
                             "Controls:\n" +
                             "- Click the dice to roll.\n" +
                             "- Click a token to move it after rolling the dice.\n\n" +
                             "Have fun playing Ludo!";
        JOptionPane.showMessageDialog(null, helpMessage, "Ludo 4 - Help", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void showAboutDialog() {
        String aboutMessage = "Ludo Game\nVersion 1.0\n\n" +
                              "Developers:\n" +
                              "Guntas Singh Chugh (guntas235@gmail.com)\n" +
                              "Ayan Satani (ayansatani123@gmail.com)";
        JOptionPane.showMessageDialog(null, aboutMessage, "About Ludo", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void confirmAndSendFeedback() {
        int response = JOptionPane.showConfirmDialog(null, "Consent to redirect to mialing application?", "Feedback", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            sendFeedback();
        }
    }

    private static void sendFeedback() {
        try {
            String[] recipientEmails = {"guntas235@gmail.com", "ayansatani123@gmail.com"};
            StringBuilder mailto = new StringBuilder("mailto:");

            for (int i = 0; i < recipientEmails.length; i++) {
                mailto.append(recipientEmails[i]);
                if (i < recipientEmails.length - 1) {
                    mailto.append(",");
                }
            }

            Desktop.getDesktop().mail(new URI(mailto.toString()));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error opening mail client.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void exitApplication() {
        System.exit(0);
    }
}
