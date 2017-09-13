package ui.view.veld;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Tile extends JPanel {
    private int id;
    public Tile(int id) {
        this.id = id;
        Create();
    }

    private void Create() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        setPreferredSize(new Dimension(getFieldSize(), getFieldSize()));
        setColor(Color.CYAN);
        setVisible(true);
    }

    public int getFieldSize(){
        return 40;
    }
    public void setColor(Color c){
        setBackground(c);
        updateUI();
    }
    public void setMouseListner(MouseListener m ){
        addMouseListener(m);
        setName(id+"");
    }
    @Override
    public String toString(){
        return this.id +"";
    }
}
