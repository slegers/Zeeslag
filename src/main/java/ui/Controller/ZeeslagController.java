package ui.Controller;

import domain.model.Spel;
import ui.view.View;
import javax.swing.*;

public class ZeeslagController {
    private View view;
    private Spel spel;
    public ZeeslagController(Spel spel,View view){
        this.spel = spel;
        this.view = view;
        maakSpeler();
        this.view.setSpelersNaam(spel.getNaamSpeler());
    }

    public void maakSpeler(){
        try{
            spel.maakSpeler(JOptionPane.showInputDialog(null,"Wat is uw naam?"));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            maakSpeler();
        }
    }
}
