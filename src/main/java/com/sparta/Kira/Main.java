package com.sparta.Kira;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input which algorithm you would like to use:");// TODO add which options there are for clarity
        System.out.println("Bubble sort, ");// TODO add rest of options
        String temp = sc.nextLine();
        String algorithm = temp.toLowerCase();//users decision
        System.out.println("Input how long you would like the first array to be");
        int arrayLength = sc.nextInt();
        int[] randomArray = createArray(arrayLength);//create random array of size given
        System.out.println("\nFor the second array, how long would you like it to be?");
        int array2Length = sc.nextInt();
        int[] randomArray2 = createArray(array2Length);
        switch(algorithm){
            case("bubble sort"):
                int[] sortedArray = sorter.sortArray(randomArray);
                System.out.println("\nBubble sort will be used");//output which algorithm
                System.out.println("Sorted array one: "+ Arrays.toString(sortedArray));//output sorted array
                int[] sortedArray2 = sorter.sortArray(randomArray2);
                System.out.println("Sorted array two: " + Arrays.toString(sortedArray2));
                int[] mergedArray = sorter.mergeArray(randomArray, randomArray2);
                System.out.println("Merged sorted array of both: " + Arrays.toString(mergedArray));
                break;
        }

        //TODO output time taken
    }

    public static int[] createArray(int x){
        Random rd = new Random();
        int[] tempArray = new int[x];
        System.out.print("Original array: ");
        for(int i = 0; i<x; i++){
            //populate array
            tempArray[i] = rd.nextInt(100);
            System.out.print(tempArray[i] + ", ");//output random array
        }
        return tempArray;
    }
}

