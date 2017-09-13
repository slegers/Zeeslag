package ui.controller;

import domain.model.Spel;
import ui.view.ZeeslagView;

import javax.swing.*;
import java.awt.*;

public class ZeeslagController {
    private ZeeslagView view;
    private Spel spel;
    public ZeeslagController(Spel spel, ZeeslagView view){
        this.spel = spel;
        this.view = view;
        maakSpeler();
        this.view.setSpelersNaam(spel.getNaamSpeler());
    }

    private void setControllerView() {
        view.setController(this);
    }

    public void maakSpeler(){
        try{
            spel.maakSpeler(JOptionPane.showInputDialog(null,"Wat is uw naam?"));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            maakSpeler();
        }
    }

    public void hit(int id, Color black) {
        view.hit(id,black);
    }

    public void CreaeteSchip(int id) {
        //TODO paint the
    }
}
