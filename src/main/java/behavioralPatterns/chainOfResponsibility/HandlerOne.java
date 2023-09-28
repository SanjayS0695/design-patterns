package behavioralPatterns.chainOfResponsibility;

public class HandlerOne extends Handler{
    @Override
    public void handleRequest(Request request) {
        if (request.getAmount() > 100) {
            System.out.println("Amount > 100: Handled by handlerOne");
        } else {
            this.getSuccessor().handleRequest(request);
        }
    }
}
