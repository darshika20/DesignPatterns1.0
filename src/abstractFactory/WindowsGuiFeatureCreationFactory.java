package abstractFactory;

public class WindowsGuiFeatureCreationFactory implements GuiFeatureCreationFactory {
    @Override
    public GuiFeature getGuiFeature(String featureName) {
        if (GuiFeatureEnum.BUTTON.name().equalsIgnoreCase(featureName)) {
            return new WindowsButton();
        } else if (GuiFeatureEnum.TEXTBOX.name().equalsIgnoreCase(featureName)) {
            return new WindowsTextBox();
        } else {
            System.out.println("Invalid feature name, defaulting to Windows Text Box");
            return new WindowsTextBox();
        }
    }
}
