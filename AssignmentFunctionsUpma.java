package com.company;

import java.util.*;

public class Functions_ass {  //Creation of the Class


    public static void main(String args[]) {//Main Function
        String choice2;//Declaration of variable to call the Calculator function again

        do {//Loop to run the Calculator function again

            System.out.println("Welcome to the calculator" + "\n" + "1.Addition" + "\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n" +
                    "Enter your choice(1-4)");

            Scanner input1 = new Scanner(System.in);

            int choice = input1.nextInt();//Declaring the variable to input the operation to be performed

            double result = Calculator(choice);//Calling the calculator function

            System.out.println("The result value is " + result);

            System.out.println("Thankyou Do you want to try again? Y/N");
            choice2 = input1.next();
        }

        while(choice2.equals("Y"));//loop to run the calculator function again


    }






    public static double Calculator(int choice) {


        double number1=0.0,number2=0.0;

       try {//Exception handling to handle the exception of invalid input of numbers
           System.out.println("Enter the numbers");
           Scanner input1 = new Scanner(System.in);
            number1 = input1.nextDouble();
            number2 = input1.nextDouble();

       }

       catch(Exception e )//exception handled

       {
           System.out.println("Please enter integer values");


       }


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


