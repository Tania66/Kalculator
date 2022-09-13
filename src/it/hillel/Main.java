package it.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int addition = number1 + number2;
        int multiplication = number1 * number2;
        int subtraction = number1 - number2;
        int division = number1 / number2;
        System.out.println(addition);
    }
}
