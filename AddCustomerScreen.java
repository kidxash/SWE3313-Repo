import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class AddCustomerScreen extends JFrame {

    // Constructor to setup the GUI components
    public AddCustomerScreen() {
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

        JLabel titleLabel = new JLabel("Add Customer");
        gbc.gridx = 0;
        gbc.gridy = 0;
        titlePanel.add(titleLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = 20;
        mainPanel.add(titlePanel, gbc);

        //Panel to hold buttons
        JPanel infoPanel = new JPanel(new GridBagLayout());

        // Add Name label and textbox
        JLabel nameLabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0,0,0,0);
        gbc.ipadx = 20;
        infoPanel.add(nameLabel, gbc);

        JTextField nameField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0,0,0,0);
        gbc.ipadx = 20;
        infoPanel.add(nameField, gbc);

        // Add store label and textboc
        JLabel storeLabel = new JLabel("Store:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        infoPanel.add(storeLabel, gbc);

        JTextField storeField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        infoPanel.add(storeField, gbc);

        // Add address label and textbox
        JLabel addressLabel = new JLabel("Address:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        infoPanel.add(addressLabel, gbc);

        JTextField addressField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        infoPanel.add(addressField, gbc);

        // Add conatact label and field
        JLabel contactLabel = new JLabel("Contact:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.LINE_START;
        infoPanel.add(contactLabel, gbc);

        JTextField contactField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.LINE_START;
        infoPanel.add(contactField, gbc);

        //Add back button
        JButton backButton = new JButton("Back");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.LINE_START;
        infoPanel.add(backButton, gbc);

        // Add Save button
        JButton saveButton = new JButton("Save");
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.LINE_START;
        infoPanel.add(saveButton, gbc);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String store = storeField.getText();
                String address = addressField.getText();
                String contact = contactField.getText();

                // Save customer data to a file (for simplicity, using CSV format)
                try (FileWriter writer = new FileWriter("customers.txt", true)) {
                    writer.write(name + "," + store + "," + address + "," + contact + "\n");
                    JOptionPane.showMessageDialog(null, "Customer Added!");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainScreen().setVisible(true);
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(infoPanel, gbc);

        // Add the mainPanel to the frame
        add(mainPanel);
        setSize(600,800); //Sets width and height of window

        setTitle("Add New Customer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create and display the login form
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddCustomerScreen().setVisible(true);
            }
        });
    }
}