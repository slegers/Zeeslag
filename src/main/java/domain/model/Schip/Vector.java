package domain.model.Schip;

import domain.model.DomainException;

public class Vector {

    private int groote;
    private boolean horizontaal;

    public Vector(int groote){
        this(groote,true);
    }

    public Vector(int groote, boolean horizontaal) {
        setGroote(groote);
        this.horizontaal = horizontaal;
    }

    public void setGroote(int groote) {
        if(groote < 2){
            throw new DomainException("De groote van een schip moet minstens 2 zijn.");
        }
        this.groote = groote;
    }

    public int getGroote() {
        return groote;
    }
}
