package com.sparta.Kira;
//view class

import java.util.Scanner;

//```display``` - Classes that deal with printing to the console window.
//handles data presentation, dynamitcally rendered
public class DisplayManager {


    public void prompt(String message){
        System.out.println(message);//
    }
    public void error(Exception e){
        System.out.println(e);
    }

    public String getInputString(){
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        return temp.toLowerCase();//users decision
    }

    public int getInputInt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
