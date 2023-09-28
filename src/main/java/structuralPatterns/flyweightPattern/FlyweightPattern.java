package structuralPatterns.flyweightPattern;

public class FlyweightPattern {

    public static void main(String[] args) {
        var fontFactory = new FontFactory();
        var cell1 = new Cell(CellType.TYPE1, 10, fontFactory.getFontForCell(CellType.TYPE1));

        var cell2 = new Cell(CellType.TYPE1, 12, fontFactory.getFontForCell(CellType.TYPE1));

        var cell3 = new Cell(CellType.TYPE3, 10, fontFactory.getFontForCell(CellType.TYPE3));

        var spreadSheet = new SpreadSheet();
        spreadSheet.addCells(cell1);
        spreadSheet.addCells(cell2);
        spreadSheet.addCells(cell3);

        spreadSheet.printCells();
        //Cells with 10, TYPE1, structuralPatterns.flyweightPattern.Font@73d16e93,Cells with 12, TYPE1, structuralPatterns.flyweightPattern.Font@73d16e93,Cells with 10, TYPE3, structuralPatterns.flyweightPattern.Font@659e0bfd,

        //both Type1 fonts have the same address
    }
}
