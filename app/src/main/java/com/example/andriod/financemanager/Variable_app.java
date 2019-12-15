package com.example.andriod.financemanager;

import android.app.Application;
import android.util.Log;

public class Variable_app extends Application {
    private static String name=" ";
    private static int date =1;
    private static float total_money=1000;
    private static float money_spent=0;
    private static boolean gender=true;

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        Variable_app.name = name;
    }
    public  int getDate() {
        return date;
    }

    public  void setDate(int date) {
        Variable_app.date = date;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender1) {
        gender = gender1;
    }

    public float getMoney_spent() {
        return money_spent;
    }

    public void setMoney_spent(float money_spent1) {
        money_spent = money_spent1+money_spent;
        Log.e("Money spent",String.valueOf(getMoney_spent()));
    }

    public float getTotal_money() {
        return total_money;
    }

    public void setTotal_money(float total_money1) {
        total_money = total_money1;
    }


}