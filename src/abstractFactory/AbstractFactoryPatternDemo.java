package abstractFactory;

import java.util.Scanner;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your machine os");
        String os = scanner.next();
        GuiFeatureCreationFactory guiFeatureCreationFactory = OsCreationAbstractFactory.getFeatureFactoryForOs(os);
        System.out.println("Enter the GUI Feature you want (TextBox/Button)");
        String featureName = scanner.next();
        GuiFeature guiFeature = guiFeatureCreationFactory.getGuiFeature(featureName);
        guiFeature.create();
    }
}
