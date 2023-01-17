package com.login;

import javax.swing.*;
import java.awt.*;

public class LoginWindow {

    private JPanel loginMainPanel;
    private JPanel loginComponentHolder;

    JFrame loginMainFrame;

    public LoginWindow(){

        loginMainFrame = new JFrame("Soccer Game Tournament - Desktop Version");

        setComponents();

        setBackgroundImage();
        loginMainFrame.setContentPane(loginMainPanel);
        loginMainFrame.pack();
        loginMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginMainFrame.setResizable(false);
        loginMainFrame.setVisible(true);

    }

    private void setBackgroundImage(){

        loginMainPanel = new JPanelWithBackgroundImage();
        loginMainPanel.setMinimumSize(new Dimension(1200,600));
        loginMainPanel.setMaximumSize(new Dimension(1200,600));
        loginMainPanel.setPreferredSize(new Dimension(1200,600));

        loginMainPanel.add(loginComponentHolder);

    }

    private void setComponents(){

        loginComponentHolder = new JPanel();
        loginComponentHolder.setLayout(null);
        loginComponentHolder.setMinimumSize(new Dimension(1200,600));
        loginComponentHolder.setMaximumSize(new Dimension(1200,600));
        loginComponentHolder.setPreferredSize(new Dimension(1200,600));
        loginComponentHolder.setOpaque(false);


    }

}