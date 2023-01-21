package com;

import com.windows.constans.WindowBackgroundImageConstants;
import com.windows.constans.WindowTypeConstants;
import com.windows.eventsList.EventsWindow;
import com.windows.login.LoginWindow;

import javax.swing.*;

public class Main {

    private static JFrame frame; // ContentPane is changing but frame stays the same
    private static WindowParent window;

    public static void main(String[] args) {

        frame = new JFrame("Soccer Game Tournament - Desktop Version");
        frame.setSize(1200,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        window = new LoginWindow(WindowBackgroundImageConstants.LOGIN_WINDOW, frame);

    }

    public static void changeContentPane(int windowType){
        switch (windowType){

            case WindowTypeConstants.LOGIN_WINDOW -> window = new LoginWindow(
                    WindowBackgroundImageConstants.LOGIN_WINDOW, frame);

            case WindowTypeConstants.EVENTS_WINDOW -> window = new EventsWindow(
                    WindowBackgroundImageConstants.EVENTS_WINDOW, frame);


        }
    }

}
