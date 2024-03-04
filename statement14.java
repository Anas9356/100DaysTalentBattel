// Write a program to reverse a given number
// Description
// Get an input from the user and the print the reverse of the given number as the output

import java.util.Scanner;

public class statement14 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an number  : ");
        int number = obj.nextInt();
        int rem=0;

            while(number>0){
                rem+=number%10;
                number/=10;
                if(number>0){                    
                    rem*=10;
                }


            }
        
        System.out.println(rem);


        obj.close();
    }
    
}
/*
 Enter an number  : 123
321
Enter an number  : 543
345
Enter an number  : 345
543
 */
