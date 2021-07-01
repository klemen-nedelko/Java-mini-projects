package com.company;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class PrintObject implements Printable {
    @Override
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
        if (page > 0)
        {
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        g2d.drawString("Hello World",100,100);

        return PAGE_EXISTS;
    }
}