/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex4try_catch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Phuong
 */
public class XDate {
    public static Date parse(String text) throws  ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.parse(text);
    }
    public static  Date parse(String text, String patten) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(patten);
        return sdf.parse(text);
    }
}
