package ui.controller.Listners;

import domain.model.DomainException;
import ui.controller.ZeeslagController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class TegelMouseListner implements MouseListener{

    private ZeeslagController controller;
    public TegelMouseListner(ZeeslagController controller){
        setController(controller);
    }

    public  abstract void mouseClicked(MouseEvent e);

    public void mousePressed(MouseEvent e){

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void setController(ZeeslagController controller) {
        if(controller == null){
            throw new DomainException("The actionlistner of A mouse can't be null");
        }
        this.controller = controller;
    }

    public ZeeslagController getController() {
        return controller;
    }
}
