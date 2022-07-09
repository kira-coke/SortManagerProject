package com.sparta.Kira;
//controller class
//``sorters``` - The sort algorithms with Sorter interface for the Factory pattern.
//handles request flow, never handles data logic
public class SortManager {

    private Sorter model;
    private DisplayManager view;

    public SortManager(Sorter model, DisplayManager view){
        this.model = model;
        this.view = view;
    }




}
