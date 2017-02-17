package com.company.cplayer.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created on 16.02.2017.
 * At 20:49.
 * Today is четверг
 */
public class MainFrame extends javax.swing.JFrame {
    private static BoxLayout boxLayoutSouth;
    private static BoxLayout boxLayoutNorth;
    private static BorderLayout borderLayoutMain;

    private static JPanel panelSouth;
    private static JPanel panelNorth;
    private static JPanel panelCenter;

    private static final Dimension BUTTOM_MENU_DIMENSION = new Dimension(50, 20);

    private static JButton buttonMenuFile;
    private static JButton buttonMenuView;
    private static JButton buttonMenuSetiings;


    private MainFrame(String title){
        super(title);
        init();
        setLayouts();
    }

    public MainFrame(String title, int width, int height){
        this(title);
        setSize(width, height);
    }

    private void init(){
        borderLayoutMain = new BorderLayout();

        panelCenter = new JPanel();
        panelSouth = new JPanel();
        panelNorth = new JPanel();

        boxLayoutSouth = new BoxLayout(panelSouth, BoxLayout.X_AXIS);
        boxLayoutNorth = new BoxLayout(panelNorth, BoxLayout.X_AXIS);

        buttonMenuFile = new JButton("File");
        buttonMenuFile.setPreferredSize(BUTTOM_MENU_DIMENSION);

        buttonMenuView = new JButton("View");
        buttonMenuView.setPreferredSize(BUTTOM_MENU_DIMENSION);

        buttonMenuSetiings = new JButton("Settings");
        buttonMenuSetiings.setPreferredSize(BUTTOM_MENU_DIMENSION);


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void setLayouts(){
        setLayout(borderLayoutMain);

        this.add(BorderLayout.CENTER, panelCenter);
        panelCenter.setSize(this.getSize());
        panelCenter.setLayout(new BorderLayout());
        panelCenter.add(BorderLayout.CENTER, new JButton("Center Button 1"));

        this.add(BorderLayout.SOUTH, panelSouth);
        panelSouth.setLayout(boxLayoutSouth);
        panelSouth.add(new JButton("South Button 1"));
        panelSouth.add(new JButton("South Button 2"));
        panelSouth.add(new JButton("South Button 3"));


        this.add(BorderLayout.NORTH, panelNorth);
        panelNorth.setLayout(boxLayoutNorth);
        panelNorth.add(buttonMenuFile);
        panelNorth.add(buttonMenuSetiings);
        panelNorth.add(buttonMenuView);

    }
}
