package ru.mikaev.sapr.frame;

import ru.mikaev.sapr.listener.mainframe.PostprocessorButtonClickListener;
import ru.mikaev.sapr.listener.mainframe.PreprocessorButtonClickListener;
import ru.mikaev.sapr.listener.mainframe.ProcessorButtonClickListener;

import javax.swing.*;
import java.awt.*;

public class FrameFactory {
    private static PreprocessorFrame preprocessorFrame;
    private static ProcessorFrame processorFrame;
    private static PostprocessorFrame postprocessorFrame;
    private static MainFrame mainFrame;

    public static PreprocessorFrame preprocessorFrame(){
        if(preprocessorFrame == null){
            preprocessorFrame = new PreprocessorFrame();
            configurePreprocessorFrame(preprocessorFrame);
        }

        return preprocessorFrame;
    }

    public static ProcessorFrame processorFrame(){
        if(processorFrame == null){
            processorFrame = new ProcessorFrame();
            configureProcessorFrame(processorFrame);
        }

        return processorFrame;
    }

    public static PostprocessorFrame postprocessorFrame(){
        if(postprocessorFrame == null){
            postprocessorFrame = new PostprocessorFrame();
            configurePostprocessorFrame(postprocessorFrame);
        }

        return postprocessorFrame;
    }

    public static MainFrame mainFrame(){
        if(mainFrame == null){
            mainFrame = new MainFrame();
            configureMainFrame(mainFrame);
        }

        return mainFrame;
    }

    private static void configurePreprocessorFrame(PreprocessorFrame preprocessorFrame) {
        preprocessorFrame.setTitle("PREPROCESSOR");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        final int width = PreprocessorFrame.dimension.width;
        final int height = PreprocessorFrame.dimension.height;
        preprocessorFrame.setBounds(screenSize.width / 2, screenSize.height / 2, width, height);
    }
    private static void configureProcessorFrame(ProcessorFrame processorFrame){
        processorFrame.setTitle("PROCESSOR");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        final int width = ProcessorFrame.dimension.width;
        final int height = ProcessorFrame.dimension.height;
        processorFrame.setBounds(screenSize.width / 2, screenSize.height / 2, width, height);    }

    private static void configurePostprocessorFrame(PostprocessorFrame postprocessorFrame){
        postprocessorFrame.setTitle("POSTPROCESSOR");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        final int width = PostprocessorFrame.dimension.width;
        final int height = PostprocessorFrame.dimension.height;
        postprocessorFrame.setBounds(screenSize.width / 2, screenSize.height / 2, width, height);    }

    private static void configureMainFrame(MainFrame mainFrame){
        mainFrame.setTitle("SAPR");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        final int width = MainFrame.dimension.width;
        final int height = MainFrame.dimension.height;
        mainFrame.setBounds(screenSize.width/2, screenSize.height/2, width, height);
        addComponentsToMainFrame(mainFrame.getContentPane());

        mainFrame.pack();
    }

    private static void addComponentsToMainFrame(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

        JButton preprocessorButton = new JButton("Препроцессор");
        preprocessorButton.addActionListener(new PreprocessorButtonClickListener());
        preprocessorButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        pane.add(preprocessorButton);

        JButton processorButton = new JButton("Процессор");
        processorButton.addActionListener(new ProcessorButtonClickListener());
        processorButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        pane.add(processorButton);

        JButton postprocessorButton = new JButton("Постпроцессор");
        postprocessorButton.addActionListener(new PostprocessorButtonClickListener());
        postprocessorButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        pane.add(postprocessorButton);
    }
}
