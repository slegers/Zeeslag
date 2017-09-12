package ui.view;

import ui.view.veld.Tile;

import javax.swing.*;
import java.awt.*;

public class ZeeslagView extends JFrame {

    private SpelersPanel spelersPanel, computerPanel;
    private InstellingenPanel instellingenPanel;

    public ZeeslagView() {
        setTitle("Zeeslag");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout();
        AddPanels();
        this.pack();
    }

    private void AddPanels() {
        instellingenPanel = new InstellingenPanel();
        spelersPanel = new SpelersPanel();
        spelersPanel.createSpelersVeld();
        computerPanel = new SpelersPanel();
        computerPanel.createComputerVeld();
        add(instellingenPanel);
        add(spelersPanel);
        add(computerPanel);
    }

    private void setLayout() {
        GridLayout layout = new GridLayout(1,3);
        layout.setHgap(20);
        setLayout(layout);
        setResizable(false);
    }

    public void setSpelersNaam(String spelersNaam) {
       spelersPanel.setSpelersNaam(spelersNaam);
    }
}
