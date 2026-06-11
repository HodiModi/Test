public class Ticket {

    private int erwachsene;
    private int kinder;
    private int kleinkinder;

    private boolean parkplatz;
    private boolean ziegenfuetterung;
    private boolean orcaShow;

    private final int PREIS_ERWACHSEN = 25;
    private final int PREIS_KIND = 15;
    private final int PREIS_PARKEN = 5;
    private final int PREIS_ZIEGE = 3;
    private final int PREIS_ORCA = 8;

    public Ticket(int erwachsene,
                  int kinder,
                  int kleinkinder,
                  boolean parkplatz,
                  boolean ziegenfuetterung,
                  boolean orcaShow) {

        this.erwachsene = erwachsene;
        this.kinder = kinder;
        this.kleinkinder = kleinkinder;
        this.parkplatz = parkplatz;
        this.ziegenfuetterung = ziegenfuetterung;
        this.orcaShow = orcaShow;
    }

    public double berechnePreis() {

        double gesamt = 0;

        gesamt += erwachsene * PREIS_ERWACHSEN;
        gesamt += kinder * PREIS_KIND;

        if (parkplatz)
            gesamt += PREIS_PARKEN;

        if (ziegenfuetterung)
            gesamt += PREIS_ZIEGE;

        if (orcaShow)
            gesamt += PREIS_ORCA;

        return gesamt;
    }
}
