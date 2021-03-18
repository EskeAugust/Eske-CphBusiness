package com.company;

public class DoVat {
    private double VAT;

    public DoVat(double VAT) {
        this.VAT = VAT;
    }

    public static double doVAT(double number) {
        double VAT = number / 100 * ComputeVATBetterStyleOO.PRCVAT;
        return VAT;
    }
}
