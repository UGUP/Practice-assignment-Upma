package com.company;

public class AssignmentFunctionsUpma {
    
   int choice=0,number1=0,number2=0;

        System.out.println("Welcome to the calculator"+"\n"+"1.Addition"+"\n"+"2.Subtraction"+"\n"+"3.Subtraction"+"\n"+"4.Division"+"\n"+
                "Enter your choice(1-4)");

        Scanner input1 = new Scanner(System.in);

        choice=input1.nextInt();

        System.out.println("Enter the numbers");

         number1 = input1.nextInt();
         number2 = input1.nextInt();


        switch(choice)

        {
            case 1:
                sum(number1,number2);
                break;

            case 2:
                sub(number1,number2);
                break;

            case 3:
                mul(number1,number2);
                break;

            case 4:
                div(number1,number2);
                break;

            default:
                System.out.println("Invalid option");

        }

    }


       public static void sum(int number1,int number2)

        {
            int sum = 0;
            sum = number1 + number2;

            System.out.println("The sum of number " + number1 + " and " + number2 + " is " + sum);

        }

    public static void div(double number1,double number2)

    {     double div = 0;

        div = number1 / number2;

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

        
