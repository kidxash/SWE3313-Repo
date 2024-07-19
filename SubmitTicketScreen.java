import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class SubmitTicketScreen extends JFrame {
    private JTextArea issueArea;
    private JButton submitButton;
    private JButton backButton;

    public SubmitTicketScreen() {
        setTitle("Submit a Ticket");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        JLabel issueLabel = new JLabel("Describe Your Issue:");
        issueLabel.setBounds(10, 10, 150, 25);
        panel.add(issueLabel);

        issueArea = new JTextArea();
        JScrollPane issueScrollPane = new JScrollPane(issueArea);
        issueScrollPane.setBounds(10, 40, 360, 150);
        panel.add(issueScrollPane);

        submitButton = new JButton("Submit");
        submitButton.setBounds(10, 200, 175, 30);
        panel.add(submitButton);

        backButton = new JButton("Back");
        backButton.setBounds(195, 200, 175, 30);
        panel.add(backButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String issueDescription = issueArea.getText();
                if (!issueDescription.trim().isEmpty()) {
                    try (FileWriter writer = new FileWriter("support_tickets.txt", true)) {
                        writer.write(issueDescription + "\n");
                        JOptionPane.showMessageDialog(null, "Support ticket submitted!");
                        issueArea.setText("");
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please describe your issue.");
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new SupportScreen().setVisible(true);
            }
        });

        setLocationRelativeTo(null);
    }
}
