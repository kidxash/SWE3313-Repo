import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TakeOrderScreen extends JFrame {
    private JTextArea orderArea;
    private JTextField itemField;
    private JTextField quantityField;
    private JButton addItemButton;
    private List<String> orderItems;

    public TakeOrderScreen() {
        setTitle("Take Customer Order");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        orderItems = new ArrayList<>();

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

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
        }
        );

        setLocationRelativeTo(null);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel itemLabel = new JLabel("Item:");
        itemLabel.setBounds(10, 20, 80, 25);
        panel.add(itemLabel);

        itemField = new JTextField(20);
        itemField.setBounds(100, 20, 165, 25);
        panel.add(itemField);

        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setBounds(10, 50, 80, 25);
        panel.add(quantityLabel);

        quantityField = new JTextField(20);
        quantityField.setBounds(100, 50, 165, 25);
        panel.add(quantityField);

        addItemButton = new JButton("Add Item");
        addItemButton.setBounds(10, 80, 255, 25);
        panel.add(addItemButton);

        orderArea = new JTextArea();
        orderArea.setBounds(10, 110, 355, 140);
        panel.add(orderArea);
    }
}
