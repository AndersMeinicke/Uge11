package com.company;

public class CalculateVat {

    private static double number;
    private static int PRCVAT;
    CalculateVat(double number, int PRCVAT){
        this.number = number;
        this.PRCVAT = PRCVAT;
    }
    public static double doVAT(double number){
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
