package domain.model;

import domain.model.Schip.Schip;

import java.util.ArrayList;

public class Speler {

    private String naam;
    private ArrayList<Schip> schips;
    public Speler(String naam){
        setNaam(naam);
        schips = new ArrayList<Schip>();
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

    public void addShip(Schip s){
        if(schips.size() > 5){
            throw new DomainException("Een speler kan niet meer als 5 schepen hebben.");
        }
        schips.add(s);
    }
}
