package abstractFactory;

public class WindowsButton implements GuiFeature{

    @Override
    public void create() {
        System.out.println("Button to be displayed on Windows has been created!");
    }
}
