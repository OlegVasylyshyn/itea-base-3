package week6.day1.swing;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MainFrame extends JFrame {

    private JButton saveButton = new JButton("SAVE");
    private JButton openButton = new JButton("OPEN");
    private JButton clearButton = new JButton("CLEAR");

    private JTextArea textArea = new JTextArea(25, 25);

    private JPanel buttonPanel = new JPanel();
    private JPanel rightPanel = new JPanel();
    private JPanel mainPanel = new JPanel();


    public MainFrame() throws HeadlessException, IOException {
//        BufferedImage myPicture = ImageIO.read(new File("MyRecord.jpg"));
//        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
//        add(picLabel);
        initComponents();
        setActionListeners();
        initFrameSettings();
    }

    private void setActionListeners() {
        openButton.addActionListener(e -> {
            new OpenFrame(textArea);
        });
        clearButton.addActionListener(e -> {
            textArea.setText("");
        });
    }

    private void initComponents() {
        buttonPanel.setLayout(new GridLayout(5, 1));
        buttonPanel.add(saveButton);
        buttonPanel.add(openButton);
        buttonPanel.add(clearButton);

        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(buttonPanel, BorderLayout.NORTH);

        textArea.setLineWrap(true);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(textArea, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.EAST);

        JScrollPane scroll = new JScrollPane(mainPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scroll);

        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("file");
        Menu infoMenu = new Menu("info");
        Menu helpMenu = new Menu("help");

        MenuItem openItemMenu = new MenuItem("open");
        MenuItem saveItemMenu = new MenuItem("save");
        MenuItem clearItemMenu = new MenuItem("clear");

        MenuItem aboutItemMenu = new MenuItem("about");

        MenuItem helpItemMenu = new MenuItem("help");

        fileMenu.add(openItemMenu);
        fileMenu.add(saveItemMenu);
        fileMenu.add(clearItemMenu);

        infoMenu.add(aboutItemMenu);

        helpMenu.add(helpItemMenu);

        menuBar.add(fileMenu);
        menuBar.add(infoMenu);
        menuBar.add(helpMenu);

        setMenuBar(menuBar);
    }

    private void initFrameSettings() {
        setSize(400, 500);
        setLocation(400, 200);
        setResizable(false);
        setTitle("Notepad");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
