package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    // Using log4j Logger
    private static final Logger logger = LogManager.getLogger(Main.class);

    // Method to calculate the square root
    public static double squareRoot(double num) {
        logger.info("Calculating square root of " + num);
        return Math.sqrt(num);
    }

    // Method to calculate the factorial1
    public static long factorial(int num) {
        if (num < 0) {
            logger.error("Factorial of negative number: " + num);
            throw new IllegalArgumentException("Cannot calculate factorial of negative number");
        }
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        logger.info("Calculating factorial of " + num);
        return result;
    }

    // Method to calculate natural logarithm
    public static double naturalLog(double num) {
        if (num <= 0) {
            logger.error("Natural logarithm of non-positive number: " + num);
            throw new IllegalArgumentException("Cannot calculate natural logarithm of non-positive number");
        }
        logger.info("Calculating natural logarithm of " + num);
        return Math.log(num);
    }

    // Method to calculate power
    public static double power(double base, double exponent) {
        logger.info("Calculating " + base + " raised to the power of " + exponent);
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        logger.info("Start of Execution");

        do {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power (x^y)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter a number: ");
                        double sqrtNum = scanner.nextDouble();
                        double sqrtResult = squareRoot(sqrtNum);
                        System.out.println("Result: √" + sqrtNum + " = " + sqrtResult);
                        break;

                    case 2:
                        System.out.print("Enter a non-negative integer: ");
                        int factNum = scanner.nextInt();
                        long factResult = factorial(factNum);
                        System.out.println("Result: " + factNum + "! = " + factResult);
                        break;

                    case 3:
                        System.out.print("Enter a positive number: ");
                        double lnNum = scanner.nextDouble();
                        double lnResult = naturalLog(lnNum);
                        System.out.println("Result: ln(" + lnNum + ") = " + lnResult);
                        break;

                    case 4:
                        System.out.print("Enter base (x): ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter exponent (y): ");
                        double exponent = scanner.nextDouble();
                        double powerResult = power(base, exponent);
                        System.out.println("Result: " + base + "^" + exponent + " = " + powerResult);
                        break;

                    case 5:
                        logger.info("Exiting the program.");
                        break;

                    default:
                        logger.warn("Invalid choice: " + choice);
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                logger.error("Error occurred: " + e.getMessage());
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 5);

        logger.info("End of Execution");
        scanner.close();
    }
}