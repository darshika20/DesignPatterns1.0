package abstractFactory;

public class MacGuiFeatureCreationFactory implements GuiFeatureCreationFactory {
    @Override
    public GuiFeature getGuiFeature(String featureName) {
        if (GuiFeatureEnum.BUTTON.name().equalsIgnoreCase(featureName)) {
            return new MacButton();
        } else if (GuiFeatureEnum.TEXTBOX.name().equalsIgnoreCase(featureName)) {
            return new MacTextBox();
        } else {
            System.out.println("Invalid feature name, defaulting to Mac Text Box");
            return new MacTextBox();
        }
    }
}
