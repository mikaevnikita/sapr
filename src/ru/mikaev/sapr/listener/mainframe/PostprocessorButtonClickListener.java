package ru.mikaev.sapr.listener.mainframe;

import ru.mikaev.sapr.frame.FrameFactory;
import ru.mikaev.sapr.frame.PostprocessorFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PostprocessorButtonClickListener implements ActionListener {
    private static PostprocessorFrame postprocessorFrame = FrameFactory.postprocessorFrame();

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        postprocessorFrame.setVisible(true);
    }
}
