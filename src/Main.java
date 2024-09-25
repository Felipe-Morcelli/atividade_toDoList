import javax.swing.*;

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        ToDoListGUI dot = new ToDoListGUI();
        dot.setVisible(true);
    });
}