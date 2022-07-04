package com.sparta.Kira;

public class ReverseNumber {
    public int reverseNumber(int x){
        String temp = Integer.toString(x);
        StringBuilder reversed = new StringBuilder();
        for(int i = temp.length()-1; i>= 0; i--){
            reversed.append(temp.charAt(i));
        }
        return Integer.parseInt(reversed.toString());
    }

}
