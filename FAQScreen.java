import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FAQScreen extends JFrame {
    private JTextArea faqArea;
    private JButton backButton;

    public FAQScreen() {
        setTitle("FAQs");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        faqArea = new JTextArea();
        faqArea.setEditable(false);
        faqArea.setText("1. How to add a new customer?\n" +
                "   Go to 'Add New Customer' and fill in the details.\n\n" +
                "2. How to take an order?\n" +
                "   Go to 'Take Customer Order' and enter item details.\n\n" +
                "3. How to submit an order?\n" +
                "   After taking the order, click 'Submit Order'.");
        JScrollPane faqScrollPane = new JScrollPane(faqArea);
        faqScrollPane.setBounds(10, 10, 360, 200);
        panel.add(faqScrollPane);

        backButton = new JButton("Back");
        backButton.setBounds(10, 220, 360, 30);
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