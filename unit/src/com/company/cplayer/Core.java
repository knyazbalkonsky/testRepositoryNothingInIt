package com.company.cplayer;

import com.company.cplayer.handlers.GuiHandler;

/**
 * Created on 16.02.2017.
 * At 20:38.
 * Today is четверг
 */
public class Core {
    private static void init(){
        GuiHandler.init();
        GuiHandler.mainFrame.setVisible(true);
    }

    public static void main(String[] args){
        init();
    }
}
