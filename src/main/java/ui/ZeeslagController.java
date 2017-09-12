package ui;

import ui.view.ZeeslagView;

public class ZeeslagController {
    private ZeeslagView view;
    public ZeeslagController(){
        view = new ZeeslagView();
    }

    public void startGame() {
        view.setVisible(true);
    }
}
