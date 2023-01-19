package com.login;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class LoginWindow {

    private JPanel mainPanel; // <- Background image container 1200x600

    private JPanel allComponentsHolder;
    private JLabel loginLabel;
    private JTextField loginTextField;
    private JLabel passwordLabel;
    private JTextField passwordTextField;
    private JButton tryToLoginButton;
    private JButton remoteAccessButton;

    JFrame loginMainFrame;

    public LoginWindow(){

        loginMainFrame = new JFrame("Soccer Game Tournament - Desktop Version");

        setComponents();

        loginMainFrame.setContentPane(mainPanel);
        loginMainFrame.pack();
        loginMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginMainFrame.setResizable(false);
        loginMainFrame.setVisible(true);

    }

    private void setComponents(){

        allComponentsHolder = new JPanel();
        allComponentsHolder.setLayout(null);
        allComponentsHolder.setMinimumSize(new Dimension(1200,600));
        allComponentsHolder.setMaximumSize(new Dimension(1200,600));
        allComponentsHolder.setPreferredSize(new Dimension(1200,600));
        allComponentsHolder.setOpaque(false); // thanks to setOpaque(false) we can see background image

        int startPointPositionX = 490;
        int startPointPositionY = 200;

        loginLabel = new JLabel();
        loginLabel.setText("Login:");
        loginLabel.setForeground(new Color(255,255,255));
        loginLabel.setBounds(startPointPositionX+15,startPointPositionY,70,25);
        allComponentsHolder.add(loginLabel);

        loginTextField = new JTextField();
        loginTextField.setBounds(startPointPositionX+85,startPointPositionY,150,25);
        allComponentsHolder.add(loginTextField);

        passwordLabel = new JLabel();
        passwordLabel.setText("Password:");
        passwordLabel.setForeground(new Color(255,255,255));
        passwordLabel.setBounds(startPointPositionX+15,startPointPositionY+40,70,25);
        allComponentsHolder.add(passwordLabel);

        passwordTextField = new JTextField();
        passwordTextField.setBounds(startPointPositionX+85,startPointPositionY+40,150,25);
        allComponentsHolder.add(passwordTextField);

        tryToLoginButton = new JButton();
        tryToLoginButton.setFont(new Font("Arial",Font.PLAIN,15));
        tryToLoginButton.setText("LOG IN");
        tryToLoginButton.setForeground(new Color(0,255,255));
        tryToLoginButton.setBackground(new Color(80,80,80));
        tryToLoginButton.setBounds(startPointPositionX,startPointPositionY+100,250,40);
        allComponentsHolder.add(tryToLoginButton);

        remoteAccessButton = new JButton();
        remoteAccessButton.setFont(new Font("Arial", Font.PLAIN,15));
        remoteAccessButton.setText("Remote Access");
        remoteAccessButton.setForeground(new Color(255 ,255,0));
        remoteAccessButton.setBackground(new Color(80,80,80));
        remoteAccessButton.setBounds(startPointPositionX,startPointPositionY+160,250,30);
        allComponentsHolder.add(remoteAccessButton);


        setBackgroundImage();
        setActionListeners();


    }

    private void setBackgroundImage(){

        class JPanelWithBackgroundImage extends JPanel {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                try{
                    Image image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(
                            "background_images/loginWindowBackground.png"));
                    // whole image -> 1200x600; login part -> 350x300 (placed on 425x150)
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

    private void setActionListeners(){

        remoteAccessButton.addActionListener(e -> {

        });


    }

}