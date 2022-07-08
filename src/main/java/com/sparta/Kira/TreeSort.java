package com.sparta.Kira;

public class TreeSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        TreeSort.Tree tree = new TreeSort.Tree(arrayToSort[0]); //creates tree from given array
        for(int num: arrayToSort){
            tree.insert(tree.node, num);
        }
        return new int[0];
    }

    @Override
    public int[] mergeArray(int[] array1, int[] array2) {
        return new int[0];
    }

    public class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
            left = right = null;
        }
    }

    public class Tree{
        Node node;
        Tree(int value){
            node = new Node(value);
        }
        public Node insert(Node node, int value){
            if(node == null){
                return new Node(value);
            }
            if(value < node.value){
                node.left = insert(node.left, value);
            }else if(value > node.value){
                node.right = insert(node.right, value);
            }
            return node;
        }
    }
}
/* Integrate a new class to implement a [tree sort](https://en.wikipedia.org/wiki/Tree_sort), using a [binary search tree](https://en.wikipedia.org/wiki/Binary_search_tree), so that the tree sort can be called in the same way as the other sort algorithms.
- The new class should implement the current ```Sorter interface```.
- Add code that calls the BST and passes in the array that will be used to construct the tree and then return a sorted array.
- Use the Facade design pattern for this step.
- Implement a nested class to represent a node in the tree.*/