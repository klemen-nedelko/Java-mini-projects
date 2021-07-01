package com.company;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class Main {

    public static void main(String[] args)
    {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setPrintable(new PrintObject());

        if (printerJob.printDialog());
        {
            try {
                printerJob.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }
    }
}
