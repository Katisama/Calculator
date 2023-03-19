package de.kati.calculator;



import java.util.Scanner;

public class Calculator {
    private final Addition addition;

    public Calculator(){
        addition = new Addition();
    }

    public void start(){
        double result = addition.calculate(1, 2);
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte erste Zahl eingeben:");
        float input1 = scanner.nextFloat();
        System.out.println("Bitte zweite Zahl eingeben:");
        float input2 = scanner.nextFloat();
        double result2 = addition.calculate(new float[]{input1, input2});
        System.out.println(result2);
    }
}
