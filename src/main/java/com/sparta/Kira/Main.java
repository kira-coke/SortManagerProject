package com.sparta.Kira;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) throws Exception {
        Model model = new Model();
        DisplayManager view = new DisplayManager();

        SortManager sm = new SortManager(model, view);

        sm.run();
    }
}
