package ru.calculator;

import static ru.calculator.MathFunc.func1;

public class Calculator {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        int result3 = func1(100);
        System.out.println(result3);
    }
}
