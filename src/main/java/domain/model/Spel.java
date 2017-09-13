package domain.model;

import java.util.ArrayList;

public class Spel {
    private Speler speler;
    public void maakSpeler(String s) {
        this.speler = new Speler(s);
        this.speler = new Speler("computer");
    }

    public String getNaamSpeler() {
        return speler.getNaam();
    }
}
