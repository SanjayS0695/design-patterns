package structuralPatterns.decoratorPattern.ideIcons;

public class IDEIconMain {
    public static void main(String[] args) {
        var icon = new Icon();

        icon.generateIcon();
        //Dislaying Icon
        var icon1 = new MainClassIDEIcons(new Icon());
        icon1.generateIcon();
        //MainClass Icon
        //Dislaying Icon
        var icon2 = new MainClassIDEIcons(new ErrorClassIcon(new Icon()));
        icon2.generateIcon();
        //MainClass Icon
        //Error class icon
        //Dislaying Icon
    }
}
