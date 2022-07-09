package com.sparta.Kira;

public class Results {
    private int runNumber;
    private String algorithm;
    private int[] result1;
    private int[] result2;
    private int[] mergerdresult;

    public Results(int runNumber, String algorithm, int[] result1, int[] result2, int[] mergerdresult){
        this.runNumber = runNumber;
        this.algorithm = algorithm;
        this.result1 = result1;
        this.result2 = result2;
        this.mergerdresult = mergerdresult;
    }

    public int getRunNumber() {
        return runNumber;
    }


    public String getAlgorithm() {
        return algorithm;
    }

    public int[] getResult1() {
        return result1;
    }


    public int[] getResult2() {
        return result2;
    }

    public int[] getMergerdresult() {
        return mergerdresult;
    }


}
