package domain.model;


import ui.Controller.ZeeslagController;
import ui.view.View;
import ui.view.viewComponents.ZeeslagView;

public class Launcher {

    public static void main(String[] args){
       View view = new ZeeslagView();
       Spel spel = new Spel();
       ZeeslagController controller = new ZeeslagController(spel,view);
       view.start();
    }
}
