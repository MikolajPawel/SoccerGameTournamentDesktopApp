package com.login;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class JPanelWithBackgroundImage extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        try{
            Image image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(
                    "background_images/loginWindowBackground.png"));
            g.drawImage(image,0,0,null);
        }catch (Exception ignored) {}

    }

}
