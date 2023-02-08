package com.windows.eventsList;

import com.WindowParent;

import javax.swing.*;
import java.awt.*;


public class EventsWindow extends WindowParent {

    private JButton addEventButton;
    private JPanel eventsPanel;
    private JScrollPane eventsScrollPane;
    private JButton[] singleEvent;

    public EventsWindow(String backgroundImagePath, JFrame frame) {
        super(backgroundImagePath, frame);
    }


    @Override
    protected void setComponents(){

        loadEvents();

        int startPositionEventsListX = 90;
        int startPositionEventsListY = 70;

        addEventButton = new JButton();
        addEventButton.setHorizontalAlignment(JButton.LEFT);
        addEventButton.setHorizontalTextPosition(JButton.LEFT);
        addEventButton.setAlignmentX(JButton.LEFT);
        addEventButton.setOpaque(false); // transparent button
        addEventButton.setContentAreaFilled(false); // transparent button
        addEventButton.setBorderPainted(false); // transparent button
        addEventButton.setFont(new Font("Arial",Font.BOLD,25));
        addEventButton.setForeground(new Color(255,255,255));
        addEventButton.setText("+ Add new event");
        addEventButton.setBounds(startPositionEventsListX,startPositionEventsListY,400,22);
        allComponentsHolder.add(addEventButton);

        eventsPanel = new JPanel();
        eventsPanel.setLayout(null);
        eventsPanel.setOpaque(false);
        eventsPanel.setBounds(0, 0, 600, 610);

        eventsPanel.setBorder(null);

        singleEvent = new JButton[20];
        for(int i=0;i<20;i++){
            singleEvent[i] = new JButton();
            singleEvent[i].setBounds(0, 20+(i*40), 580, 20);
            singleEvent[i].setHorizontalAlignment(JButton.LEFT);
            singleEvent[i].setHorizontalTextPosition(JButton.LEFT);
            singleEvent[i].setAlignmentX(JButton.LEFT);
            singleEvent[i].setOpaque(false);
            singleEvent[i].setContentAreaFilled(false);
            singleEvent[i].setBorderPainted(false);
            singleEvent[i].setForeground(new Color(255,255,255));
            singleEvent[i].setFont(new Font("Arial",Font.BOLD,23));
            singleEvent[i].setText("12.01.2023 | FIFA | Hearts Pub | Bartek Cieplik");
            eventsPanel.add(singleEvent[i]);
        }

        eventsPanel.setMinimumSize(new Dimension(600, 810));
        eventsPanel.setPreferredSize(new Dimension(600, 810));

        eventsScrollPane = new JScrollPane(eventsPanel);
        eventsScrollPane.setBounds(startPositionEventsListX, startPositionEventsListY+20, 600, 430);
        eventsScrollPane.setOpaque(false);
        eventsScrollPane.getViewport().setOpaque(false);
        eventsScrollPane.setBorder(null);
        eventsScrollPane.getViewport().setBorder(null);
        eventsScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        eventsScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        eventsScrollPane.setMinimumSize(new Dimension(600, 430));
        eventsScrollPane.setPreferredSize(new Dimension(600, 430));
        eventsScrollPane.getViewport().setMinimumSize(new Dimension(600, 430));
        eventsScrollPane.getViewport().setPreferredSize(new Dimension(600, 430));
        allComponentsHolder.add(eventsScrollPane);

















    }

    @Override
    protected void setListeners(){

        addEventButton.addActionListener(e -> {
            System.out.println("+");
        });

    }

    private void loadEvents(){

    }


}
