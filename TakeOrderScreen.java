import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TakeOrderScreen extends JFrame {

    // Constructor to setup the GUI components
    public TakeOrderScreen() {
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

        JLabel titleLabel = new JLabel("Take Order");
        gbc.gridx = 0;
        gbc.gridy = 0;
        titlePanel.add(titleLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = 20;
        mainPanel.add(titlePanel, gbc);

        //Panel to hold buttons
        JPanel infoPanel = new JPanel(new GridBagLayout());

        // Add Item label and textbox
        JLabel itemLabel = new JLabel("Item:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0,0,0,0);
        gbc.ipadx = 20;
        infoPanel.add(itemLabel, gbc);

        JTextField itemField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0,0,0,0);
        gbc.ipadx = 20;
        infoPanel.add(itemField, gbc);

        // Add quantity label and textboc
        JLabel quantityLabel = new JLabel("Quantity:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        infoPanel.add(quantityLabel, gbc);

        JTextField quantityField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        infoPanel.add(quantityField, gbc);

        //Add back button
        JButton backButton = new JButton("Back");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.LINE_START;
        infoPanel.add(backButton, gbc);

        // Add "add item" button
        JButton addItemButton = new JButton("Add Item");
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.LINE_START;
        infoPanel.add(addItemButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(infoPanel, gbc);

        //Panel for itemTextArea
        JPanel itemPanel = new JPanel(new GridBagLayout());
        gbc.insets = new Insets(20,20,20,20);

        JTextArea orderArea = new JTextArea();
        gbc.gridx = 0;
        gbc.gridy = 0;
        orderArea.setPreferredSize(new Dimension(300,150));
        itemPanel.add(orderArea, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(itemPanel, gbc);

        List<String> orderItems = new ArrayList<>();
        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item = itemField.getText();
                String quantity = quantityField.getText();
                orderItems.add(item + " - " + quantity);
                orderArea.append(item + " - " + quantity + "\n");
                itemField.setText("");
                quantityField.setText("");
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

        setTitle("Take Order");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create and display the login form
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TakeOrderScreen().setVisible(true);
            }
        });
    }
}