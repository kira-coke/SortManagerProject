package com.sparta.Kira;

public class InsertionSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        for(int i = 1; i <arrayToSort.length; i++){
            int j = i-1; //keep track of position in array currently
            int key = arrayToSort[i];// key keeps track of current value you are comparing to
            while(j>=0 && arrayToSort[j] > key){//as long as not end of array, and there is still a value in the wrong place (bigger than its left)
                arrayToSort[j + 1] = arrayToSort[j];
                j = j -1;
            }
            arrayToSort[j+1] = key;
        }
        return arrayToSort;
    }

    @Override
    public int[] mergeArray(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        for(int i = 1; i < merged.length; i++){
            int j = i-1; //keep track of position in array currently
            int key = merged[i];// key keeps track of current value you are comparing to
            while(j>=0 && merged[j] > key){//as long as not end of array, and there is still a value in the wrong place (bigger than its left)
                merged[j + 1] = merged[j];
                j = j -1;
            }
            merged[j+1] = key;
        }
        return merged;
    }
}
