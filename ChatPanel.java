package View;

import javax.swing.*;
import java.awt.*;

public class ChatPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    public ChatPanel() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 700));

        // Chat Area
        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane chatScrollPane = new JScrollPane(chatArea);

        // Chat Input
        JTextField chatInput = new JTextField();
        JButton sendButton = new JButton("Send");
        JPanel inputPanel = new JPanel(new BorderLayout());
        sendButton.setFocusable(false);//removes the rectangle from around the send button
        inputPanel.add(chatInput, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        // Add components to the panel
        add(chatScrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);
    }
}
