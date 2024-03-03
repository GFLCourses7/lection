package service;

public class Calculator {
    private MathUtils mathUtils;

    public Calculator(MathUtils mathUtils) {
        this.mathUtils = mathUtils;
    }

    public int calculate(int a, int b, char operator) {
        if (operator == '+') {
            return mathUtils.add(a, b);
        } else if (operator == '-') {
            return mathUtils.subtract(a, b);
        } else if (operator == '*') {
            return mathUtils.multiply(a, b);
        } else if (operator == '/') {
            return mathUtils.divide(a, b);
        } else {
            throw new IllegalArgumentException("Невідомий оператор: " + operator);
        }
    }
}

