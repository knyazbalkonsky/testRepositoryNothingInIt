package handlers;

import gui.MainFrame;

import javax.swing.*;

/**
 * Created on 16.02.2017.
 * At 20:48.
 * Today is четверг
 */
public class GuiHandler {
    public static JFrame mainFrame;

    public static void init(){
        mainFrame = new MainFrame("test");
    }
}
