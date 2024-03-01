// Day 13 coding Statement:  Write a program to find Sum of N natural numbers
// Description
// Get the input from the user for the value of n and then find the sum of first n natural numbers.

import java.util.Scanner;

public class statement13 {
   
        public static void main(String[] args) {

         Scanner obj = new Scanner(System.in);
        System.out.print("Enter an number  : ");
        int number = obj.nextInt();
        int sum=0;
        while(number>0){
            int rem=number%10;
            sum+=rem;
            number=number/10;
        }
        System.out.println("sum of digits : "+sum);





        obj.close();
        }
    
}

/* 
Enter an number  : 12345
sum of digits : 15

Enter an number  : 123
sum of digits : 6
*/
