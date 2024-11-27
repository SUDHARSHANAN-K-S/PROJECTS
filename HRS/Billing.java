import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Billing {
    public Billing(ArrayList<String> reservations) {
        JFrame billingFrame = new JFrame("Billing");
        billingFrame.setSize(300, 200);
        JTextArea billingArea = new JTextArea("Reservations for Billing:\n");
        for (String reservation : reservations) {
            billingArea.append(reservation + " - $100\n");
        }
        billingArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(billingArea);
        JButton closeButton = new JButton("Close");
        billingFrame.setLayout(new BorderLayout());
        billingFrame.add(scrollPane, BorderLayout.CENTER);
        billingFrame.add(closeButton, BorderLayout.SOUTH);
        closeButton.addActionListener(e -> billingFrame.dispose());
        billingFrame.setVisible(true);
    }
}
