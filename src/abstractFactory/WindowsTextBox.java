package abstractFactory;

public class WindowsTextBox implements GuiFeature{

    @Override
    public void create() {
        System.out.println("Text Box to be displayed on Windows has been created!");
    }
}
