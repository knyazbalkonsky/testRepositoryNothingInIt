package com.company.cplayer.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created on 16.02.2017.
 * At 20:49.
 * Today is четверг
 */
public class MainFrame extends javax.swing.JFrame {
    public MainFrame(String title){
        super(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(BorderLayout.CENTER ,new Button("CENTER"));
        add(BorderLayout.WEST, new Button("WEST"));
        add(BorderLayout.EAST, new Button("EAST"));
        add(BorderLayout.NORTH, new Button("NORTH"));
        add(BorderLayout.SOUTH, new Button("SOUTH"));
        setSize(600, 600);
    }

    public MainFrame(String title, int width, int height){
        this(title);
        setSize(width, height);
    }
}
