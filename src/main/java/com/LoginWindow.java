package com;

import javax.swing.*;

public class LoginWindow {


    private JPanel mainPanel;
    private JLabel mainLabel;

    JFrame mainFrame = new JFrame("Soccer Game Tournament Desktop");

    public LoginWindow(){

        setBackgroundImage();

        mainFrame.setContentPane(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();

        mainFrame.setVisible(true);



    }

    private void setBackgroundImage(){
        try{
            mainLabel.setIcon(new ImageIcon(this.getClass().getResource(
                    "/background_images/loginWindowBackground.png")));
        }catch(Exception ignored){}
    }

}

