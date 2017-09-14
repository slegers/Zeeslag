package ui.view;

import domain.model.DomainException;
import ui.controller.Listners.SelectSchipListner;
import ui.controller.ZeeslagController;

import javax.swing.*;
import java.awt.*;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class ZeeslagView extends JFrame {

    private SpelersPanel spelersPanel, computerPanel;
    private InstellingenPanel instellingenPanel;
    private ZeeslagController controller;

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

    public void start() {
        this.setVisible(true);
    }

    public void setController(ZeeslagController controller) {
        if (controller == null) {
            throw new DomainException("De controller van de zeeslagview kan nie gelijk zijn aan null.");
        }
        this.controller = controller;
        setControllerPanels(this.controller);
    }

    public void setControllerPanels(ZeeslagController controller) {
        spelersPanel.setControllerVeld(controller);
        instellingenPanel.addSelectActionListner(new SelectSchipListner(controller));
    }

    public void hit(int id, Color black) {
        spelersPanel.hit(id,black);
    }
}
