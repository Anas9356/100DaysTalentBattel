// Day 5 coding Statement:  Write a program to identify if the number is even or odd
// Description
// Get a number as input from the user and check whether the given number is odd or even


import java.util.Scanner;

public class statement5 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=obj.nextInt();
        if(number%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is odd");
        }
        obj.close();
    }
}

/*the output 
Enter the number
11
The number is odd

Enter the number
10
The number is Even
 */
