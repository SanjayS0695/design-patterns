package structuralPatterns.compositePattern;

public class TextFile implements Component {

    private String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
        Memory.MEMORY.put(this.fileName, this);
    }

    @Override
    public void delete() {
        System.out.println("Text file deleted: " + fileName);
        Memory.MEMORY.remove(this.fileName);
        RecycleBin.DELETED_COMPONENTS.add(this);
    }

    @Override
    public void copy() {
        System.out.println("Text file copied: " + fileName);
    }
}
