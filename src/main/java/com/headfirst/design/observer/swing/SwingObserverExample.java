package com.headfirst.design.observer.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author LiuCan
 * @date 2020/12/20 9:16
 * @description SwingObserverExample
 */
public class SwingObserverExample {

    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    /**
     * @author LiuCan
     * @date 2020/12/20 9:21
     * @param
     * @return void
     */
    public void go() {

        jFrame = new JFrame();

        JButton button = new JButton("Should I do it ?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        jFrame.getContentPane().add(BorderLayout.CENTER, button);
    }

    class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("Don`t do it , you might regret it !");
        }
    }

    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("Come on , do it !");
        }
    }
}

