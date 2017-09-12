package ui.view;

import ui.view.veld.Tile;

import javax.swing.*;
import java.awt.*;

public class ZeeslagView extends JFrame {

    private SpelersPanel spelersPanel, computerPanel;

    public ZeeslagView() {
        setLayout();
        AddPanels();
        this.pack();
    }

    private void AddPanels() {
        spelersPanel = new SpelersPanel();
        spelersPanel.createSpelersVeld();
        computerPanel = new SpelersPanel();
        computerPanel.createComputerVeld();
        add(spelersPanel);
        add(computerPanel);
    }

    private void setLayout() {
        GridLayout layout = new GridLayout(1,2);
        layout.setHgap(20);
        setLayout(layout);
        setResizable(false);
    }

    public void setSpelersNaam(String spelersNaam) {
       spelersPanel.setSpelersNaam(spelersNaam);
    }
}
