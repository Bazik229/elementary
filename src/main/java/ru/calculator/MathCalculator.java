package ru.calculator;

import ru.math.MathFunction;


public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double divisionAndSubtraction(double first, double second) {
        return MathFunction.division(first, second)
                + MathFunction.subtraction(first, second);
    }

    public static double sumAndMultiplyAndDivisionAndSubtraction(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.division(first, second)
                + MathFunction.subtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + divisionAndSubtraction(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndDivisionAndSubtraction(10, 20));
    }

}
