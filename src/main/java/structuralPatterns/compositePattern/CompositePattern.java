package structuralPatterns.compositePattern;

public class CompositePattern {

    public static void main(String[] args) {
        var folder = new Folder("testFolder");

        folder.add(new DOCXFile("testDocxFile.docx"));
        folder.add(new JPEGFile("testJPEGFile.jpg"));
        folder.add(new TextFile("testTextFile.txt"));

        folder.copy();
        //Copying Folder: testFolder and its contents
        //Docx file copied: testDocxFile.docx
        //Jpeg file copied: testJPEGFile.jpg
        //Text file copied: testTextFile.txt

        System.out.println(folder.getComponents());
        //[structuralPatterns.compositePattern.DOCXFile@4e0e2f2a, structuralPatterns.compositePattern.JPEGFile@73d16e93, structuralPatterns.compositePattern.TextFile@659e0bfd]
        System.out.println(Memory.MEMORY);
        //{testTextFile.txt=structuralPatterns.compositePattern.TextFile@659e0bfd, testFolder=structuralPatterns.compositePattern.Folder@2a139a55, testJPEGFile.jpg=structuralPatterns.compositePattern.JPEGFile@73d16e93, testDocxFile.docx=structuralPatterns.compositePattern.DOCXFile@4e0e2f2a}
        System.out.println(RecycleBin.DELETED_COMPONENTS);
        //[]

        folder.delete();
        //Deleting Folder: testFolder and its contents
        //Docx file deleted: testDocxFile.docx
        //Jpeg file deleted: testJPEGFile.jpg
        //Text file deleted: testTextFile.txt

        System.out.println(folder.getComponents());
        //[]
        System.out.println(Memory.MEMORY);
        //{}
        System.out.println(RecycleBin.DELETED_COMPONENTS);
        //[structuralPatterns.compositePattern.DOCXFile@4e0e2f2a, structuralPatterns.compositePattern.JPEGFile@73d16e93, structuralPatterns.compositePattern.TextFile@659e0bfd, structuralPatterns.compositePattern.Folder@2a139a55]

        var folder1 = new Folder("testFolder1");
        folder1.add(new DOCXFile("testDocxFile1.docx"));
        folder1.add(new JPEGFile("testJPEGFile1.jpg"));
        folder1.add(new TextFile("testTextFile1.txt"));

        var folder2 = new Folder("testFolder2");

        folder2.add(new DOCXFile("testDocxFile2.docx"));
        folder2.add(new JPEGFile("testJPEGFile2.jpg"));
        folder2.add(new TextFile("testTextFile2.txt"));

        var parentFolder = new Folder("parentFolder");
        parentFolder.add(folder1);
        parentFolder.add(folder2);

        parentFolder.copy();
        //Copying Folder: parentFolder and its contents
        //Copying Folder: testFolder1 and its contents
        //Docx file copied: testDocxFile1.docx
        //Jpeg file copied: testJPEGFile1.jpg
        //Text file copied: testTextFile1.txt
        //Copying Folder: testFolder2 and its contents
        //Docx file copied: testDocxFile2.docx
        //Jpeg file copied: testJPEGFile2.jpg
        //Text file copied: testTextFile2.txt

        parentFolder.delete();
        //Deleting Folder: parentFolder and its contents
        //Deleting Folder: testFolder1 and its contents
        //Docx file deleted: testDocxFile1.docx
        //Jpeg file deleted: testJPEGFile1.jpg
        //Text file deleted: testTextFile1.txt
        //Deleting Folder: testFolder2 and its contents
        //Docx file deleted: testDocxFile2.docx
        //Jpeg file deleted: testJPEGFile2.jpg
        //Text file deleted: testTextFile2.txt


    }
}
