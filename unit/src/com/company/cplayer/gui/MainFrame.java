package com.company.cplayer.gui;

import javax.swing.*;

/**
 * Created on 16.02.2017.
 * At 20:49.
 * Today is четверг
 */
public class MainFrame extends javax.swing.JFrame {
    public MainFrame(String title){
        super(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public MainFrame(String title, int width, int height){
        this(title);
        setSize(width, height);
    }
}
