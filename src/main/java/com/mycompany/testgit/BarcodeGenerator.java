/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testgit;

/**
 *
 * @author 14257112
 */

public class BarcodeGenerator {

    public static String erzeugeBarcode(String text) {

        StringBuilder barcode = new StringBuilder();

        for (char c : text.toCharArray()) {

            int wert = (int) c;

            if (wert % 2 == 0) {
                barcode.append("||| ");
            } else {
                barcode.append("|| ");
            }
        }

        return barcode.toString();
    }
}