/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testgit;

/**
 *
 * @author 14257112
 */

import java.util.Random;

public class Auftrag {

    private String auftragsnummer;

    public Auftrag() {

        Random random = new Random();

        int nummer = 10000 + random.nextInt(90000);

        auftragsnummer = "ZOO-2026-" + nummer;
    }

    public String getAuftragsnummer() {
        return auftragsnummer;
    }
}