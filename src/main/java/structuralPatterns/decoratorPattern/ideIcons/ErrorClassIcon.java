package structuralPatterns.decoratorPattern.ideIcons;

public class ErrorClassIcon implements IDEIcons{

    private IDEIcons ideIcons;

    public ErrorClassIcon(IDEIcons ideIcons) {
        this.ideIcons = ideIcons;
    }

    @Override
    public void generateIcon() {
        System.out.println("Error class icon");
        ideIcons.generateIcon();
    }
}
