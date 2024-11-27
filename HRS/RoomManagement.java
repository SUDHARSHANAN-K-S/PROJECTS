import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class RoomManagement {
    public RoomManagement(ArrayList<String> rooms) {
        JFrame managementFrame = new JFrame("Room Management");
        managementFrame.setSize(300, 200);
        JTextArea roomsArea = new JTextArea("Available Rooms:\n");
        for (String room : rooms) {
            roomsArea.append(room + "\n");
        }
        roomsArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(roomsArea);
        JButton closeButton = new JButton("Close");
        managementFrame.setLayout(new BorderLayout());
        managementFrame.add(scrollPane, BorderLayout.CENTER);
        managementFrame.add(closeButton, BorderLayout.SOUTH);
        closeButton.addActionListener(e -> managementFrame.dispose());
        managementFrame.setVisible(true);
    }
}
