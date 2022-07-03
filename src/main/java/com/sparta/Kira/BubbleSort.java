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

    @Override
    public int[] mergeArray(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0; //position of new array
        //compare first values of both arrays
        //whichever is smallest, put in first position of new array
        // whichever array it came from, u incremenet that one by 1 place
        while(i<array1.length && j<array2.length){
            if(array1[i] == array2[j]){ // if they both are equal, doenst matter in which order
                merged[k] = array1[i];
                merged[k++] = array2[j];
                j++;
                i++;
                k++; //TODO test case for if they have equal values
            }
            if(array1[i] > array2[j]){
                merged[k] = array2[j];
                j++;
            }else{
                merged[k] = array1[i];
                i++;
            }
            k++;
        }
        while(i<array1.length){
            //if there are remaining values in array 1
            merged[k] = array1[i];
            k++;
            i++;
        }
        while(j<array2.length){
            //if array 2 has remaining values
            merged[k] = array2[j];
            k++;
            j++;
        }
        return merged;
    }
}
















