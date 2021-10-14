package com.company;

public class View {
    private static double result;
    private static String typeOfResult;
    private static String CURRENCY;
    View(double result, String typeOfResults, String CURRENCY){
        this.result = result;
        this.typeOfResult = typeOfResults;
        this.CURRENCY = CURRENCY;
    }
    public static void doView(){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,CURRENCY,typeOfResult);
    }
}
