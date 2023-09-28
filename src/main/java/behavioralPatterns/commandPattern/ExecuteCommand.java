package behavioralPatterns.commandPattern;

//concreteCommand
public class ExecuteCommand implements Command{

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    private Receiver receiver;

    public ExecuteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.executeTask();
    }

    @Override
    public void undo() {
        this.receiver.undoTask();
    }
}
