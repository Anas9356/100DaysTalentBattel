/*Day 11 coding Statement:  Write a program to find Fibonacci series up to n

Description:
Fibonacci series is a special series where nth term is the sum of previous two terms in the series. The series starts with 0 and 1 as the first and second term of the series respectively.
Here you need to get the value for nth term from user and then print Fibonacci series containing n terms.*/
import java.util.Scanner;
public class statement11 {
    static int fibo(int n){

        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo( n-2);

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an number  : ");
        int number = obj.nextInt();
        
        for(int i=0;i<number;i++){
            System.out.print(fibo(i)+" ");
        }
        
        obj.close();
    }
}
/*
Output of a program 
Enter an number  : 10
0 1 1 2 3 5 8 13 21 34
Enter an number  : 5
0 1 1 2 3
 */