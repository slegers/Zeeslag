package ui.controller;

import domain.model.Observer.Observer;
import domain.model.Observer.Subject;
import domain.model.Spel;
import ui.view.ZeeslagView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ZeeslagController implements Subject {
    private ZeeslagView view;
    private Spel spel;
    private ArrayList<Observer> observers;
    public ZeeslagController(Spel spel, ZeeslagView view){
        this.spel = spel;
        this.view = view;
        maakSpeler();
        this.view.setSpelersNaam(spel.getNaamSpeler());
        setControllerView();
        observers = new ArrayList<Observer>();
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

    public ArrayList<Observer> getObservers() {
        return observers;
    }
}
