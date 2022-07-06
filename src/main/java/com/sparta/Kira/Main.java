package com.sparta.Kira;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input which algorithm you would like to use:");// TODO add which options there are for clarity
        System.out.println("Bubble sort, Insertion sort, Merge sort ");// TODO add rest of options
        String temp = sc.nextLine();
        String algorithm = temp.toLowerCase();//users decision
        System.out.println("Input how long you would like the first array to be");
        int arrayLength = sc.nextInt();
        int[] randomArray = createArray(arrayLength);//create random array of size given
        System.out.println("\nFor the second array, how long would you like it to be?");
        int array2Length = sc.nextInt();
        int[] randomArray2 = createArray(array2Length);
        System.out.println("Unsorted array one: " + Arrays.toString(randomArray));
        System.out.println("Unsorted array two: " + Arrays.toString(randomArray2));
        switch(algorithm){
            case("bubble sort"):
                Sorter bubbleSort= new BubbleSort();
                int[] sortedArray = bubbleSort.sortArray(randomArray);
                System.out.println("\nBubble sort will be used");//output which algorithm
                System.out.println("Sorted array one: "+ Arrays.toString(sortedArray));//output sorted array
                int[] sortedArray2 = bubbleSort.sortArray(randomArray2);
                System.out.println("Sorted array two: " + Arrays.toString(sortedArray2));
                int[] mergedArray = bubbleSort.mergeArray(randomArray, randomArray2);
                System.out.println("Merged sorted array of both: " + Arrays.toString(mergedArray));
                break;
            case("insertion sort"):
                Sorter insertionSort = new InsertionSort();
                int[] sortedArray3 = insertionSort.sortArray(randomArray);
                System.out.println("\nInsertion sort will be used\n");
                System.out.println("Sorted array one: "+ Arrays.toString(sortedArray3));
                int [] sortedArray4 = insertionSort.sortArray(randomArray2);
                System.out.println("Sorted array two: " + Arrays.toString(sortedArray4));
                int[] mergedArray2 = insertionSort.mergeArray(sortedArray3, sortedArray4);
                System.out.println("Merged sorted array of both: " + Arrays.toString(mergedArray2));
                break;
            case("merge sort"):
               Sorter mergeSort = new MergeSort();
                int[] sortedArray5 = mergeSort.sortArray(randomArray);
                System.out.println("\nMerge sort will be used\n");
                System.out.println("Sorted array one: " +Arrays.toString(sortedArray5));
                int[] sortedArray6 = mergeSort.sortArray(randomArray2);
                System.out.println("Sorted array two: " + Arrays.toString(sortedArray6));
                int[] mergedArray3 = mergeSort.mergeArray(sortedArray5, sortedArray6);
                System.out.println("Merged sorted array of both: " + Arrays.toString(mergedArray3));
                break;
        }

        //TODO output time taken
    }

    public static int[] createArray(int x){
        Random rd = new Random();
        int[] tempArray = new int[x];
        for(int i = 0; i<x; i++){
            //populate array
            tempArray[i] = rd.nextInt(100);
          //  System.out.print(tempArray[i] + ", ");//output random array
        }
        return tempArray;
    }
}

/*
- The code should include a basic factory pattern to determine which sorter to use.
- Make sure packages are created properly and the structure follows the MVC pattern.
 - ```start``` - Factory pattern for sorters, loader for run logic and Java ```main``` method.*/


