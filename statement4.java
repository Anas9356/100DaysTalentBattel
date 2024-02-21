//Day 4 coding Statement:  Write a program to identify of the a number is positive or negative
import java.util.*;
class statement4 {
    public static void main(String[] args) {
    System.out.println("Enter a Number");
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
System.out.println("You Entered "+a+"\n");


if(a>0){
    System.out.println("Positive Number "+a+"\n");    
    
}else if(a<0){
    System.out.println("Negative Number "+a+"\n");    

}
else{
    System.out.println("Neither positive nor negative "+a+"\n"); 
}

obj.close();

    
}
}
