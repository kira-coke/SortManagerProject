package com.sparta.Kira;
//view class

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DisplayManager {
    private static final Logger logger = LogManager.getLogger(Sorter.class);

    public void prompt(String message){
        System.out.println(message);//
    }
    public void error(Exception e){
        System.out.println(e);
    }

    public String getInputString() throws InputMismatchException{

        Scanner sc = new Scanner(System.in);
        String temp = null;
        try{
            temp = sc.nextLine();
        }catch(InputMismatchException e){
                logger.error(e);
        }
        return temp.toLowerCase();//users decision
    }

    public int getInputInt() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
