package behavioralPatterns.memento;

import java.util.LinkedList;
import java.util.List;

public class History {
    private List<DocumentState> documentStates = new LinkedList<>();

    public void push(DocumentState documentState) {
        documentStates.add(documentState);
    }

    public DocumentState undo() {
        var lastIndex = documentStates.size()-1;
        if (lastIndex != 0) {
            var state = documentStates.get(lastIndex);
            documentStates.remove(state);
            return documentStates.get(documentStates.size() - 1);
        } else {
            System.out.println("Undo not possible");
            return null;
        }
    }
}
