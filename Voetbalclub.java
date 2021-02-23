package practica2b;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;

    public Voetbalclub(String naam) {
        this.naam = naam;
    }

    public int aantalPunten() {
        int winstPunten = aantalGewonnen * 3;
        int gelijkPunten = aantalGelijk;
        int verlorenPunten = 0;
        return winstPunten + gelijkPunten + verlorenPunten;


    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
    public String toString(){
        return naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}