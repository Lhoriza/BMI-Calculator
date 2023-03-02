package com.bebe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Your BMI category is Underweight.");
        } else if (bmi < 25) {
            System.out.println("Your BMI category is Normal weight.");
        } else if (bmi < 30) {
            System.out.println("Your BMI category is Overweight.");
        } else {
            System.out.println("Your BMI category is Obese.");
        }

        scanner.close();
    }
}
