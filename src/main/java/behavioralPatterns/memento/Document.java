package behavioralPatterns.memento;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    private History history;

    public Document(History history) {
        this.history = history;
        this.history.push(createState());
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.history.push(this.createState());
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
        this.history.push(this.createState());
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
        this.history.push(this.createState());
    }

    private DocumentState createState() {
        return new DocumentState(this);
    }

    public void undo() {
        var state = history.undo();
        if (state != null) {
            this.content = state.getContent();
            this.fontName = state.getFontName();
            this.fontSize = state.getFontSize();
        }
    }


}
