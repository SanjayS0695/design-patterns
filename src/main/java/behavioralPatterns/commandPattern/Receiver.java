package behavioralPatterns.commandPattern;

public class Receiver {

    private boolean isExecuted;

    public void executeTask() {
        System.out.println("Task executed by the receiver");
        setExecuted(true);
    }

    public void undoTask() {
        System.out.println("Task reverted by the receiver");
        setExecuted(false);
    }

    public boolean isExecuted() {
        return isExecuted;
    }

    public void setExecuted(boolean executed) {
        isExecuted = executed;
    }
}
