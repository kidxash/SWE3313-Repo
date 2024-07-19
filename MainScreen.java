import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame {
    private JButton addCustomerButton;
    private JButton takeOrderButton;
    private JButton submitOrderButton;
    private JButton supportButton;
    private JButton logoutButton;

    public MainScreen() {
        setTitle("Sales Representative System");
        setSize(200, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        addCustomerButton = new JButton("Add New Customer");
        addCustomerButton.setBounds(10, 20, 160, 25);
        panel.add(addCustomerButton);

        takeOrderButton = new JButton("Take Customer Order");
        takeOrderButton.setBounds(10, 60, 160, 25);
        panel.add(takeOrderButton);

        submitOrderButton = new JButton("Submit Order");
        submitOrderButton.setBounds(10, 100, 160, 25);
        panel.add(submitOrderButton);

        supportButton = new JButton("Support");
        supportButton.setBounds(10, 140, 160, 25);
        panel.add(supportButton);

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(10, 180, 160, 25);
        panel.add(logoutButton);

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

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MainScreen().setVisible(true);
    }
}
