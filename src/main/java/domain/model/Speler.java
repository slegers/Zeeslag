package domain.model;

public class Speler {

    private String naam;
    public Speler(String naam){
        setNaam(naam);
    }

    public void setNaam(String naam) {
        if(naam == null){
            throw new NullPointerException("De naam van een speler mag niet gelijk zijn aan null.");
        }if(naam.trim().equals("")){
            throw new DomainException("De naam van een speler mag niet leeg zijn of enkel spaties bevatten.");
        }
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }
}
