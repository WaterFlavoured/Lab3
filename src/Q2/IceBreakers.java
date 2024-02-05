package Q2;
import Q1.MyMethods;

import java.util.Scanner;

public class IceBreakers {
    public static void main(String[] args) {
        // Declaration of Variables and Objects
        Scanner s = new Scanner(System.in);
        double fahr = 0, kel = 0;
        String desc = "This program will prompt users to enter\n" +
                "multiple doubles in the form of fahrenheit and kelvin\n" +
                "and outputting multiples lines of conversions using methods";

        MyMethods.myHeader(3, 2, desc);
        System.out.print("What is the outdoor temperature now? ");
        kel = s.nextDouble();
        System.out.printf("\tI know you're used to Fahrenheit scale. %.2f deg-K is %.2f deg-F.\n", kel, kelvinToFahrenheit(kel));
        System.out.print("I am cold! What is the indoor temperature? ");
        kel = s.nextDouble();
        System.out.printf("\t%.2f deg-K is %.2f deg-F.\n", kel, kelvinToFahrenheit(kel));
        System.out.println("I see. Would you crank up the temperature?");
        System.out.print("\tOk I will! What temperature should I set the thermostat to? ");
        fahr = s.nextDouble();
        System.out.printf("Oh, you mean %.2f deg Fahrenheit! Here you go.\n", fahr);
        System.out.printf("By the way, %.2f deg-F is %.2f deg-K.\n", fahr, fahrenheitToKelvin(fahr));
        System.out.println("Thank you! It is very nice of you.");
        System.out.println();
        MyMethods.myFooter(2,"Michael");

    }

    public static double kelvinToFahrenheit(double kelvin) {
        double fahrenheit = 0;
        fahrenheit = 9 * ((kelvin - 273) / 5.0) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        double kelvin = 0;
        kelvin = 5 * ((fahrenheit - 32) / 9.0) +273;
        return kelvin;
    }
}
