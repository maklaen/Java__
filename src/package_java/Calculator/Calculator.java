package package_java.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static double calculate(double a, char operator, String b) {
        switch (operator) {
            case '+':
                a += Double.parseDouble(b);
                break;
            case '-':
                a -= Double.parseDouble(b);
                break;
            case '*':
                a *= Double.parseDouble(b);
                break;
            case '/':
                a /= Double.parseDouble(b);
                break;
        }
        return a;
    }

    private static double calculateTokens(String[] tokens) {
        char operator = 0;
        double result = 0;

        for (String token : tokens) {
            if (isOperator(token.charAt(0))) {
                operator = token.charAt(0);
            }
            else {
                if (operator == 0) {
                    result = Double.parseDouble(token);
                }
                else {
                    result = calculate(result, operator, token);
                }
            }
        }
        return result;
    }

    public static double calculateWithRegex(String expression) {
        String[] tokens = expression.split("(?<=[^\\d.])(?=\\d)|(?<=\\d)(?=[^\\d.])");
        return calculateTokens(tokens);
    }

    public static double calculateWithoutRegex(String expression) {

        char[] exp = expression.toCharArray();
        List<String> tokens = new ArrayList<>();
        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i <= exp.length - 1;) {
            if (isOperator(exp[i])) {
                tokens.add(String.valueOf(exp[i]));
                i++;
            }
            else {
                while (i <= exp.length - 1 && !isOperator(exp[i])) {
                    buffer.append(exp[i]);
                    i++;
                }
                tokens.add(buffer.toString());
                buffer.delete(0, buffer.length());
            }
        }

        return calculateTokens(tokens.toArray(new String[0]));
    }

    public static void main(String[] args) {
        String expression = "-21+75-0.16/2+0.5*6";
        double resultRegex = calculateWithRegex(expression);
        double result = calculateWithoutRegex(expression);

        System.out.println("Результат с использованием regex:");
        System.out.println(expression + " = " + resultRegex);

        System.out.println("Результат без использования regex:");
        System.out.println(expression + " = " + result);
    }
}
