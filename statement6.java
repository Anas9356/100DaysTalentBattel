// Day 6 coding Statement:  Write a program to find the Quadrants in which coordinates lie
// Get the value of x and y coordinates as input from the user and check in which quadrant the point lies and print it.

import java.util.Scanner;

public class statement6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter x and y : ");
        int x = obj.nextInt();
        int y = obj.nextInt();
        System.out.println("You enter x is "+x+  " and y is " +y);
        if (x>0 && y>0){
            System.out.println("This point lies in first quadrant.");
        }
        else if (x<0 && y>0){
            System.out.println("This point lies in second quadrant.");
        }
        else if (x<0 && y<0){
            System.out.println("This point lies in third quadrant.");
        }
        else if (x>0 && y<0){
            System.out.println("This point lies in fourth quadrant.");
        }

        obj.close();
    }
}

/*  Out put of the program 
Enter x and y : 
2 2
You enter x is 2 and y is 2
This point lies in first quadrant.


Enter x and y : 
-2 2
You enter x is -2 and y is 2
This point lies in second quadrant.

Enter x and y : 
-2 -2
You enter x is -2 and y is -2
This point lies in third quadrant.

Enter x and y : 
2 -2
You enter x is 2 and y is -2
This point lies in fourth quadrant.
*/