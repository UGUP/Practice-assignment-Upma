package com.company;

public class AssignmentFunctionsUpma {
    
    public static void main(String[] args)
    {
        
        {
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();
        int number2 = input1.nextInt();
        sum(number1,number2);
        sub(number1,number2);
        div(number1,number2);
        mul(number1,number2);


    }


       public static void sum(int number1,int number2)

        {
            int sum = 0;
            sum = number1 + number2;

            System.out.println("The sum of number " + number1 + " and " + number2 + " is " + sum);

        }

    public static void div(int number1,int number2)

    {     double div = 0;

        div = (double)number1 / (double)number2;

        System.out.println("The division of number "+number1+" and "+number2+" is "+div);
    }


    public static void mul(int number1,int number2)

    {
        int mul = 0;

        mul = number1 * number2;
        System.out.println("The multiplicatin of number "+number1+" and "+number2+" is "+mul);
    }

    public static void sub(int number1,int number2)

    {
        int sub = 0;


        sub = Math.abs(number1 - number2);
        System.out.println("The subtraction of number "+number1+" and "+number2+" is "+sub);

    }




    }

        
