package structuralPatterns.compositePattern;

public class JPEGFile implements Component {
    private String fileName;

    public JPEGFile(String fileName) {
        this.fileName = fileName;
        Memory.MEMORY.put(this.fileName, this);
    }

    @Override
    public void delete() {
        System.out.println("Jpeg file deleted: " + fileName);
        Memory.MEMORY.remove(this.fileName);
        RecycleBin.DELETED_COMPONENTS.add(this);
    }

    @Override
    public void copy() {
        System.out.println("Jpeg file copied: " + fileName);
    }
}
