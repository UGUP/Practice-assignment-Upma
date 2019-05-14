package com.company;

public class AssignmentFunctionsUpma {
    
    public static void main(String[] args)
    {
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();
        int number2 = input1.nextInt();

        int sum = 0;

        sum = functions(number1,number2);

        System.out.println("The sum of number "+number1+" and "+number2+" is "+sum);


    }


    public static int functions(int number1, int number2) {

        int sum = 0;
        sum = number1 + number2;

        return (sum);


    }
        
        
}   
        
        
        
        
    
