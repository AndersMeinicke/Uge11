package com.company;

public class Controller {
    final static String MSG = "MOMS";
    final static String CURRENCY = "Kr";
    final static int PRCVAT = 25;
    public static void runController() {
        Dialog dialog = new Dialog();
        double userIn = dialog.doDiag();
        CalculateVat calculateVat = new CalculateVat(userIn,PRCVAT);
        double moms = calculateVat.doVAT(userIn);
        View view = new View(moms,MSG,CURRENCY);
        view.doView();
    }
}
