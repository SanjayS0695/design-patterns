package behavioralPatterns.memento;

public class MementoPattern {

    public static void main(String[] args) {
        var document = new Document(new History());
        document.setContent("Content");
        document.setFontName("fontOne");
        document.setFontSize(22);

        System.out.println(document.getContent() + " " + document.getFontName() + " " + document.getFontSize());

        document.undo();
        System.out.println(document.getContent() + " " + document.getFontName() + " " + document.getFontSize());
        //Content fontOne 0
        document.undo();
        System.out.println(document.getContent() + " " + document.getFontName() + " " + document.getFontSize());
        //Content null 0
        document.undo();
        //null null 0
        System.out.println(document.getContent() + " " + document.getFontName() + " " + document.getFontSize());
        document.undo();
        //Undo not possible
        System.out.println(document.getContent() + " " + document.getFontName() + " " + document.getFontSize());
        //null null 0

        document.setContent("Content");
        document.setFontName("fontOne");
        document.setFontSize(22);

        document.setContent("Content Latest");
        System.out.println(document.getContent() + " " + document.getFontName() + " " + document.getFontSize());
        //Content Latest fontOne 22
        document.undo();
        System.out.println(document.getContent() + " " + document.getFontName() + " " + document.getFontSize());
        //Content fontOne 22
    }
}
