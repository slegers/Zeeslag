package domain.model;

public class Spel {
    private Speler speler;
    private SchipPlaatser schipPlaatser;
    public void maakSpeler(String s) {
        this.speler = new Speler(s);
        this.speler = new Speler("computer");
    }

    public String getNaamSpeler() {
        return speler.getNaam();
    }
}
