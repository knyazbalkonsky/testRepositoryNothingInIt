package com.company.cplayer.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created on 17.02.2017.
 * At 20:10.
 * Today is пятница
 */
public class MainFrame extends JFrame {
    private JPanel rootPanel;
    private JButton fileButton;
    private JButton viewButton;
    private JButton settingsButton;
    private JButton stopButton;
    private JButton pauseButton;
    private JButton playButton;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    private MainFrame(String title) {
        super(title);
        setContentPane(rootPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public MainFrame(String title, int width, int height) {
        this(title);
        setSize(width, height);
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new BorderLayout(0, 0));
        rootPanel.setEnabled(false);
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        rootPanel.add(panel2, BorderLayout.NORTH);
        fileButton = new JButton();
        fileButton.setText("Button");
        fileButton.setMnemonic('B');
        fileButton.setDisplayedMnemonicIndex(0);
        panel2.add(fileButton);
        viewButton = new JButton();
        viewButton.setText("Button");
        panel2.add(viewButton);
        settingsButton = new JButton();
        settingsButton.setText("Button");
        panel2.add(settingsButton);
        panel3 = new JPanel();
        panel3.setLayout(new BorderLayout(0, 0));
        rootPanel.add(panel3, BorderLayout.CENTER);
        panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel4.putClientProperty("html.disable", Boolean.FALSE);
        panel3.add(panel4, BorderLayout.SOUTH);
        stopButton = new JButton();
        stopButton.setText("Button");
        panel4.add(stopButton);
        pauseButton = new JButton();
        pauseButton.setText("Button");
        panel4.add(pauseButton);
        playButton = new JButton();
        playButton.setText("Button");
        panel4.add(playButton);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
