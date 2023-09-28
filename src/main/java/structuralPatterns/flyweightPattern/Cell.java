package structuralPatterns.flyweightPattern;

public class Cell {
    private CellType cellType;
    private int cellSize;

    public CellType getCellType() {
        return cellType;
    }

    public int getCellSize() {
        return cellSize;
    }

    public Font getFont() {
        return font;
    }

    private Font font;

    public Cell(CellType cellType, int cellSize, Font font) {
        this.cellType = cellType;
        this.cellSize = cellSize;
        this.font = font;
    }
}
