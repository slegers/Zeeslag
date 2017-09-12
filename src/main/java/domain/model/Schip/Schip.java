package domain.model.Schip;

import domain.model.DomainException;

public enum Schip {

    Vliegdekschip(5) ,Slagschip(4), Onderzeeër(3), Torpedobootjager(3), Patrouilleschip(2);

    private final int groote;
    private Compartiment[] compartiments;
    Schip(int groote){
        this.groote = groote;
        setCompartiment();

    }

    private void setCompartiment() {
        compartiments = new Compartiment[groote];
        for(int i = 0; i<compartiments.length;i++){
            compartiments[i] = new Compartiment();
        }
    }

    public int getGroote(){
        return groote;
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
}
