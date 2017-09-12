package ui.view;

import domain.model.Schip.Schip;

import javax.swing.*;
import java.awt.*;

public class InstellingenPanel extends JPanel{
    private JLabel schepen, richting;
    private JComboBox select;
    private CheckboxGroup positie;
    private GridBagLayout layout;
    private GridBagConstraints c;
    public InstellingenPanel() {
        setLayoutInstellingen();
        maakSchepen();
        maakRichting();
        setVisible(true);
    }

    private void maakRichting() {
        c.gridy = 3;
        c.gridx = 0;
        richting = new JLabel("Richting: ");
        add(richting,c);
        positie = createCheckboxGroup();
    }

    private void maakSchepen() {
        c.gridy = 0;
        c.gridx = 0;
        c.fill = GridBagConstraints.BOTH;
        schepen = new JLabel("Beschikbare schepen: ");
        add(schepen,c);
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        select = createShipCombobox();
        add(select,c);
    }

    private void setLayoutInstellingen() {
        layout = new GridBagLayout();
        setLayout(layout);
        c = new GridBagConstraints();
        c.gridheight = 1;
    }

    private CheckboxGroup createCheckboxGroup() {
        CheckboxGroup group = new CheckboxGroup();
        c.gridy = 4;
        c.gridx = 0;
        c.fill = GridBagConstraints.BOTH;
        add(new Checkbox("Horizontaal",group,true),c);
        c.gridy = 4;
        c.gridx = 1;
        c.fill = GridBagConstraints.BOTH;
        add(new Checkbox("Verticaal",group,false),c);
        return group;
    }

    private JComboBox createShipCombobox() {
        String[] schips = new String[Schip.values().length];
        int i = 0;
        for(Schip s : Schip.values()){
            schips[i] = s.toString() + " (" + s.getGroote() +")";
            i++;
        }
        return new JComboBox(schips);
    }

}
