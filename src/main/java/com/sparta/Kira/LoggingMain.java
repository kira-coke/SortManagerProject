package com.sparta.Kira;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingMain {
    public static Logger logger = LogManager.getLogger("My logger");
    public static void main(String[] args){
        logger.atTrace();
    }
}
