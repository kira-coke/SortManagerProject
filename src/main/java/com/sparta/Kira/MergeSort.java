package com.sparta.Kira;

import java.util.Arrays;

    public class MergeSort implements Sorter{
        @Override
        public int[] sortArray(int[] arrayToSort) {
            if(arrayToSort.length <= 1){
                return arrayToSort;
            }else{
                int middle = arrayToSort.length/2;
                int[] halfOne = Arrays.copyOfRange(arrayToSort, 0, middle);
                int[] halfTwo = Arrays.copyOfRange(arrayToSort, middle, arrayToSort.length);
                halfOne = sortArray(halfOne);
                halfTwo = sortArray(halfTwo);
                int[] newArray = new int[halfOne.length + halfTwo.length];
                int pos1 = 0;//lowest position of half 1 , and half 2
                int pos2 = 0;
                for(int pos = 0;pos< arrayToSort.length; pos++){
                    if(pos1 >= halfOne.length){//no more values to add from halfOne
                        newArray[pos] = halfTwo[pos2];
                        pos2++;
                        continue;
                    }
                    if(pos2 >= halfTwo.length){//no more values to add from halfTwo
                        newArray[pos] = halfOne[pos1];
                        pos1++;
                        continue;
                    }
                    if(halfOne[pos1] < halfTwo[pos2]){
                        newArray[pos] = halfOne[pos1];
                        pos1++;
                    }else{
                        newArray[pos] = halfTwo[pos2];
                        pos2++;
                    }
                }
                return newArray;
            }
        }

        @Override
        public int[] mergeArray(int[] array1, int[] array2) {
            int[] newTemp = new int[array1.length + array2.length];
            System.arraycopy(array1, 0, newTemp, 0, array1.length);
            System.arraycopy(array2, 0, newTemp, array1.length, array2.length);
            return sortArray(newTemp);
        }
    }

