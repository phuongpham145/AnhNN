/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.change_color;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Phuong
 */
public class AWTFrame extends Frame implements ActionListener {

    Button btnRed, btnBlue;
    
    private AWTFrame(String title) throws HeadlessException {
        super(title);
        btnRed = new Button("Red");
        btnBlue = new Button("Blue");
        setLayout(new FlowLayout());
        add(btnRed);
        add(btnBlue);
        btnBlue.addActionListener(this);
        btnRed.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("Red")) {
            setBackground(Color.RED);
        } else {
            setBackground(Color.BLUE);
        }
        
    }

    public static void main(String[] args) {
        AWTFrame frame = new AWTFrame("AWT Frame");
        frame.setSize(300, 200);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
    
}
