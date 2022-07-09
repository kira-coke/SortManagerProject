package com.sparta.Kira;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        DisplayManager view = new DisplayManager();

        SortManager sm = new SortManager(model, view);

        sm.run();
    }
}
