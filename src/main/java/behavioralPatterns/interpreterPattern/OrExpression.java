package behavioralPatterns.interpreterPattern;

public class OrExpression implements Expression{
    private Expression expressionOne = null;
    private Expression expressionTwo = null;

    public OrExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }
    @Override
    public boolean interpret(String context) {
        if (null != expressionOne && null != expressionTwo) {
            return expressionOne.interpret(context) || expressionTwo.interpret(context);
        } else if (null != expressionOne) {
            return expressionOne.interpret(context);
        } else {
            expressionTwo.interpret(context);
        }
        return false;
    }
}
