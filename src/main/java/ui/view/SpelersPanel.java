package ui.view;


import ui.controller.Listners.PlaatSchipListner;
import ui.controller.ZeeslagController;
import ui.view.veld.ComputerVeld;
import ui.view.veld.SpelersVeld;
import ui.view.veld.Tile;
import ui.view.veld.Veld;

import javax.swing.*;
import java.awt.*;

public class SpelersPanel extends JPanel {
    private Veld veld;
    private JLabel label;
    public SpelersPanel(){
        setLayout(new GridBagLayout());
     }

    private void addNameLabel(String naam) {
        GridBagConstraints c = new GridBagConstraints();
        c.gridheight = 11;
        c.gridwidth = 10;
        c.gridx = 1;
        label = new JLabel(naam + ": ");
        add(label,c);
    }

    public void createSpelersVeld() {
        if(veld == null){
            addNameLabel("");
            veld = new SpelersVeld();
        }
        afterCreation();
    }
    public Veld getVeld(){
        return veld;
    }

    public void createComputerVeld() {
        if(veld == null){
            addNameLabel("Computer");
            veld = new ComputerVeld();
        }
        afterCreation();
    }
    private void afterCreation(){
        setVisible(true);
        addVeld();
    }

    private void addVeld() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridheight = 11;
        c.gridwidth = 10;
        c.gridx = 2;
        add(veld,c);
    }

    public void setSpelersNaam(String naam) {
        label.setText(naam + ": ");
        this.updateUI();
    }

    public void setControllerVeld(ZeeslagController controller) {
       for(Tile t : veld.getTiles().values()){
           t.setMouseListner(new PlaatSchipListner(controller));
       }
    }

    public void hit(int id, Color black) {
        veld.veranderKleur(id,black);
    }
}
