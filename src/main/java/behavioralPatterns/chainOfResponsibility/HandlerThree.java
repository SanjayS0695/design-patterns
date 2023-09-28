package behavioralPatterns.chainOfResponsibility;

public class HandlerThree extends Handler{
    @Override
    public void handleRequest(Request request) {
        if (request.getAmount() > 0 && request.getAmount() <= 50) {
            System.out.println("Amount > 0 && < 50: Handled by handlerThree");
        } else {
            System.out.println("No one to handle when amount is less than 0");
        }
    }
}
