
import java.util.Scanner;
class statement1 {
    public static void main(String[] args)   
{   
Scanner sc = new Scanner(System.in);   
System.out.print("Input a character: ");  
// reading a character   
String c = sc.next(); 
System.out.println("You have entered "+c);   

if(c=="a"||c=="e"||c=="i"||c=="o"||c=="u"){
            System.out.println("Vowel");
        }
        else if(c=="A"||c=="E"||c=="I"||c=="O"||c=="U"){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }

}   
}