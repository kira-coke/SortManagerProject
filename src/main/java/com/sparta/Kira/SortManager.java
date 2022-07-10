package com.sparta.Kira;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
public class SortManager {
    private static Logger logger = LogManager.getLogger("My logger");
    private ArrayList<Results> results = new ArrayList<>();
    private Model model;
    private DisplayManager view;
    public SortManager(Model model, DisplayManager view){
        this.model = model;
        this.view = view;
    }


    public void run() throws Exception {
        view.prompt("Input which algorithm you would like to use:");// TODO custom exceptions for invalid String
        view.prompt("Bubble sort, Insertion sort, Merge sort or Tree sort.");// TODO add rest of options
        String algorithm = view.getInputString();
        if((algorithm.equals("bubble sort") == false) && (algorithm.equals("insertion sort") == false)
            && (algorithm.equals("merge sort") == false) && (algorithm.equals("tree sort") == false)) {
            view.prompt("Please input one of the valid algorithms (Perhaps check your spelling)");
            logger.error("Invalid algorithm inputted");
            throw new Exception();
        }
        view.prompt("Input a number between 1 and 100 for your desired array length");
        int arrayLength = view.getInputInt();
        if(arrayLength <1 || arrayLength>100) {
            view.prompt("Please input a valid number");
            logger.error("Invalid int given");
            throw new ArithmeticException();
        }
        model.add(arrayLength);//create random array of size given
        int[] randomArray = model.getItem(0);
        view.prompt("For the second array, how long would you like it to be?");
        int array2Length = view.getInputInt();
        if(array2Length <1 || array2Length>100) {
            view.prompt("Please input a valid number");
            logger.error("Invalid int given");
            throw new ArithmeticException();
        }
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
        try{
            sortedArray = sorter.sortArray(randomArray);
            sortedArray2 = sorter.sortArray(randomArray2);
            mergedArray = sorter.mergeArray(randomArray, randomArray2);
        }catch(NullPointerException e){
            logger.error("No algorithm was inputed", e.getMessage());
            throw new NullPointerException();
        }
        long endTime = System.nanoTime();
        view.prompt("Sorted array one: "+ Arrays.toString(sortedArray));//output sorted array
        long timeTaken = endTime-startTime;
        view.prompt("Sorted array two: " + Arrays.toString(sortedArray2));
        view.prompt("Merged sorted array of both: " + Arrays.toString(mergedArray));
        results.add(new Results(1, algorithm, sortedArray, sortedArray2, mergedArray));
        view.prompt("This algorithm took " + timeTaken + " nano seconds.");
        view.prompt("Would you like to use another algorithm and compare run times? Y/N\n");
        String answer = view.getInputString();
        switch(answer){
            case("y"):
                view.prompt("Which algorithm would you like to use?");
                String algo = view.getInputString();
                if((algo.equals("bubble sort") == false) && (algo.equals("insertion sort") == false)
                        && (algo.equals("merge sort") == false) && (algo.equals("tree sort") == false)) {
                    view.prompt("Please input one of the valid algorithms (Perhaps check your spelling)");
                    logger.error("Invalid algorithm inputted");
                    throw new Exception();
                }
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
                results.add(new Results(2, algo, sorter2.sortArray(randomArray), sorter2.sortArray(randomArray2),
                        sorter2.mergeArray(randomArray, randomArray2)));
                long eTime = System.nanoTime();
                long time = eTime-sTime;
                view.prompt("This algorithm took " + time + " nano seconds.");
            case("n"):
                view.prompt("Thank you for using the sort manager.");
                System.exit(0);

        }


        //TODO output time taken
    }
}
