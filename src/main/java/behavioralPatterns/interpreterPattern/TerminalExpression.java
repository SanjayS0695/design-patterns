package behavioralPatterns.interpreterPattern;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression{

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (this.data != null) {
            var tokens = new StringTokenizer(context);
            while (tokens.hasMoreTokens()) {
                String token = tokens.nextToken();
                if (token.equals(this.data)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
