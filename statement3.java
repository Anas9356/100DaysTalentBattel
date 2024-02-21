import java.util.*;
public class statement3 {
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter a char: ");
        char a=obj.next().charAt(0);
        System.out.println("You entered: "+a);
        int b=a;
        System.out.println("ASCIIn value of "+a+" is "+b);

        obj.close();

    }    
}
// OutPut of a program
// Enter a char: 
// a
// You entered: a
// ASCIIn value of a is 97

// Enter a char: 
// z
// You entered: z
// ASCIIn value of z is 122