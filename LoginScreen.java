import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {

    // Constructor to setup the GUI components
    public LoginScreen() {
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

        //Another Panel to hold the textboxes and labels
        JPanel loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setBackground(Color.CYAN);

        // Add Username label and text field
        JLabel userLabel = new JLabel("Username: ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        loginPanel.add(userLabel, gbc);

        JTextField userText = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        loginPanel.add(userText, gbc);

        // Add Password label and text field
        JLabel passwordLabel = new JLabel("Password: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        loginPanel.add(passwordLabel, gbc);

        JPasswordField passwordText = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        loginPanel.add(passwordText, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.ipadx = 20;
        gbc.ipady = 20;
        gbc.insets = new Insets(20, 0, 20, 0);
        mainPanel.add(loginPanel, gbc);

        //Final Panel to hold buttons
        JPanel buttonPanel = new JPanel(new GridBagLayout());

        // Add Login button
        JButton loginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(20,20,20,20);
        gbc.ipadx = 20;
        buttonPanel.add(loginButton, gbc);

        // Add register button
        JButton regButton = new JButton("Register");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        buttonPanel.add(regButton, gbc);

        // Add action listener to the button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                // Simple validation
                if(username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(mainPanel, "Login successful!");
                    new MainScreen().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(mainPanel, "Invalid username or password.");
                }
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 3;
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
                new LoginScreen().setVisible(true);
            }
        });
    }
}