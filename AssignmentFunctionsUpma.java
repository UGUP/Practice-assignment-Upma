package com.company;

import java.util.*;

public class Functions_ass {  //Creation of the Class


    public static void main(String args[]) {//Main Function


        String choice2 = "Y";
        int choice;
        double result;//Declaration of variable o call the Calculator function again

        do {//Loop to run the Calculator function again

            try {//handle exception for the choice 
                System.out.println("Welcome to the calculator" + "\n" + "1.Addition" + "\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division" + "\n" +
                        "Enter your choice(1-4)");

                Scanner input1 = new Scanner(System.in);

                choice = input1.nextInt();//Declaring the variable to input the operation to be performed

                result = Calculator(choice);
                //Calling the calculator function


                System.out.println("The result value is " + result);


            } catch (Exception e) {//Exception handled
                System.out.println("Enter only integer values for your Choice");

            }


try {//Exception not working 
    System.out.println("Thank you Do you want to try again? Y/N");
    Scanner input2 = new Scanner(System.in);
    choice2 = input2.next();

         }
catch(Exception e)//not getting handled as of now 

{
    System.out.println("Enter correct value of choice2");
}
        }



        while (choice2.equals("Y")) ;//loop to run the calculator function again

        }






    public static double Calculator(int choice) {


        double number1 = 0.0, number2 = 0.0; double result = 0.0;

        try {//Exception handling to handle the exception of invalid output for numbers
            System.out.println("Enter the numbers");
            Scanner input1 = new Scanner(System.in);
            number1 = input1.nextDouble();
            number2 = input1.nextDouble();

           }

        catch(Exception e)
        {
            System.out.println("enter ony interger values for numbers");
        }


                switch (choice) {//Switch case to call each function based on the choice


                    case 1:
                        result = number1 + number2;
                        break;


                    case 2:
                        result = Math.abs(number1 - number2);
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




