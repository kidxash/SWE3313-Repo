import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame {

    // Constructor to setup the GUI components
    public MainScreen() {
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

        JLabel titleLabel = new JLabel("AB Distributing Co.");
        gbc.gridx = 0;
        gbc.gridy = 0;
        titlePanel.add(titleLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = 20;
        mainPanel.add(titlePanel, gbc);

        //Panel to hold buttons
        JPanel buttonPanel = new JPanel(new GridBagLayout());

        // Add addCustomer button
        JButton addCustomerButton = new JButton("Add Customer");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(20,20,20,20);
        gbc.ipadx = 20;
        buttonPanel.add(addCustomerButton, gbc);

        // Add takeOrder button
        JButton takeOrderButton = new JButton("Take Order");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        buttonPanel.add(takeOrderButton, gbc);

        // Add submitOrder button
        JButton submitOrderButton = new JButton("Submit Order");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        buttonPanel.add(submitOrderButton, gbc);

        // Add support button
        JButton supportButton = new JButton("Support");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        buttonPanel.add(supportButton, gbc);

        // Add logout button
        JButton logoutButton = new JButton("Logout");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.LINE_START;
        buttonPanel.add(logoutButton, gbc);


        addCustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddCustomerScreen().setVisible(true);
            }
        });

        takeOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TakeOrderScreen().setVisible(true);
            }
        });

        submitOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Simulate submitting the order by writing to a file
                // Implementation code here
                JOptionPane.showMessageDialog(null, "Order Submitted!");
            }
        });

        supportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SupportScreen().setVisible(true);
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

        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(buttonPanel, gbc);

        // Add the mainPanel to the frame
        add(mainPanel);
        setSize(600,800); //Sets width and height of window

        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create and display the login form
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
}