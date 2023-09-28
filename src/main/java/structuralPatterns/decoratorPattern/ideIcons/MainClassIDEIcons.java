package structuralPatterns.decoratorPattern.ideIcons;

public class MainClassIDEIcons implements IDEIcons {

    private IDEIcons ideIcons;

    public MainClassIDEIcons(IDEIcons ideIcons) {
        this.ideIcons = ideIcons;
    }

    @Override
    public void generateIcon() {
        System.out.println("MainClass Icon");
        ideIcons.generateIcon();
    }
}
