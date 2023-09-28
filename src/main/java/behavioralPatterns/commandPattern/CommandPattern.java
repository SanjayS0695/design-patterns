package behavioralPatterns.commandPattern;

public class CommandPattern {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();

        Command command = new ExecuteCommand(receiver);

        invoker.execute(command);
        //Task executed by the receiver
        System.out.println("Status of receiver: " + receiver.isExecuted());
        //Status of receiver: true
        invoker.undo(command);
        //Task reverted by the receiver
        System.out.println("Status of receiver: " + receiver.isExecuted());
        //Status of receiver: false
    }
}
