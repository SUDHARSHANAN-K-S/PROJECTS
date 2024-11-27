import javax.swing.*;
import java.awt.*;
public class CustomerRegistration {
    public CustomerRegistration() {
        JFrame registerFrame = new JFrame("Customer Registration");
        registerFrame.setSize(300, 200);
        registerFrame.setLayout(new GridLayout(3, 1));
        JLabel label = new JLabel("Register a new customer with Name: ");
        JTextField nameField = new JTextField();
        JButton registerButton = new JButton("Register");
        registerFrame.add(label);
        registerFrame.add(nameField);
        registerFrame.add(registerButton);
        registerButton.addActionListener(e -> JOptionPane.showMessageDialog(registerFrame,
                "Customer " + nameField.getText() + " registered successfully!"));
        registerFrame.setVisible(true);
    }
}
