package com.sparta.Kira;

import java.util.ArrayList;

public class TreeSort implements Sorter {
    public int arrayLength = 0;

    Node root;

    Node current;
    void TreeSort(){
        root = null;
    }

    void treeInsert(int[] arr, int index){
        /*if(index < arr.length){
            if(root == null){
                root = new Node(arr[index]);
                current = root;
                //treeInsert(arr, index+1);
            }else{
                if(arr[index] < current.value) {
                    current.left = new Node(arr[index]);
                    current = current.left;
                    treeInsert(arr, index+1);
                }else {
                    current.right = new Node(arr[index]);
                    current = current.right;
                    treeInsert(arr, index+1);
                }
            }
        }*/
        for ( int i = 0; i < arr.length; i++){
            if (this.root == null ){
                this.root = addTreeNode(this.root, arr[i]);
            }
            else
            {
                addTreeNode(this.root, arr[i]);
            }
        }
    }
    Node addTreeNode(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        } else {
            if (value < node.value) {
                if (node.left == null) {
                    node.left = new Node(value);
                    return node.left;
                } else {
                    return addTreeNode(node.left, value);
                }
            } else {
                if (node.right == null) {
                    node.right = new Node(value);
                    return node.right;
                } else {
                    return addTreeNode(node.right, value);
                }
            }
        }
    }


    @Override
    public int[] sortArray(int[] arrayToSort) {
        arrayLength = arrayToSort.length;
        //TreeSort tree = new TreeSort(); //creates tree from given array
        root = null;
        this.treeInsert(arrayToSort, 0);
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        sort(this.root, sorted);
        //https://stackoverflow.com/questions/718554/how-to-convert-an-arraylist-containing-integers-to-primitive-int-array
        int[] finished = sorted.stream().mapToInt(i -> i).toArray();
        return finished;
    }

    public void sort(Node node, ArrayList<Integer> arr) {
        //int[] temp = new int[8]; //TODO change to array length
        if (node != null) {
            if (node.left != null) {
                sort(node.left, arr);
                arr.add(node.value);
                sort(node.right, arr);
            } else{
                if (node.right != null) {
                    arr.add(node.value);
                    sort(node.right, arr);
                } else {
                    arr.add(node.value);
                }
            }
        }
    }

    @Override
    public int[] mergeArray(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        return sortArray(merged);
    }

    Node getCurrentNode(){
        return current;
    }

    public class Node{
        int value;
        Node left;
        Node right;
        public Node(int item){
            value = item;
            left = right = null;
        }
    }


}
/* Integrate a new class to implement a [tree sort](https://en.wikipedia.org/wiki/Tree_sort), using a [binary search tree](https://en.wikipedia.org/wiki/Binary_search_tree), so that the tree sort can be called in the same way as the other sort algorithms.
- Add code that calls the BST and passes in the array that will be used to construct the tree and then return a sorted array.
- Use the Facade design pattern for this step.
- Implement a nested class to represent a node in the tree.*/