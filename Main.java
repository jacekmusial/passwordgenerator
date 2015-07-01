package passwordgenerator;

import java.awt.EventQueue;

public class Main {

    private static void loadGUI() {
            EventQueue.invokeLater(() -> {
                GUI gui = new GUI();
                gui.createAndShowGUI();
                gui.setVisible(true);
            });
    }

    public static void main(String[] args) {
        loadGUI();
    }
}