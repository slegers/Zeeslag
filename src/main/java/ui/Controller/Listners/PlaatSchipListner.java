package ui.controller.Listners;

import ui.controller.ZeeslagController;

import java.awt.event.MouseEvent;

public class PlaatSchipListner extends TegelMouseListner {

    public PlaatSchipListner(ZeeslagController controller) {
        super(controller);
    }

    public void mouseClicked(MouseEvent e) {
        getController().CreaeteSchip(Integer.parseInt(e.getSource().toString()));
    }
}
