package ru.mikaev.sapr;

import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setTitle("SAPR");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        final int width = 500;
        final int height = 500;
        jFrame.setBounds(screenSize.width/2, screenSize.height/2, width, height);
    }
}
