package ui.view.veld;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel {
    private int id;
    public Tile(int id) {
        this.id = id;
        Create();
    }

    private void Create() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        setPreferredSize(new Dimension(getFieldSize(), getFieldSize()));
        setBackground(Color.CYAN);
        setVisible(true);
    }

    public int getFieldSize(){
        return 50;
    }
}
