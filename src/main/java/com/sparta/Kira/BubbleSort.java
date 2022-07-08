package com.sparta.Kira;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class BubbleSort implements Sorter{

    public static Logger logger = LogManager.getLogger(Sorter.class);
    @Override
    public int[] sortArray(int[] arrayToSort) {
        if(arrayToSort.length == 0){
            System.out.println("Input a valid array of min length 1");
            return null;
        }
        int x = arrayToSort.length;
        for(int j = 0; j<x-1;j++){
            for(int k = 0; k<x-1;k++){
                //take current value, compare with next value
                //if current is bigger, than swap them
                if(arrayToSort[k]>arrayToSort[k+1]){
                    int temp = arrayToSort[k+1];
                    arrayToSort[k+1] = arrayToSort[k];
                    arrayToSort[k] = temp;
                }
            }
        }
        return arrayToSort;
    }

    @Override
    public int[] mergeArray(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        int[] sorted = sortArray(merged);
        return sorted;
    }
}
















