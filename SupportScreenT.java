import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SupportScreenT extends JFrame {

    // Constructor to setup the GUI components
    public SupportScreenT() {
        // Create a mainPanel to hold all components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.CYAN, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;

        //Title panel
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new GridBagLayout());
        titlePanel.setBackground(Color.CYAN);

            JLabel titleLabel = new JLabel("Support");
            gbc.gridx = 0;
            gbc.gridy = 0;
            titlePanel.add(titleLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = 20;
        mainPanel.add(titlePanel, gbc);

        //Panel to hold buttons
        JPanel infoPanel = new JPanel(new GridBagLayout());

            //Add FAQ button
            JButton faqButton = new JButton("FAQs");
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.LINE_START;
            infoPanel.add(faqButton, gbc);

            //Add Contact button
            JButton contactButton = new JButton("Contact");
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.anchor = GridBagConstraints.LINE_START;
            infoPanel.add(contactButton, gbc);

            //Add Submit Ticket button
            JButton submitTicketButton = new JButton("Submit Ticket");
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.anchor = GridBagConstraints.LINE_START;
            infoPanel.add(submitTicketButton, gbc);

            //Add back button
            JButton backButton = new JButton("Back");
            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.anchor = GridBagConstraints.LINE_START;
            infoPanel.add(backButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(infoPanel, gbc);

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

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainScreen().setVisible(true);
            }
        });

        // Add the mainPanel to the frame
        add(mainPanel);
        setSize(600,800); //Sets width and height of window

        setTitle("Support");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create and display the login form
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SupportScreen().setVisible(true);
            }
        });
    }
}