/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testgit;

/**
 *
 * @author 14257112
 */

public class Tickets {

    private int erwachsene;
    private int kinder;
    private int kleinkinder;

    private int parkplaetze;

    private boolean ziegenfuetterung;
    private boolean orcaShow;

    private final int PREIS_ERWACHSEN = 25;
    private final int PREIS_KIND = 15;

    private final int PREIS_PARKEN = 5;

    private final int PREIS_ZIEGE = 3;
    private final int PREIS_ORCA = 8;

    public Tickets(int erwachsene,
                  int kinder,
                  int kleinkinder,
                  int parkplaetze,
                  boolean ziegenfuetterung,
                  boolean orcaShow) {

        this.erwachsene = erwachsene;
        this.kinder = kinder;
        this.kleinkinder = kleinkinder;
        this.parkplaetze = parkplaetze;
        this.ziegenfuetterung = ziegenfuetterung;
        this.orcaShow = orcaShow;
    }

    public double berechnePreis() {

        double gesamt = 0;

        int zahlendePersonen = erwachsene + kinder;

        // Eintritt
        gesamt += erwachsene * PREIS_ERWACHSEN;
        gesamt += kinder * PREIS_KIND;

        // Parkplätze
        gesamt += parkplaetze * PREIS_PARKEN;

        // Ziegenfütterung pro zahlender Person
        if (ziegenfuetterung) {
            gesamt += zahlendePersonen * PREIS_ZIEGE;
        }

        // Orca-Show pro zahlender Person
        if (orcaShow) {
            gesamt += zahlendePersonen * PREIS_ORCA;
        }

        return gesamt;
    }
}