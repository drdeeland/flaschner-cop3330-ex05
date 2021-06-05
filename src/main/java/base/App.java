/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String input1 = myApp.numberInput1();
        String input2 = myApp.numberInput2();

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        int sum = myApp.numAddition(num1, num2);
        int difference = myApp.numSubtraction(num1, num2);
        int product = myApp.numProduct(num1, num2);
        int quotient = myApp.numDivision(num1, num2);

        myApp.numberOperations(num1, num2, sum, difference, product, quotient);
    }

    public String numberInput1() {
        System.out.print("What is the first number? ");
        return input.nextLine();
    }

    public String numberInput2() {
        System.out.print("What is the second number? ");
        return input.nextLine();
    }

    public int numAddition(int num1, int num2) {
        return num1 + num2;
    }

    public int numSubtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int numProduct(int num1, int num2) {
        return num1 * num2;
    }

    public int numDivision(int num1, int num2) {
        return num1 / num2;
    }

    public void numberOperations(int num1, int num2, int sum, int difference, int product, int quotient) {
        System.out.printf("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d",
                num1, num2, sum, num1, num2, difference, num1, num2, product, num1, num2, quotient);
    }
}
