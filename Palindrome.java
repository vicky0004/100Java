import java.util.Scanner;

public class Palindrome {
    public static void main(String []args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num= scr.nextInt();
        int rev = reverse(num);
        if(rev==num){
            System.out.println(num+" is palindrome number.");
        }
        else
            System.out.println(num+" is not a palindrome number.");
    }
    static int reverse(int num){
        int temp =num;
        int rev=0;
        while(temp!=0){
            rev = rev*10 + temp%10;
            temp =temp/10;
        }
        return rev;
    }
}
