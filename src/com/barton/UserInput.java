package com.barton;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        int count, num1 = 0, num2 = 1;
        System.out.println("How many numbers do you want? ");
        Scanner scan = new Scanner(System.in);
        count = scan.nextInt();
        scan.close();
        System.out.println("Fibonacci Series of " + count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.println(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}
