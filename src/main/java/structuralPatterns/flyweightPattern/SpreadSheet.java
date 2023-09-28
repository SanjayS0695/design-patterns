package structuralPatterns.flyweightPattern;

import java.util.LinkedList;
import java.util.List;

public class SpreadSheet {
    List<Cell> cells = new LinkedList<>();

    public void addCells(Cell cell) {
        cells.add(cell);
    }

    public void printCells() {
        for (Cell cell: cells) {
            System.out.printf("Cells with %s, %s, %s,", cell.getCellSize(), cell.getCellType(), cell.getFont());
        }
    }
}
