package com.eventsPart;

import com.WindowParent;

import javax.swing.*;
import java.awt.*;


public class EventsWindow extends WindowParent {

    public EventsWindow(String backgroundImagePath, JFrame frame) {
        super(backgroundImagePath, frame);
    }

    @Override
    protected void setComponents(){

        allComponentsHolder = new JPanel();
        allComponentsHolder.setLayout(null);
        allComponentsHolder.setMinimumSize(new Dimension(1200,600));
        allComponentsHolder.setMaximumSize(new Dimension(1200,600));
        allComponentsHolder.setPreferredSize(new Dimension(1200,600));
        allComponentsHolder.setOpaque(false); // thanks to setOpaque(false) we can see background image

        int startPointPositionX = 490;
        int startPointPositionY = 200;



    }

    @Override
    protected void setListeners(){

    }

}
