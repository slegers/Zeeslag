package ui.view.veld;
import domain.model.DomainException;
import javax.swing.*;
import java.awt.*;
import java.util.TreeMap;

public abstract class Veld extends JPanel{

    private TreeMap<Integer,Tile> veld;

    public Veld(){
        veld = new TreeMap<Integer, Tile>();
        setLayout(new GridLayout(10,10));
        setVeld();
    }

    public void setVeld(){
       for(int i = 0; i < 10;i++){
           for(int j = 0; j < 10; j++){
               veld.put(i+j*10,new Tile(i+j*10));
           }
       }
       for(Tile t : veld.values()){
           add(t);
       }
       setVisible(true);
    }
    public TreeMap<Integer,Tile> getTiles(){
        return veld;
    }

    /**
     * Veranderd de kleur van een tegel met gegeven id naar een desgewenste kleur.
     *
     * @param id
     *        Het id van de tegel die veranderd moet worden.
     * @param c
     *        De kleur naarwaar de tegel moet worden veranderd.
     */
    public void veranderKleur(int id,Color c){
        if(veld == null){
            throw new DomainException("veld mag niet gelijk zijn aan null.");
        }
        System.out.println(id);
          veld.get(id).setColor(c);
    }
}
