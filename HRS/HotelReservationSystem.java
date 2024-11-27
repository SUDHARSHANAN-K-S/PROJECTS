import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class HotelReservationSystem {
    private ArrayList<String> rooms;
    private ArrayList<String> reservations;
    public HotelReservationSystem() {
        rooms = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            rooms.add("Room " + i);
        }
        reservations = new ArrayList<>();
        JFrame frame = new JFrame("Hotel Reservation System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JLabel title = new JLabel("Hotel Reservation System", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(title, BorderLayout.NORTH);
        JPanel mainPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        JButton registerButton = new JButton("Customer Registration");
        JButton bookingButton = new JButton("Room Booking");
        JButton managementButton = new JButton("Room Management");
        JButton billingButton = new JButton("Billing");
        mainPanel.add(registerButton);
        mainPanel.add(bookingButton);
        mainPanel.add(managementButton);
        mainPanel.add(billingButton);
        frame.add(mainPanel, BorderLayout.CENTER);
        registerButton.addActionListener(e -> new CustomerRegistration());
        bookingButton.addActionListener(e -> new RoomBooking(rooms, reservations));
        managementButton.addActionListener(e -> new RoomManagement(rooms));
        billingButton.addActionListener(e -> new Billing(reservations));
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(HotelReservationSystem::new);
    }
}
