package de.kati.calculator;

public class Addition {
    public double calculate(float a, float b) {
        return a + b;

    }
    public double calculate(float[] numbers) {
        double result = 0;
        for (float number : numbers) {
            result = result + number;
        }

        return result;
    }
}
