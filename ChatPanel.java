package View;

import javax.swing.*;
import java.awt.*;

public class ChatPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JLabel chatHeadLabel;

    public ChatPanel() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 700));

        // Create JPanel for top portion with FlowLayout
     	JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

     	// Add a JLabel with text and set its foreground color
 		chatHeadLabel = new JLabel("Chat");
 		chatHeadLabel.setForeground(Color.BLACK);
 		chatHeadLabel.setFont(new Font("Default", Font.CENTER_BASELINE, 22));
     	topPanel.add(chatHeadLabel);// Add the JLabel to the topPanel

        // Chat Area
        JTextArea chatArea = new JTextArea();
        JScrollPane chatScrollPane = new JScrollPane(chatArea);

        // Chat Input
        JTextField chatInput = new JTextField();
        JButton sendButton = new JButton("Send");
        JPanel inputPanel = new JPanel(new BorderLayout());
        sendButton.setFocusable(false);
        inputPanel.add(chatInput, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        // Add components to the panel
     	add(topPanel, BorderLayout.NORTH);
        add(chatScrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);
    }
}
