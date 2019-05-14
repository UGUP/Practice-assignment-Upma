package com.company;

import java.util.*;

public class Functions_ass {


    public static void main(String args[])

    {
        double number1=0.0,number2=0.0;//Declaration of variables

        double a=mainFunction(number1,number2);//Calling the function after operation

        System.out.println("The return value is "+a);//Printing the output
    }

    public static double mainFunction(double number1,double number2) {///creating the main function which is calling all the operation functions

        int choice = 0;
        number1 = 0.0;
        number2 = 0.0;

        System.out.println("Welcome to the calculator" + "\n" + "1.Addition" + "\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n" +
                "Enter your choice(1-4)");

        Scanner input1 = new Scanner(System.in);

        choice = input1.nextInt();

        System.out.println("Enter the numbers");

        number1 = input1.nextDouble();
        number2 = input1.nextDouble();


        switch (choice) {//Switch case to call each function based on the choice 
            case 1:
                double sum = sum(number1, number2);
               return (sum);//this is to return the function value to a single variable choice.

            case 2:
                double sub = sub(number1, number2);
                return (sub);


            case 3:
                double mul = mul(number1, number2);
                return (mul);


            case 4:
                double div = div(number1, number2);
                return (div);



            default:
                System.out.println("Invalid option");

        }

        return(choice);

    }



       public static double sum(double number1,double number2)//sum function created

        {
            double sum = 0;
            sum = number1 + number2;
            return(sum);

        }

    public static double div(double number1,double number2)//div function created

    {     double div = 0;

        div = number1 / number2;

        return(div);


    }


    public static double mul(double number1,double number2)//multiplication function created

    {
        double mul = 0;

        mul = number1 * number2;

        return(mul);
    }

    public static double sub(double number1,double number2)//sub function created

    {
        double sub = 0;


        sub = Math.abs(number1 - number2);
        return(sub);

    }




    }
