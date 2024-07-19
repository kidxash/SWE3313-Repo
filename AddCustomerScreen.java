import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class AddCustomerScreen extends JFrame {
    private JTextField nameFirstField;
    private JTextField storeField;
    private JTextField addressField;
    private JTextField contactField;
    private JButton saveButton;
    private JButton loadingSpace;

    public AddCustomerScreen() {
        setTitle("Add New Customer");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameFirst = nameFirstField.getText();
                String store = storeField.getText();
                String address = addressField.getText();
                String contact = contactField.getText();

                // Save customer data to a file (for simplicity, using CSV format)
                try (FileWriter writer = new FileWriter("customers.txt", true)) {
                    writer.write(nameFirst + "," + store + "," + address + "," + contact + "\n");
                    JOptionPane.showMessageDialog(null, "Customer Added!");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        setLocationRelativeTo(null);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 20, 80, 25);
        panel.add(nameLabel);

        nameFirstField = new JTextField(20);
        nameFirstField.setBounds(100, 20, 165, 25);
        panel.add(nameFirstField);

        JLabel storeLabel = new JLabel("Store:");
        storeLabel.setBounds(10, 50, 80, 25);
        panel.add(storeLabel);

        storeField = new JTextField(20);
        storeField.setBounds(100, 50, 165, 25);
        panel.add(storeField);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(10, 80, 80, 25);
        panel.add(addressLabel);

        addressField = new JTextField(20);
        addressField.setBounds(100, 80, 165, 25);
        panel.add(addressField);

        JLabel contactLabel = new JLabel("Contact:");
        contactLabel.setBounds(10, 110, 80, 25);
        panel.add(contactLabel);

        contactField = new JTextField(20);
        contactField.setBounds(100, 110, 165, 25);
        panel.add(contactField);

        saveButton = new JButton("Save");
        saveButton.setBounds(10, 140, 255, 25);
        panel.add(saveButton);
    }
}
