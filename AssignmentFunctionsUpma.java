package com.company;

import java.util.*;

public class AssignmentFunctionsUpma {


    public static void main(String args[])

    {
        //double number1=0.0,number2=0.0;//Declaration of variables

        //** I changed variable 'a' to 'result' and remove arguments from mainFunction()
        //double a=mainFunction(number1,number2);
        double result = mainFunction(); //Calling the function after operation


        System.out.println("The return value is "+result);//Printing the output
    }

    public static double mainFunction() {///creating the main function which is calling all the operation functions, it accepts no arguments and returns result;

        int choice = 0;
        double number1, number2, result = 0;

        System.out.println("Welcome to the calculator" + "\n" + "1.Addition" + "\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n" +
                "Enter your choice(1-4)");

        Scanner input1 = new Scanner(System.in);

        choice = input1.nextInt();

        System.out.println("Enter the numbers");

        number1 = input1.nextDouble();
        number2 = input1.nextDouble();


        switch (choice) {//Switch case to call each function based on the choice
            case 1:
                result = sum(number1, number2);
                //return (sum);//this is to return the function value to a single variable choice.
                //** no need to return result for each case, you can do it once at the end of the function body.
                break; //**use break after every case statement or else the following cases will also get invoked.

            case 2:
                result = sub(number1, number2);
                //return (sub);
                break;


            case 3:
                result = mul(number1, number2);
                //return (mul);
                break;


            case 4:
                result = div(number1, number2);
                //return (div);
                break;



            default:
                System.out.println("Invalid option");

        }

        return result; //** sends back variable result from mainFunction() to main()

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
