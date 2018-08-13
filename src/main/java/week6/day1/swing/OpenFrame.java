package week6.day1.swing;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class OpenFrame extends JFrame {

    private JFileChooser fileChooser = new JFileChooser();
    private JTextArea textArea;

    public OpenFrame(JTextArea textArea) throws HeadlessException {
        this.textArea = textArea;
        add(fileChooser);
        initActionsListeners();
        initFrameSettings();
    }

    private void initActionsListeners() {
        fileChooser.addActionListener(e -> {
            File selectedFile = fileChooser.getSelectedFile();
            String text = FileUtil.readTextFile(selectedFile);
            textArea.setText(text);
            dispose();
        });
    }

    private void initFrameSettings() {
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }


}
