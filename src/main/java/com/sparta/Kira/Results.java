package com.sparta.Kira;

public class Results {
    private int runNumber;
    private String algorithm;
    private int[] result1;
    private int[] result2;
    private int[] mergerdresult;

    private long timeTaken;

    public Results(int runNumber, String algorithm, int[] result1, int[] result2, int[] mergerdresult, long timeTaken){
        this.runNumber = runNumber;
        this.algorithm = algorithm;
        this.result1 = result1;
        this.result2 = result2;
        this.mergerdresult = mergerdresult;
        this.timeTaken = timeTaken;
    }

    public int getRunNumber() {
        return runNumber;
    }

    public long getTimeTaken() {
        return timeTaken;
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
