package domain.model;


import ui.controller.ZeeslagController;
import ui.view.ZeeslagView;

public class Launcher {

    public static void main(String[] args){
       ZeeslagView view = new ZeeslagView();
       Spel spel = new Spel();
       ZeeslagController controller = new ZeeslagController(spel,view);
       view.start();
    }
}
