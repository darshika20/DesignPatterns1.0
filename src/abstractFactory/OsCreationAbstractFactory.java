package abstractFactory;

public class OsCreationAbstractFactory {

    public static GuiFeatureCreationFactory getFeatureFactoryForOs(String os) {
        if (OS.MAC.name().equalsIgnoreCase(os)) {
            return new MacGuiFeatureCreationFactory();
        } else if (OS.WINDOWS.name().equalsIgnoreCase(os)) {
            return new WindowsGuiFeatureCreationFactory();
        } else {
            System.out.println("Sorry, the eneterd OS does not exist, so setting OS to default MAC OS");
            return new MacGuiFeatureCreationFactory();
        }
    }
}
