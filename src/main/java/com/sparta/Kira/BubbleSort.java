package com.sparta.Kira;
public class BubbleSort implements Sorter{
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
}
