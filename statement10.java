/*Day 10 coding Statement:  Write a program to find Factorial of a number
Description:
Get a number from user for which you need to fin the factorial, then calculate the factorial and give it as the output.*/

import java.util.Scanner;

public class statemnet10 {
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
        System.out.print("Enter an integer(to find Factorial ) : ");
        int number = obj.nextInt();
        int factorial=1;

        for(int i =number ; i>0;i--){
            factorial*=i;
            
        }
        System.out.println("Factorial is "+factorial);

        obj.close();
    }
    
}
/* 
 Enter an integer(to find Factorial ) : 3
 Factorial is 6
 Enter an integer(to find Factorial ) : 5
 Factorial is 120
*/
