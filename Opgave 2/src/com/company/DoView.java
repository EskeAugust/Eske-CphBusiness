package com.company;

public class DoView {
    private static double result;
    private String typeOfResult;

    public DoView(double result, String typeOfResult) {
        this.result = result;
        this.typeOfResult = typeOfResult;
    }

    public static void doView(double result, String typeOfResult){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,ComputeVATBetterStyleOO.CURRENCY,ComputeVATBetterStyleOO.MSG);
    }
}
