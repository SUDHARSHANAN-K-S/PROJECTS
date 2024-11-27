import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class RoomBooking {
    public RoomBooking(ArrayList<String> rooms, ArrayList<String> reservations) {
        JFrame bookingFrame = new JFrame("Room Booking");
        bookingFrame.setSize(300, 200);
        JComboBox<String> roomList = new JComboBox<>(rooms.toArray(new String[0]));
        JButton bookButton = new JButton("Book");
        JButton backButton = new JButton("Back");
        bookingFrame.setLayout(new GridLayout(3, 1));
        bookingFrame.add(new JLabel("Select a room to book:"));
        bookingFrame.add(roomList);
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(bookButton);
        buttonPanel.add(backButton);
        bookingFrame.add(buttonPanel);
        bookButton.addActionListener(e -> {
            String selectedRoom = (String) roomList.getSelectedItem();
            if (selectedRoom != null) {
                rooms.remove(selectedRoom);
                reservations.add(selectedRoom);
                JOptionPane.showMessageDialog(bookingFrame, selectedRoom + " booked successfully!");
                bookingFrame.dispose();
            }
        });
        backButton.addActionListener(e -> bookingFrame.dispose());
        bookingFrame.setVisible(true);
    }
}
