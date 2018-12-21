package ru.mikaev.sapr.listener.mainframe;

import ru.mikaev.sapr.frame.FrameFactory;
import ru.mikaev.sapr.frame.ProcessorFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProcessorButtonClickListener implements ActionListener {
    private static ProcessorFrame processorFrame = FrameFactory.processorFrame();

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        processorFrame.setVisible(true);
    }
}
