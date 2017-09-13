package ui.view;


import ui.Controller.ZeeslagController;

public interface View {

    public void start();

    public void setController(ZeeslagController controller);

    void setSpelersNaam(String naamSpeler);
}
