package abstractFactory;

public class MacTextBox implements GuiFeature{

    @Override
    public void create() {
        System.out.println("Text Box to be displayed on Mac has been created!");
    }
}
