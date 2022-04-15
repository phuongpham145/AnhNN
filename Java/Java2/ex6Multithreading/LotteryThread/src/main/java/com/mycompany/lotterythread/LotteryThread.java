/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lotterythread;

import java.util.Date;
import java.util.Random;
import javax.swing.JTextField;

/**
 *
 * @author Phuong
 */
public class LotteryThread extends Thread{
    private final JTextField txt;
    public LotteryThread(JTextField txt){
        this.txt = txt;
    }
    @Override
    public void run(){
        Date now = new Date();
        Random rnd = new Random(now.getTime());
        for(int i = 0; i < 1000; i++){
            int num = Math.abs(rnd.nextInt() % 10);
            txt.setText("" + num);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }
        }
    }
}
