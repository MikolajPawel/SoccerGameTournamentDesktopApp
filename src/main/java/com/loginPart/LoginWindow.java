package com.loginPart;

import com.Main;
import com.WindowParent;
import com.constans.WindowTypeConstants;

import javax.swing.*;
import java.awt.*;

public class LoginWindow extends WindowParent {

    private JLabel loginLabel;
    private JTextField loginTextField;
    private JLabel passwordLabel;
    private JTextField passwordTextField;
    private JButton tryToLoginButton;
    private JButton remoteAccessButton;

    public LoginWindow(String backgroundImagePath, JFrame frame) {
        super(backgroundImagePath, frame);
    }

    @Override
    protected void setComponents(){

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


    }

    @Override
    protected void setListeners(){

        remoteAccessButton.addActionListener(e -> Main.changeContentPane(WindowTypeConstants.EVENTS_WINDOW));

    }

}