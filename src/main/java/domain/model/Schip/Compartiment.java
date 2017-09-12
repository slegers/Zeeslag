package domain.model.Schip;

import domain.model.DomainException;

public class Compartiment {
    private boolean geraakt;

    public Compartiment(){
        geraakt = false;

    }
    public boolean isGeraakt(){
        return geraakt;
    }

    public void hit() {
        if(geraakt){
            throw new DomainException("Een compartiment dat geraakt is kan niet twee keer worden beschoten.");
        }
        geraakt = true;
    }
}
