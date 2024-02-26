/*Day 9 coding Statement : Write a program to find Number of digits in an integer
Description:
Take an integer as the input from the user and then calculate the number of digits in the given input and print it as the output.8*/


import java.util.Scanner;
public class statement9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an integer(to find Number of digits in an integer) : ");
        int number = obj.nextInt();
        int count=0;
        while (number>0) {
            number/=10; 
            count++;           
        }
        System.out.println(count);



        obj.close();
    }

    
}
/*  Output of a program

Enter an integer(to find Number of digits in an integer) : 22224567
8
Enter an integer(to find Number of digits in an integer) : 1
1*/