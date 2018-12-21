package ru.mikaev.sapr;

import ru.mikaev.sapr.frame.FrameFactory;
import ru.mikaev.sapr.frame.MainFrame;

public class Application {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }


    private static void createAndShowGUI() {
        final MainFrame mainFrame = FrameFactory.mainFrame();
        mainFrame.setVisible(true);
    }
}
