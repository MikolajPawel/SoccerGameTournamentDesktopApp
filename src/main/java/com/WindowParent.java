package com;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class WindowParent {

    protected JPanel mainPanel; // <- Background image container 1200x600
    protected JPanel allComponentsHolder;

    protected String backgroundImagePath;
    protected JFrame frame;

    public WindowParent(String backgroundImagePath, JFrame frame){

        this.backgroundImagePath = backgroundImagePath;
        this.frame = frame;

        initWindow();

    }

    protected void initWindow(){

        allComponentsHolder = new JPanel();
        allComponentsHolder.setLayout(null);
        allComponentsHolder.setMinimumSize(new Dimension(1200,600));
        allComponentsHolder.setMaximumSize(new Dimension(1200,600));
        allComponentsHolder.setPreferredSize(new Dimension(1200,600));
        allComponentsHolder.setOpaque(false); // thanks to setOpaque(false) we can see background image

        setComponents();
        setBackgroundImage();
        setListeners();

        frame.setContentPane(mainPanel);
        frame.pack();

    }

    private void setBackgroundImage(){
        class JPanelWithBackgroundImage extends JPanel {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                try{
                    Image image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(
                            backgroundImagePath));
                    g.drawImage(image,0,0,null);
                }catch (Exception ignored) {}

            }

        }

        mainPanel = new JPanelWithBackgroundImage();
        mainPanel.setMinimumSize(new Dimension(1200,600));
        mainPanel.setMaximumSize(new Dimension(1200,600));
        mainPanel.setPreferredSize(new Dimension(1200,600));

        mainPanel.add(allComponentsHolder);
    }

    protected void setComponents(){
        //method to @Overwrite
    }

    protected void setListeners(){
        //method to @Overwrite
    }

}
