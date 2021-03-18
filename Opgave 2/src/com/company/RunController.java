package com.company;

public class RunController {
    private double userIn;
    private double moms;
    Dialog diag = new Dialog();
    DoVat dovat;


    public void runController() {
        this.userIn = diag.dialog();
        dovat = new DoVat(userIn);
        double moms = dovat.doVAT(userIn);
        DoView.doView(moms, ComputeVATBetterStyleOO.MSG);
    }
}
