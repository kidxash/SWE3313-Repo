import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SupportScreen extends JFrame {
    private JButton faqButton;
    private JButton contactButton;
    private JButton submitTicketButton;
    private JButton logoutButton;

    public SupportScreen() {
        setTitle("Support");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        faqButton = new JButton("FAQs");
        faqButton.setBounds(10, 20, 260, 30);
        panel.add(faqButton);

        contactButton = new JButton("Contact Information");
        contactButton.setBounds(10, 60, 260, 30);
        panel.add(contactButton);

        submitTicketButton = new JButton("Submit a Ticket");
        submitTicketButton.setBounds(10, 100, 260, 30);
        panel.add(submitTicketButton);

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(10, 140, 260, 30);
        panel.add(logoutButton);

        faqButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new FAQScreen().setVisible(true);
            }
        });

        contactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ContactScreen().setVisible(true);
            }
        });

        submitTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new SubmitTicketScreen().setVisible(true);
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JOptionPane.showMessageDialog(null, "Logged out successfully!");
                new LoginScreen().setVisible(true);
            }
        });

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new SupportScreen().setVisible(true);
    }
}
