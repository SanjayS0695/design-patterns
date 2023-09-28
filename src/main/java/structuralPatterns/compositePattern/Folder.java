package structuralPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {

    private String folderName;

    public Folder(String folderName) {
        this.folderName = folderName;
        Memory.MEMORY.put(this.folderName, this);
    }

    public List<Component> getComponents() {
        return components;
    }

    List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void delete() {
        System.out.println(String.format("Deleting Folder: %s and its contents", this.folderName));
        for (Component component: components) {
            component.delete();
        }
        Memory.MEMORY.remove(this.folderName);
        RecycleBin.DELETED_COMPONENTS.add(this);
        components = List.of();
    }

    @Override
    public void copy() {
        System.out.println(String.format("Copying Folder: %s and its contents", this.folderName));
        for (Component component: components) {
            component.copy();
        }
    }
}
