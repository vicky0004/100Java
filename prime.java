import java.util.Scanner;

public class prime {
    public static void main(String []args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = scr.nextInt();
        int flag = 0;

        if (num < 2)
            System.out.println(num + " is not a prime number");
        else{
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        if(flag==0)
            System.out.println(num+ " is a prime number.");
        else
            System.out.println(num+ " is not a prime number");


    }
}
