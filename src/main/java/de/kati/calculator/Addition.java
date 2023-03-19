package de.kati.calculator;

public class Addition {

    /**
     *
     * @param a
     * @param b
     * @return summed result
     */
    public double calculate(float a, float b) {
        return a + b;

    }

    /**
     *
     * @param numbers
     * @return
     *
     * addition of float numbers list
     */
    public double calculate(float[] numbers) {
        double result = 0;
        for (float number : numbers) {
            result = result + number;
        }

        return result;
    }
}
