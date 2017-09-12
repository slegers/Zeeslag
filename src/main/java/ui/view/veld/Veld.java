package ui.view.veld;

import com.sun.tools.corba.se.idl.InterfaceGen;

import javax.swing.*;
import java.awt.*;
import java.util.TreeMap;

public abstract class Veld extends JPanel{

    private TreeMap<Integer,Tile> veld;

    public Veld(){
        veld = new TreeMap<Integer, Tile>();
        setLayout(new GridLayout(10,10));
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


}
