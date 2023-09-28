package behavioralPatterns.chainOfResponsibility;

public class HandlerTwo extends Handler{
    @Override
    public void handleRequest(Request request) {
        if (request.getAmount() > 50 && request.getAmount() <= 100) {
            System.out.println("Amount > 50 && < 100: Handled by handlerTwo");
        } else {
            this.getSuccessor().handleRequest(request);
        }
    }
}
