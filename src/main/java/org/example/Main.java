package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    // Using log4j Logger
    private static final Logger logger = LogManager.getLogger(Main.class);

    // Simple calculator functionality
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                logger.info("Performing addition1");
                return num1 + num2;
            case '-':
                logger.info("Performing subtraction");
                return num1 - num2;
            case '*':
                logger.info("Performing multiplication");
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    logger.info("Performing division");
                    return num1 / num2;
                } else {
                    logger.error("Division by zero");
                    throw new ArithmeticException("Cannot divide by zero");
                }
            default:
                logger.warn("Invalid operator");
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Start of Execution");

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        try {
            double result = calculate(num1, num2, operator);
            System.out.println("Result: " + result);
            logger.info("Calculation successful: " + result);
        } catch (Exception e) {
            logger.error("Error occurred: " + e.getMessage());
        }

        logger.info("End of Execution");
    }
}
