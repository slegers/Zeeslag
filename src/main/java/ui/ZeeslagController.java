package ui;

import domain.model.Speler;
import ui.view.ZeeslagView;

import javax.swing.*;

public class ZeeslagController {
    private ZeeslagView view;
    private Speler speler;
    public ZeeslagController(){
        view = new ZeeslagView();
        maakSpeler();
        view.setSpelersNaam(speler.getNaam());
    }
    public void maakSpeler(){
        speler = new Speler(JOptionPane.showInputDialog(null,"Wat is uw naam?"));
    }
    public void startGame() {
        view.setVisible(true);
    }
}
