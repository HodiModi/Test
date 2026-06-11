/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testgit;

/**
 *
 * @author 14257112
 */

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Zoo Ticket System ===");

        System.out.print("Anzahl Erwachsene: ");
        int erwachsene = scanner.nextInt();

        System.out.print("Anzahl Kinder (6-17 Jahre): ");
        int kinder = scanner.nextInt();

        System.out.print("Anzahl Kleinkinder (unter 6 Jahre): ");
        int kleinkinder = scanner.nextInt();

        System.out.print("Anzahl benötigter Parkplätze: ");
        int parkplaetze = scanner.nextInt();

        System.out.print("Ziegenfütterung buchen? (j/n): ");
        boolean ziegen = scanner.next().toLowerCase().charAt(0) == 'j';

        System.out.print("Orca-Show buchen? (j/n): ");
        boolean orca = scanner.next().toLowerCase().charAt(0) == 'j';

        Tickets ticket = new Tickets(
                erwachsene,
                kinder,
                kleinkinder,
                parkplaetze,
                ziegen,
                orca
        );

        Auftrag auftrag = new Auftrag();

        int zahlendePersonen = erwachsene + kinder;

        System.out.println("\n===== RECHNUNG =====");

        System.out.println("Erwachsene: " + erwachsene +
                " x 25€ = " + (erwachsene * 25) + "€");

        System.out.println("Kinder: " + kinder +
                " x 15€ = " + (kinder * 15) + "€");

        System.out.println("Kleinkinder: " + kleinkinder +
                " x 0€ = 0€");

        System.out.println("Parkplätze: " + parkplaetze +
                " x 5€ = " + (parkplaetze * 5) + "€");

        if (ziegen) {
            System.out.println("Ziegenfütterung: " +
                    zahlendePersonen + " x 3€ = " +
                    (zahlendePersonen * 3) + "€");
        }

        if (orca) {
            System.out.println("Orca-Show: " +
                    zahlendePersonen + " x 8€ = " +
                    (zahlendePersonen * 8) + "€");
        }

        System.out.println("---------------------");
        System.out.println("Gesamtpreis: " +
                ticket.berechnePreis() + "€");

        System.out.println("\nAuftragsnummer:");
        System.out.println(auftrag.getAuftragsnummer());

        System.out.println("\nBarcode:");
        System.out.println(
                BarcodeGenerator.erzeugeBarcode(
                        auftrag.getAuftragsnummer()
                )
        );

        scanner.close();
    }
}