/*Day 8 coding Statement:  Write a program to find roots of a quadratic equation
Description:
Get the values of a, b and c (coefficients of quadratic equation) as input from the user and calculate the roots and print as the output.
*/
import java.util.Scanner;

public class statement8 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the values of a, b and c (coefficients of quadratic equation): ");
        double a = obj.nextDouble();
        double b = obj.nextDouble();
        double c = obj.nextDouble();
        double root1, root2;
        double determinant = b * b - 4 * a * c;
        if(determinant>0){
            System.out.println("The Roots are real and distinct");
            root1=(-b+Math.sqrt(determinant)/(2*a));
            root2=(-b-Math.sqrt(determinant)/(2*a));
            System.out.println("Root1= "+root1%.2f+" Root2= "+root2%.2f);
            
        }
        else if(determinant==0){
            System.out.println("The Roots are real and equal");
            root1=root2=-b/(2*a);
            System.out.println("Root1= Root2= "+root1%.2f);
            
        }
        else{
            System.out.println("The Roots are complex and distinct");
            double real=-b/(2*a);
            double imaginary=Math.sqrt(-determinant)/(2*a);
            System.out.format("Root1= %.2f+i%.2f    Root2= %.2f-i%.2f", real,imaginary,real,imaginary);

        }



        obj.close();
    }
}

/* The output of the program
Enter the values of a, b and c (coefficients of quadratic equation): 
1 5 2
The Roots are real and distinct
Root1= -0.13844714546791836 Root2= -0.06155270850070238

Enter the values of a, b and c (coefficients of quadratic equation): 
1 -2 1
The Roots are real and equal
Root1= Root2= 0.19999998807907104

Enter the values of a, b and c (coefficients of quadratic equation): 
1 2 3
The Roots are complex and distinct
Root1= -1.00+i1.41    Root2= -1.00-i1.41
 */