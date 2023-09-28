package behavioralPatterns.memento;

public class DocumentState {
    private String content;
    private String fontName;
    private int fontSize;

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public DocumentState(Document document) {
        this.content = document.getContent();
        this.fontName = document.getFontName();
        this.fontSize = document.getFontSize();
    }
}
