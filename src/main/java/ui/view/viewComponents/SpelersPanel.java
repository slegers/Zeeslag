package ui.view.viewComponents;


import ui.view.viewComponents.veld.ComputerVeld;
import ui.view.viewComponents.veld.SpelersVeld;
import ui.view.viewComponents.veld.Veld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

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
            veld.setVeld();
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
            veld.setVeld();
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
}
