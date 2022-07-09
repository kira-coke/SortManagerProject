package com.sparta.Kira;
import java.util.ArrayList;
import java.util.Arrays;

//controller class
//``sorters``` - The sort algorithms with Sorter interface for the Factory pattern.
//handles request flow, never handles data logic
public class SortManager {
    private ArrayList<Results> results = new ArrayList<>();
    private Model model;
    private DisplayManager view;
    public SortManager(Model model, DisplayManager view){
        this.model = model;
        this.view = view;
    }

    public void run(){
        view.prompt("Input which algorithm you would like to use:");// TODO custom exceptions for invalid String
        view.prompt("Bubble sort, Insertion sort, Merge sort ");// TODO add rest of options
        String algorithm = view.getInputString();
        view.prompt("Input a number between 1 and 100 for your desired array length");
        int arrayLength = view.getInputInt(); //TODO custom excpetion for invalid input (not int) & if array is biiger thgan 100
        model.add(arrayLength);//create random array of size given
        int[] randomArray = model.getItem(0);
        view.prompt("\nFor the second array, how long would you like it to be?");
        int array2Length = view.getInputInt();;
        model.add(array2Length);
        int[] randomArray2 = model.getItem(1);
        view.prompt("Unsorted array one: " + Arrays.toString(randomArray));
        view.prompt("Unsorted array two: " + Arrays.toString(randomArray2));
        int[] sortedArray = null;
        int[] sortedArray2 = null;
        int[] mergedArray = null;
        Sorter sorter = null;
        switch(algorithm){
            case("bubble sort"):
                sorter = new BubbleSort();
                break;
            case("insertion sort"):
                sorter = new InsertionSort();
                break;
            case("merge sort"):
                sorter = new MergeSort();
                break;
            case("tree sort"):
                sorter = new TreeSort();
                break;
        }
        sortedArray = sorter.sortArray(randomArray);
        view.prompt("\n"+ algorithm + "sort will be used");//output which algorithm
        view.prompt("Sorted array one: "+ Arrays.toString(sortedArray));//output sorted array
        sortedArray2 = sorter.sortArray(randomArray2);
        view.prompt("Sorted array two: " + Arrays.toString(sortedArray2));
        mergedArray = sorter.mergeArray(randomArray, randomArray2);
        view.prompt("Merged sorted array of both: " + Arrays.toString(mergedArray));
        results.add(new Results(1, algorithm, sortedArray, sortedArray2, mergedArray));
        //TODO output time taken
    }
}
