package Q1;

import java.util.Scanner;

public class MyMethods {
    public static void main(String[] args) {
        // Declaration of Variables and Objects
        int labNum = 3, question = 1, m =0;
        double inches = 0, cm =0;

        Scanner scanner = new Scanner(System.in);
        String desc = "This program calls 3 methods in the driver method.\n" +
                "The myHeader method prints out the programmer and program information,\n" +
                "The inchesToCentimeters method prompts the user to input a value\n" +
                "and then the method will take the input and \n" +
                "then converts and prints the converted value in centimeters and\n" +
                "meters with printf. The myFooter then prints out 'Signing off from Question 1\n" +
                "- Michael";


        myHeader(labNum, question, desc);
        System.out.print("Enter your height in inches: ");
        inches = scanner.nextDouble();
        cm = inchesToCentimetres(inches);
        m = (int) cm/100;
        System.out.printf("%.2f inches = %.2f cm\n", inches, cm);
        System.out.printf("%.2f cm = %1d m %.2f cm\n", cm, m, cm%100);
        System.out.println();
        myFooter(3, "Michael");
    }
    public static void myHeader(int labNum, int questionNum, String description) {
        // Prints out programmer information with the method println();
        System.out.println("****************************************************");
        System.out.println("Full Name: Michael Zhang 251350700");
        System.out.println("Lab Exercise: " + labNum + ", Question: " + questionNum);
        System.out.println("Program Description: " + description);
        System.out.println("****************************************************");
        System.out.println();
    }
    public static void myFooter(int question, String fName) {
        System.out.printf("*** Signing off from Question %d - %s ***", question, fName);
    }
    public static double inchesToCentimetres(double inches) {
        // Declaration of variables
        double cm = 0;
        final double INCH_CONST = 2.54;
        cm = inches * INCH_CONST;

        return cm;
    }
}
