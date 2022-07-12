package abstractFactory;

public interface GuiFeatureCreationFactory {
    GuiFeature getGuiFeature(String featureName);
}
