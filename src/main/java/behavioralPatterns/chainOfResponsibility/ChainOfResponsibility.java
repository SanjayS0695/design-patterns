package behavioralPatterns.chainOfResponsibility;

public class ChainOfResponsibility {

    public static void main(String[] args) {
        HandlerOne handlerOne = new HandlerOne();
        HandlerTwo handlerTwo = new HandlerTwo();
        HandlerThree handlerThree = new HandlerThree();

        handlerOne.setSuccessor(handlerTwo);
        handlerTwo.setSuccessor(handlerThree);

        handlerOne.handleRequest(new Request(-1));
        // No one to handle when amount is less than 0
        handlerOne.handleRequest(new Request(10));
        //Amount > 0 && < 50: Handled by handlerThree
        handlerOne.handleRequest(new Request(60));
        //Amount > 50 && < 100: Handled by handlerTwo
        handlerOne.handleRequest(new Request(110));
        //Amount > 100: Handled by handlerOne
    }
}
