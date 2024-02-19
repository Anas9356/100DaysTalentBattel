
import java.util.*;

class statement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a character: ");
        // reading a character
        String c = sc.next();
        System.out.println("You have entered " + c);
        //compair string        
        boolean a=c.equals("a");
        int b=c.compareTo("a");
        boolean e=c.equals("z");
        int d=c.compareTo("z");
        boolean f=c.equals("A");
        int g=c.compareTo("A");
        boolean h=c.equals("Z");
        int i=c.compareTo("Z");

        if (a==true||b==1 && e==true||d==-1 ) {
            System.out.println("Letter");
        } else if (f==true||g==1 && h==true||i==-1) {
            System.out.println("letter");
        } else {
            System.out.println("number");
        }

    }
}
/* 
OutPut of a program

Input a character: a
You have entered a
Letter

Input a character: A
You have entered A
letter

Input a character: 2
You have entered 2
number
*/