package domain.model.Schip;

import com.sun.java.browser.plugin2.DOM;
import domain.model.DomainException;

public enum Schip {

    Vliegdekschip(new Vector(5)) ,
    Slagschip(new Vector(4)),
    Onderzeeër(new Vector(3)),
    Torpedobootjager(new Vector(3)),
    Patrouilleschip(new Vector(2));

    private Vector vector;
    private Compartiment[] compartiments;
    Schip(Vector v){
        setVector(v);
        setCompartiment();

    }

    private void setCompartiment() {
        compartiments = new Compartiment[this.vector.getGroote()];
        for(int i = 0; i<compartiments.length;i++){
            compartiments[i] = new Compartiment();
        }
    }

    public int getGroote(){
        return vector.getGroote();
    }

    public void hit(int compartiment){
        if(compartiment >= getGroote()){
            throw new DomainException("Het schip heeft geen compartiment met dit nummer.");
        }
        compartiments[compartiment].hit();
    }

    public boolean isGezonken(){
        for(Compartiment c : compartiments){
            if(!c.isGeraakt()){
                return false;
            }
        }
        return true;
    }

    public void setVector(Vector vector) {
        if(vector == null){
            throw new DomainException("De vector van een schip kan niet null zijn.");
        }
        this.vector = vector;
    }

    /**
     * Veranderd de richting van het schip naar de gegeven richting.
     *
     * @param horizontaal
     *        True als en alleen als het schip horizontaal gepositioneerd moet worden.
     *        False als en alleen als het schip verticaal gepositioneerd moet worden.
     */
    public void setRichting(boolean horizontaal){
        vector.setRichting(horizontaal);
    }

    /**
     * Geeft de richting terug van het schip.
     *
     * @return True als en alleen als het schip horizontaal gepositioneerd is.
     * @Return False als en alleen als het schip verticaal gepositioneerd is.
     */
    public boolean getRichting(){
        return vector.getHorizontaal();
    }
}
