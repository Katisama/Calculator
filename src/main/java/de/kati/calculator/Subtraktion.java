package de.kati.calculator;

public class Subtraktion {

    public double calculate(float[] values) {
        double result = 0;
        for (float value : values) {
            result -= value;
        }


        return result;
    }

    public double calculate(float value1, float value2) {
        return value1 - value2;
    }



}
