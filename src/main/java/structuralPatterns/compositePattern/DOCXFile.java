package structuralPatterns.compositePattern;

public class DOCXFile implements Component {
    private String fileName;

    public DOCXFile(String fileName) {
        this.fileName = fileName;
        Memory.MEMORY.put(this.fileName, this);
    }

    @Override
    public void delete() {
        System.out.println("Docx file deleted: " + fileName);
        Memory.MEMORY.remove(this.fileName);
        RecycleBin.DELETED_COMPONENTS.add(this);
    }

    @Override
    public void copy() {
        System.out.println("Docx file copied: " + fileName);
    }
}
