package com.company;

import java.util.*;

public class Functions_ass {


    public static void main(String args[]) {
        String choice2;

        do {

            System.out.println("Welcome to the calculator" + "\n" + "1.Addition" + "\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n" +
                    "Enter your choice(1-4)");

            Scanner input1 = new Scanner(System.in);

            int choice = input1.nextInt();

            double result = Calculator(choice);

            System.out.println("The result value is " + result);

            System.out.println("Thankyou Do you want to try again? Y/N");
            choice2 = input1.next();
        }

        while(choice2.equals("Y"));
        

    }






    public static double Calculator(int choice) {
        double result = SwitchCase(choice);

        return result;


    }

    public static double SwitchCase(int choice) {

        System.out.println("Enter the numbers");
        Scanner input1 = new Scanner(System.in);
        double number1 = input1.nextDouble();
        double number2 = input1.nextDouble();
        double result = 0.0;
        switch (choice) {//Switch case to call each function based on the choice
            case 1:
                result = number1 + number2;
                break;


            case 2:
                result = number1 - number2;
                break;


            case 3:
                result = number1 * number2;
                break;


            case 4:
                result = number1 / number2;
                break;


            default:
                System.out.println("Invalid option");
                break;

        }

        return result;

    }

}


