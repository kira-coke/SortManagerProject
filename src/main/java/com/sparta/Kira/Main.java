package com.sparta.Kira;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input which algorithm you would like to use");// TODO add which options there are for clarity
        String temp = sc.nextLine();
        String algorithm = temp.toLowerCase();//users decision
        System.out.println("Input how long you would like the array to be");
        int arrayLength = sc.nextInt();
        int[] randomArray = createArray(arrayLength);//create random array of size given
        switch(algorithm){
            case("bubble sort"):
                int[] sortedArray = sorter.sortArray(randomArray);
                System.out.println("\nBubble sort will be used");//output which algorithm
                System.out.println(Arrays.toString(sortedArray));//output sorted array
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
            System.out.print(tempArray[i] + ", ");//output random array
        }
        return tempArray;
    }
}