import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        ArrayList<Friend> guests = new ArrayList<>();
        JOptionPane.showMessageDialog(null, "Welcome to the party guest list!");
        while (true) {
            String name = JOptionPane.showInputDialog(null, "Enter the name of the guest:");
            String food = JOptionPane.showInputDialog(null, "What food will they bring?");
            int invitedChoice = JOptionPane.showConfirmDialog(null, "Are they invited to the party?");
            boolean isInvited = invitedChoice == JOptionPane.YES_OPTION;
            Friend friend = new Friend(name, isInvited, food);
            guests.add(friend);
            JOptionPane.showMessageDialog(null, "Guest added: " + friend);
            int choice = JOptionPane.showConfirmDialog(null, "Add another guest?", "Add Guest", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.NO_OPTION) {
                break;
            }
        }
        StringBuilder report = new StringBuilder();
        for (Friend guest : guests) {
            report.append(guest.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, report.toString(), "Party Guest List", JOptionPane.INFORMATION_MESSAGE);
    }
}