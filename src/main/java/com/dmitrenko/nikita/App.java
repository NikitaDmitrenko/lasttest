package com.dmitrenko.nikita;


import java.util.Calendar;
import java.util.ResourceBundle;

public class App {
    public static void main(String[] args) {
        ResourceBundle bundle1 = ResourceBundle.getBundle("MessageResource");
        int hourOfDay = getHourOfDay();
        displayValues(bundle1,hourOfDay);

    }

    public static void displayValues(ResourceBundle bundle,int hourOfDay) {
        if (hourOfDay > 6 && hourOfDay <= 9) {
            System.out.println(bundle.getString("my.morning"));
        } else if (hourOfDay > 9 && hourOfDay <= 19) {
            System.out.println(bundle.getString("my.day"));
        } else if (hourOfDay > 19 && hourOfDay <= 23) {
            System.out.println(bundle.getString("my.evening"));
        } else if (hourOfDay > 23 || hourOfDay <= 6)
            System.out.println(bundle.getString("my.night"));
    }


    public static int getHourOfDay(){
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }
}
