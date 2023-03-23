package de.kati.calculator;



import java.util.Scanner;

public class Calculator {
    private final Addition addition = new Addition();
    private final Subtraktion subtraktion = new Subtraktion();
    private final Scanner scanner = new Scanner(System.in);


    public void start(){
        // User Input
        // 1. Addition
        // 2. Subtraktion
        // 3. Exit
        System.out.println("1. Addition");
        System.out.println("2. Subtraktion");
        System.out.println("3. Exit");
        System.out.println("Please choose an option:");

        int option = scanner.nextInt();

        switch (option) {
            case 1 -> addition();
            case 2 -> subtraktion();
            case 3 -> System.exit(0);
            default -> System.out.println("Invalid input");
        }
    }

    private void subtraktion() {
        // take input and subtract
        // print result
        System.out.println("Bitte erste Zahl eingeben:");

        float input1 = scanner.nextFloat();
        System.out.println("Bitte zweite Zahl eingeben:");
        float input2 = scanner.nextFloat();
        double result2 = subtraktion.calculate(input1, input2);
        System.out.println(result2);
    }

    private void addition() {

        // take input and add
        // print result
        System.out.println("Bitte erste Zahl eingeben:");
        float input1 = scanner.nextFloat();
        System.out.println("Bitte zweite Zahl eingeben:");
        float input2 = scanner.nextFloat();
        double result2 = addition.calculate(new float[]{input1, input2});
        System.out.println(result2);
    }

}
