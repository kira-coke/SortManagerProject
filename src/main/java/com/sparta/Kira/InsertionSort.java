package com.sparta.Kira;

public class InsertionSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        for(int i = 1; i <arrayToSort.length; i++){
            int x = arrayToSort.length-1;
            int j = i-1;
            int key = arrayToSort[i];// key keeps track of current value you are comparing to
            while(x>=0 && arrayToSort[j] > key){
                arrayToSort[j + 1] = arrayToSort[j];
                j = j -1;
            }
            arrayToSort[j+1] = key;

        }
        return new int[0];
    }

    @Override
    public int[] mergeArray(int[] array1, int[] array2) {
        return new int[0];
    }
}
