import java.util.Scanner;

public class Statement7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Month and Year : ");
        int month = obj.nextInt();
        int year = obj.nextInt();
        switch (month) {
            case 1:
                System.out.println(31);
                break;
            case 2:
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println("leap year days are: "+29);
                        } else {
                            System.out.println(28);
                        }

                    } else {
                        System.out.println("leap year days are:"+29);
                    }

                } else {
                    System.out.println(28);
                }
                break;
            case 3:
                System.out.println(31);
                break;
            case 4:
                System.out.println(30);
                break;
            case 5:
                System.out.println(31);
                break;
            case 6:
                System.out.println(30);
                break;
            case 7:
                System.out.println(31);
                break;
            case 8:
                System.out.println(31);
                break;
            case 9:
                System.out.println(30);
                break;
            case 10:
                System.out.println(31);
                break;
            case 11:
                System.out.println(30);
                break;
            case 12:
                System.out.println(31);
                break;

            default:
                System.out.println("invalid month");
                break;
        }

        obj.close();
        ;
    }
}
/*
Enter Month and Year : 
1
2024
31


Enter Month and Year : 
2
2023
28

Enter Month and Year : 
2
2024
leap year days are:29


Enter Month and Year : 
3
2024
31*/