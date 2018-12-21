package ru.mikaev.sapr.listener.mainframe;

import ru.mikaev.sapr.frame.FrameFactory;
import ru.mikaev.sapr.frame.PreprocessorFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PreprocessorButtonClickListener implements ActionListener {
    private static PreprocessorFrame preprocessorFrame = FrameFactory.preprocessorFrame();

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        preprocessorFrame.setVisible(true);
    }
}
