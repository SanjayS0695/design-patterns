package structuralPatterns.flyweightPattern;

public class Font {
    private String fontName;
    private byte[] font;

    public String getFontName() {
        return fontName;
    }

    public byte[] getFont() {
        return font;
    }

    public Font(String fontName, byte[] font) {
        this.fontName = fontName;
        this.font = font;
    }
}
