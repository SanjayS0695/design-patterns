package structuralPatterns.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private Map<CellType, Font> fontMap = new HashMap<>();

    public Font getFontForCell(CellType cellType) {
        if (!fontMap.containsKey(cellType)) {
            if (cellType.equals(CellType.TYPE1)) {
                var font = new Font("font1", null);
                fontMap.put(cellType, font);
            }
            if (cellType.equals(CellType.TYPE2)) {
                var font = new Font("font2", null);
                fontMap.put(cellType, font);
            }
            if (cellType.equals(CellType.TYPE3)) {
                var font = new Font("font3", null);
                fontMap.put(cellType, font);
            }
        }
        return fontMap.get(cellType);
    }
}
