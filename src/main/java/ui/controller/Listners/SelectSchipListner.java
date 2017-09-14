package ui.controller.Listners;

import domain.model.DomainException;
import ui.controller.ZeeslagController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectSchipListner implements ActionListener {
    private ZeeslagController controller;

    public SelectSchipListner(ZeeslagController controller){
        setController(controller);
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void setController(ZeeslagController controller) {
        if(controller == null ){
            throw new DomainException("De controller van de selectShipListner kan niet gelijk zijn aan null.");
        }
        this.controller = controller;
    }
}
