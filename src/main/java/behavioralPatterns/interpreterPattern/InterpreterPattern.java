package behavioralPatterns.interpreterPattern;

import java.util.ArrayList;
import java.util.List;

public class InterpreterPattern  {

    static Expression buildInterpreter(String context) {
        String[] groups = context.split("[)][|][(]");
        Expression expression = null;
        for (String group: groups) {
            if (group.contains("&")) {
                var string = group.replaceAll("[()]", "");
                String[] subGroups = string.split("&");
                expression = createAndExpression(0, subGroups);
            } else if (group.contains("|")) {
                var string = group.replaceAll("[()]", "");
                String[] subGroups = string.split("\\|");
                expression = createOrExpression(0, subGroups);
            }
        }
        return expression;
//
//        var expressionOne = new TerminalExpression("One");
//        var expressionTwo = new TerminalExpression("Two");
//
//        return new OrExpression(expressionOne, expressionTwo);
    }

    static AndExpression createAndExpression(int i, String[] subGroups) {
        if (i < subGroups.length) {
            return new AndExpression(new TerminalExpression(subGroups[i]), createAndExpression(++i, subGroups));
        }
        return null;
    }

    static OrExpression createOrExpression(int i, String[] subGroups) {
        if (i < subGroups.length) {
            return new OrExpression(new TerminalExpression(subGroups[i]), createOrExpression(++i, subGroups));
        }
        return null;
    }

    public static void main(String[] args) {
        var expression = InterpreterPattern.buildInterpreter("(One|Two)");
        System.out.println(expression.interpret("Sanjay is Three"));
    }
}
