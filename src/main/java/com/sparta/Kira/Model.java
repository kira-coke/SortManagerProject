package com.sparta.Kira;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Model {
    private int[] arrayObj;
    private ArrayList<int[]> objList;
    public Model(){
        objList = new ArrayList<>();
    }

    public void add(int x){
        objList.add(randomArray(x));
    }
    private int[] randomArray(int x){
        Random rd = new Random();
        int[] tempArray = new int[x];
        for(int i = 0; i<x; i++){
            //populate array
            tempArray[i] = rd.nextInt(100);
            //  System.out.print(tempArray[i] + ", ");//output random array
        }
        return tempArray;
    }

    public int[] getArrayObj(){return Arrays.copyOf(this.arrayObj, this.arrayObj.length);}

    public int[] getItem(int x){return Arrays.copyOf(objList.get(x), objList.get(x).length);}
}
