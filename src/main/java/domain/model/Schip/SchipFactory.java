package domain.model.Schip;

import domain.model.DomainException;

public class SchipFactory {

    public SchipFactory() {

    }

    public Schip maakSchip(int groote, boolean horizontaal) {
        switch (groote) {
            case 2:
                Schip s = Schip.Patrouilleschip;
                s.setRichting(horizontaal);
                return s;
            case 3:

            default:
                throw new DomainException("De groote van een schip moet minstens 2 zijn.");
        }
    }
}
