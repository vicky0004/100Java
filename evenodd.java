import java.util.Scanner;

public class evenodd {
    public static void main(String []args){
        Scanner scr = new Scanner(System.in);
        System.out.print("enter hte number: ");
        int num = scr.nextInt();
        if(num%2 == 0){
            if (num==0)
                System.out.println("Zero");
            else
                System.out.println("number is even");
        }
        else
            System.out.println("number is odd");


    }
}

