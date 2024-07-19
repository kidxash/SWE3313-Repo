import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactScreen extends JFrame {
    private JTextArea contactArea;
    private JButton backButton;

    public ContactScreen() {
        setTitle("Contact Information");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        contactArea = new JTextArea();
        contactArea.setEditable(false);
        contactArea.setText("Email: support@example.com\n" +
                "Phone: 1-800-123-4567\n" +
                "Address: 1234 Support Lane, Helpville, CA");
        JScrollPane contactScrollPane = new JScrollPane(contactArea);
        contactScrollPane.setBounds(10, 10, 360, 100);
        panel.add(contactScrollPane);

        backButton = new JButton("Back");
        backButton.setBounds(10, 120, 360, 30);
        panel.add(backButton);

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
