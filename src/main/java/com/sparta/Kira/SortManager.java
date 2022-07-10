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
        view.prompt("Bubble sort, Insertion sort, Merge sort or Tree sort.");// TODO add rest of options
        String algorithm = view.getInputString();
        view.prompt("Input a number between 1 and 100 for your desired array length");
        int arrayLength = view.getInputInt(); //TODO custom excpetion for invalid input (not int) & if array is biiger thgan 100
        model.add(arrayLength);//create random array of size given
        int[] randomArray = new int[]{5, 20, 58, 47, 21};
        //int[] randomArray = model.getItem(0);
        view.prompt("For the second array, how long would you like it to be?");
        int array2Length = view.getInputInt();;
        model.add(array2Length);
        int[] randomArray2 = model.getItem(1);
        view.prompt("Unsorted array one: " + Arrays.toString(randomArray));
        view.prompt("Unsorted array two: " + Arrays.toString(randomArray2));
        int[] sortedArray = null;
        int[] sortedArray2 = null;
        int[] mergedArray = null;
        Sorter sorter = null;
        Sorter sorter2 = null;
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
        view.prompt("\n"+ algorithm + "sort will be used");//output which algorithm
        long startTime = System.nanoTime();
        sortedArray = sorter.sortArray(randomArray);
        long endTime = System.nanoTime();
        view.prompt("Sorted array one: "+ Arrays.toString(sortedArray));//output sorted array
        long timeTaken = endTime-startTime;
        sortedArray2 = sorter.sortArray(randomArray2);
        view.prompt("Sorted array two: " + Arrays.toString(sortedArray2));
        mergedArray = sorter.mergeArray(randomArray, randomArray2);
        view.prompt("Merged sorted array of both: " + Arrays.toString(mergedArray));
        results.add(new Results(1, algorithm, sortedArray, sortedArray2, mergedArray, timeTaken));
        view.prompt("This algorithm took " + timeTaken + " nano seconds.");
        view.prompt("Would you like to use another algorithm and compare run times? Y/N\n");
        String answer = view.getInputString();
        switch(answer){
            case("y"):
                view.prompt("Which algorithm would you like to use?");
                String algo = view.getInputString();
                switch(algo){
                    case("bubble sort"):
                        sorter2 = new BubbleSort();
                        break;
                    case("insertion sort"):
                        sorter2 = new InsertionSort();
                        break;
                    case("merge sort"):
                        sorter2 = new MergeSort();
                        break;
                    case("tree sort"):
                        sorter2 = new TreeSort();
                        break;
                }
                long sTime = System.nanoTime();
                long eTime = System.nanoTime();
                long time = eTime-sTime;
                results.add(new Results(2, algo, sorter2.sortArray(randomArray), sorter2.sortArray(randomArray2), sorter2.mergeArray(randomArray, randomArray2), time));
                view.prompt("This algorithm took " + time + " nano seconds.");
            case("n"):
                view.prompt("Thank you for using the sort manager.");
                System.exit(0);

        }


        //TODO output time taken
    }
}
