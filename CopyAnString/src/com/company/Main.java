
package com.company;


import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

//Make a copy of String
public class Main {
    public static void main(String[] args) {
        Clipboard systemClip = Toolkit.getDefaultToolkit().getSystemClipboard();

        systemClip.setContents(new StringSelection("I am the copy"),null);

        Transferable transfer = systemClip.getContents(null);

        for (int i = 0; i < transfer.getTransferDataFlavors().length; i++)
        {
            Object content = null;
            try {
                content = transfer.getTransferData(transfer.getTransferDataFlavors()[i]);
            } catch (UnsupportedFlavorException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (content instanceof String){
                System.out.println(content);
                break;
            }
        }
    }

}